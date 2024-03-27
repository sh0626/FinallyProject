package com.health.ajax;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.health.service.MemberService;

// Ajax 요청을 처리하는 컨트롤러
@Controller
public class AjaxProcessController {
	
	@Autowired
	private MemberService memberService;
	
	// 비밀번호 확인을 위한 Ajax 요청을 처리하는 메서드
	@RequestMapping("/pwCheck.ajax")
	@ResponseBody
	public Map<String, Boolean> memberPwCheck(String id, String pw) {
		
		// 회원 비밀번호를 확인하는 서비스를 호출하여 결과를 받아옴
		boolean result = memberService.memberPwCheck(id, pw);
		
		// Map 생성
		Map<String, Boolean> map = new HashMap<String, Boolean>();
		
		// 결과를 Map에 추가
		map.put("result", result);
		
		return map;
	}
}
