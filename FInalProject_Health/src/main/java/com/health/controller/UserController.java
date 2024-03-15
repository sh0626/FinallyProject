package com.health.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.health.domain.User;
import com.health.service.UserService;

@Controller
public class UserController {
	
		@Autowired
		private UserService userService;
		
		public void setUserService(UserService userService) {
			this.userService = userService;
		}
	
		@RequestMapping(value = {"/userDetail"}, method=RequestMethod.GET)
		public String userDetail(Model model, int userNo) {
			
			User user = userService.getUser(userNo);
			
			model.addAttribute("user", user);
			
			return "userDetail";
		}
		
		@RequestMapping(value = {"/userList"}, method=RequestMethod.GET)
		public String userList(Model model) {
			
			List<User> uList = userService.userList();
			
			model.addAttribute("uList", uList);
			
			return "userList";
			
		}
	
}
