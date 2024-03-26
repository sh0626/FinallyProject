package com.health.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.health.domain.Attendance;
import com.health.domain.Member;
import com.health.service.AttendanceService;

@Controller
public class AttendanceController {
	@Autowired
	private AttendanceService service;

	@RequestMapping("/attendance")
	public String attendance(Model model) {
		return "attendance";
	}

	@RequestMapping("/insertAttendance")
	public String insertAttendance(Model model, HttpSession session, HttpServletRequest request) {
		// 세션에 저장된 값을 들고옴
		session = request.getSession();
		Member member = (Member) session.getAttribute("member");
		int userNo = member.getUserNo();
		System.out.println("getNo : " + userNo);

		// insert문과 update문 둘다 실행
		service.insertAttend(userNo);
		service.updateAttend(userNo);
		
		// 데이터 들고와서 front에 쏴줌 - select
		Attendance modelMap = service.AttendList();
		model.addAttribute("attend", modelMap);

		return "forward:WEB-INF/views/insertAttendance.jsp";

	}

}
