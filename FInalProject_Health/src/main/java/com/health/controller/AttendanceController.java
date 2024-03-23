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
		Attendance modelMap = service.AttendList();
		model.addAttribute("attend", modelMap);

		return "attendance";
	}

	@RequestMapping("/insertAttendance")
	public String insertAttendance(Model model, HttpSession session, HttpServletRequest request) {
		session = request.getSession();
		Member member = (Member) session.getAttribute("member");
		int userNo = member.getUserNo();
		System.out.println("getNo : " + userNo);
		
		service.insertAttend(userNo);
		service.updateAttend(userNo);
		
		return "redirect:attendance";
	}

}
