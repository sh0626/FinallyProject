package com.health.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.health.domain.InBodyDTO;
import com.health.service.InBodyService;

@Controller
public class InBodyController {
	private final String DEFAULT_PATH = "/resources/upload/";
	
	@Autowired
	private InBodyService service;

	@RequestMapping(value = "/inBody")
	public String inBody(Model model, HttpServletRequest request) {

		Map<String, Object> modelMap = service.getInBody();
		model.addAllAttributes(modelMap);

		return "inBody";
	}

	@RequestMapping(value = "/inBodyWrite")
	public String inBodyWrite(Model model, HttpServletRequest request) {

		return "inBodyWrite";
	}
	
	//현재 톰캣으로 임시구동시키고 있기 때문에 
	//.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\FInalProject_Health\resources\ upload\
	//밑으로 파일이 임시로 저장 되므로 해당 파일들을 들고와서 프로젝트의 upload파일에 복사해야함
	@RequestMapping(value = "/InBodyWriteProcess", method = RequestMethod.POST)
	public String insertInBody(Model model, HttpServletRequest request, int FK_inbody_user,
			@RequestParam(value = "inbodyURL", required = false) MultipartFile multipartFile) throws IOException {
		
		System.out.println("originName : " + multipartFile.getOriginalFilename());
		System.out.println("name : " + multipartFile.getName());
		System.out.println(multipartFile);
		
		InBodyDTO inBodyDTO = new InBodyDTO();
		inBodyDTO.setFK_inbody_user(FK_inbody_user);

		if (!multipartFile.isEmpty()) {
			String filePath = request.getServletContext().getRealPath(DEFAULT_PATH);
			UUID uid = UUID.randomUUID();
			String saveName = uid.toString() + "_" + multipartFile.getOriginalFilename();
			File file = new File(filePath, saveName);
			System.out.println("insertInBody - newName : " + file.getName());
			System.out.println(filePath);
			multipartFile.transferTo(file);
			inBodyDTO.setInbodyURL(saveName);
		}
		service.insertInBody(inBodyDTO);
		return "redirect:inBody";
	}
	
	@RequestMapping("/fileDownload")
	public void download(HttpServletRequest request, 
			HttpServletResponse response) throws Exception {

		String fileName = request.getParameter("fileName");
		System.out.println("fileName : " + fileName);
		
		String filePath = 
				request.getServletContext().getRealPath(DEFAULT_PATH);
		
		File file = new File(filePath, fileName);
		System.out.println("file.getName() : " + file.getName());
		
		// 응답 데이터에 파일 다운로드 관련 컨텐츠 타입 설정이 필요하다.
		response.setContentType("application/download; charset=UTF-8");
		response.setContentLength((int) file.length());
		
		// 한글 파일명을 클라이언트로 바로 내려 보내기 때문에 URLEncoding이 필요하다.
		fileName = URLEncoder.encode(file.getName(), "UTF-8");
		System.out.println("다운로드 fileName : " + fileName);
		System.out.println(filePath);
		// 전송되는 파일 이름을 한글 그대(원본파일 이름 그대로)로 보내주기 위한 설정이다.
		response.setHeader("Content-Disposition", 
				"attachment; filename=\"" + fileName + "\";");
		
		// 파일로 전송되야 하므로 전송되는 데이터 인코딩은 바이너리로 설정해야 한다.
		response.setHeader("Content-Transfer-Encoding", "binary");
		
		// 파일을 클라이언트로 보내기 위해 응답 스트림을 구한다.
		OutputStream out = response.getOutputStream();
		FileInputStream fis = null;
		
		/* FileInputStream을 통해 클라이언트로 보낼 파일을 읽어
		 * 스프링이 제공하는 FileCopyUtils 클래스를 통해서
		 * 데이터를 읽고 응답 스트림을 통해 클라이언트로 출력한다.
		 **/
		fis = new FileInputStream(file);

		// 스프링이 제공하는 FileCopyUtils를 이용해 응답 스트림에 파일을 복사한다.
		FileCopyUtils.copy(fis,  out);
		
		if(fis != null) {
			fis.close();
		}
		
		/* 파일 데이터를 클라이언트로 출력한다.
		 * 버퍼에 남아 있는 모든 데이터를 클라이언드로 출력한다.
		 **/
		out.flush();
	}	
	
}
