package com.health.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.health.domain.ScheduleDTO;
import com.health.service.ScheduleService;

@Controller
public class ScheduleController {

	@Autowired
	private ScheduleService service;

	// 일정 관리 페이지
	@RequestMapping(value = "/schedule")
	public String schedule(Model model) throws Exception {

		model.addAttribute("showSchedule", service.showSchedule());

		return "/schedule";
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