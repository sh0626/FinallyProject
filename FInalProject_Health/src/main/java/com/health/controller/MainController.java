package com.health.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

	@RequestMapping(value = { "/", "/main" }, method = RequestMethod.GET)
	public String Main() {

		return "main";
	}
	
	@RequestMapping("/calendar")
	public String Calendar() {

		return "fullCalendar";
	}

}
