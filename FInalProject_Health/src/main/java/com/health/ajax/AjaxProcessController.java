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
	
	@RequestMapping("/pwCheck.ajax")
	@ResponseBody
	public Map<String, Boolean> memberPwCheck(String id, String pw) {
		
		boolean result = memberService.memberPwCheck(id, pw);
		Map<String, Boolean> map = new HashMap<String, Boolean>();
		map.put("result", result);
		
		return map;
	}
}
