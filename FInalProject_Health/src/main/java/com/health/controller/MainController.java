package com.health.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

	@RequestMapping(value={"/", "/main"}, method=RequestMethod.GET)
	public String Main() {
		
		// 1. 입력
		// 2. 요청에 대한 처리를 하고 결과 데이터 - 게시 글 리스트 - 모델(model)
		// 3. 뷰에 결과를 출력
		// 뷰의 이름으로 간주 - viewResolver 설정의 prefix, suffix를 조합해서 물리적인 뷰의 이름이 결정 
		// /WEB-INF/index.jsp?body=views/ + boardList + .jsp
		return "main";
	}
}
