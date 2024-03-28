package com.health.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.health.domain.Member;
import com.health.domain.ScheduleDTO;
import com.health.service.ScheduleService;

@Controller
public class ScheduleController {

	@Autowired
	private ScheduleService service;

	// 일정 관리 페이지
	@RequestMapping(value = "/schedule")
	public String schedule(Model model, HttpServletRequest request,
			RedirectAttributes redirectAttributes, HttpSession session) throws Exception {

		model.addAttribute("showSchedule", service.showSchedule());

        session = request.getSession();
        Member member = (Member) session.getAttribute("member");
        // 사용자가 로그인되어 있는지 확인
        if (member == null) {
            return "redirect:loginForm"; // 로그인 페이지로 리다이렉트
        } else {
        	// 권한 확인
        	if(!"0".equals(member.getAuthority())) {
        		// 로그인은 되어있지만, 권한이 0이 아닌 경우
        		redirectAttributes.addFlashAttribute("message", "관리자만 조회가 가능한 페이지입니다.");
                return "redirect:/main"; // 경고창 띄우고 메인으로 돌려보내기
        	} else {
        		// 권한이 0인 경우에만 스케줄로 보내기
        		return "schedule";
        	}
        }
	}

	// 일정 추가 팝업
	@RequestMapping(value = "/schedulePopup")
	public String test2() throws Exception {
		return "forward:WEB-INF/views/schedulePopup.jsp";
	}

	// 일정 추가 버튼 클릭 Ajax
	@RequestMapping(value = "/addSchedule", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> addSchedule(@RequestBody ScheduleDTO dto) throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();

		service.addSchedule(dto);

		return map;
	}

	// 일정 보이기 (임시)
	@RequestMapping(value = "/showSchedule")
	@ResponseBody
	public List<ScheduleDTO> showSchedule() throws Exception {

		List<ScheduleDTO> list = service.showSchedule();

		return list;
	}

}