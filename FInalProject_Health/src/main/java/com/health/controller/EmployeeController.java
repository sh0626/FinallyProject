package com.health.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class EmployeeController {
	@RequestMapping(value = "/employeeDetail")
	public String employeeDetail() {

		return "employeeDetail";
	}
}
