package com.health.controller;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.health.domain.Locker;
import com.health.domain.Pt;
import com.health.domain.RegInfo;
import com.health.domain.User;
import com.health.service.UserService;

@Controller
public class UserController {
	
		@Autowired
		private UserService userService;
		

		@RequestMapping(value = {"/userDetail"}, method=RequestMethod.GET)
		public String userDetail(Model model, int userNo) {
			
			
			User user = userService.getUser(userNo);
			List<RegInfo> regInfo= userService.getReginfo(userNo);	
			model.addAttribute("user", user);
			model.addAttribute("regInfo", regInfo);
			return "userDetail";
		}
		
		@RequestMapping(value = {"/userList"}, method=RequestMethod.GET)
		public String userList(Model model) {
			
			List<User> uList = userService.userList();
			
			model.addAttribute("uList", uList);
			
			return "userList";
			
		}
		
		
		@RequestMapping("/updateUser")
		public String updateUser(Model model, Integer userNo, String userName, String age, 
				String phone1, String phone2, String phone3, Integer FK_user_locker,
				Date lockerRegDate, Date lockerDdate) {
			
			// , int userNo, String userName, String age, String phone1, String phone2, String phone3, String FK_user_locker
			// , Timestamp lockerRegDate, Timestamp lockerDdate
			
			
			User user= new User();
			user.setUserName(userName); 
			user.setAge(age); 
			user.setPhone1(phone1);			  
			user.setPhone2(phone2); 
			user.setPhone3(phone3);
			user.setFK_user_locker(FK_user_locker); 
			user.setUserNo(userNo);
  			 System.out.println("user:"+user.getUserNo());
			  
			  userService.updateUser(user); //userService.updatePt(pt);
			  //userService.updateLocker(locker);
			  
			  Locker locker =new Locker();
			  locker.setLockerNo(FK_user_locker);
			  locker.setLockerRegDate(lockerRegDate);
			  locker.setLockerDdate(lockerDdate);
			  
			  userService.updateLocker(locker);
			 
			return "redirect:userDetail?userNo="+ user.getUserNo();
		
		}	
}
