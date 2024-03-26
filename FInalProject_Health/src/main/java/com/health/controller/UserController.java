package com.health.controller;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.health.dao.UserDao;
import com.health.domain.Employee;
import com.health.domain.Locker;
import com.health.domain.Pt;
import com.health.domain.RegInfo;
import com.health.domain.User;
import com.health.service.UserService;

@Controller
public class UserController {
	
		@Autowired
		private UserService userService;
		
		@RequestMapping(value = {"/addInfo"}, method=RequestMethod.GET)
		public String addInfo(Model model, int userNo) {
			
			java.util.Date currentDate = new java.util.Date();
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			String date = dateFormat.format(currentDate);
			User user = userService.getUser(userNo);
			System.out.println(user);
			model.addAttribute("user", user);
			model.addAttribute("date", date);
			return "addInfo";
		}
		
		@PostMapping("/addInfoProcess")
		public String inserInfo(RegInfo regInfo) {
			userService.insertInfo(regInfo);
			int userNo = regInfo.getFK_regInfo_user();
			return "redirect:userDetail?userNo="+userNo;
		}
		
		@RequestMapping(value = {"/addPt"}, method=RequestMethod.GET)
		public String addpt(Model model, int userNo) {
			
			java.util.Date currentDate = new java.util.Date();
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			String date = dateFormat.format(currentDate);
			User user = userService.getUser(userNo);
			List<Employee> employee = userService.getEmployee(); 
			
			model.addAttribute("employee", employee);
			model.addAttribute("user", user);
			model.addAttribute("date", date);
			return "addPt";
		}

		@PostMapping("/addPtProcess")
		public String inserPt(Pt pt) {
			userService.insertPt(pt);
			int userNo = pt.getFK_pt_user();
			return "redirect:userDetail?userNo="+userNo;
		}
		
		@RequestMapping(value = {"/userDetail"}, method=RequestMethod.GET)
		public String userDetail(Model model, int userNo) {
			
			User user = userService.getUser(userNo);
			Locker locker = userService.getLocker(userNo);
			List<RegInfo> regInfo= userService.getReginfo(userNo);	
			List<Pt> pt = userService.getPt(userNo);
			model.addAttribute("user", user);
			model.addAttribute("locker", locker);
			model.addAttribute("regInfo", regInfo);
			model.addAttribute("pt", pt);
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
		
		@PostMapping("/deletePtProcess")
		public String deletePtProcess(Pt pt) {
			userService.deletePt(pt);
			
			return "redirect:userDetail?userNo="+ pt.getUserNo();
		}
		
		@PostMapping("/updateNum")
		public String updateNum(User user) {
			userService.updateNum(user);
			
			return "redirect:userDetail?userNo="+ user.getUserNo();
		}
		
}
