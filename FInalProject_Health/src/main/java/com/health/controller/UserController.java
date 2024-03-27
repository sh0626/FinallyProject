package com.health.controller;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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

	// 사용자 정보 추가 페이지
	@RequestMapping(value = { "/addInfo" }, method = RequestMethod.GET)
	public String addInfo(Model model, int userNo) {

		// 현재 날짜 정보 가져오기
		java.util.Date currentDate = new java.util.Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String date = dateFormat.format(currentDate);

		// 사용자 정보와 날짜를 모델에 추가하여 뷰로 전달
		User user = userService.getUser(userNo);
		model.addAttribute("user", user);
		model.addAttribute("date", date);
		return "addInfo"; // addInfo.jsp로 이동
	}

	// 사용자 정보 추가 처리
	@PostMapping("/addInfoProcess")
	public String inserInfo(RegInfo regInfo) {
		userService.insertInfo(regInfo); // 사용자 정보 추가
		int userNo = regInfo.getFK_regInfo_user();
		return "redirect:userDetail?userNo=" + userNo; // 사용자 상세 페이지로 리다이렉트
	}

	// PT 정보 추가 페이지
	@RequestMapping(value = { "/addPt" }, method = RequestMethod.GET)
	public String addpt(Model model, int userNo) {
		// 현재 날짜 정보 가져오기
		java.util.Date currentDate = new java.util.Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String date = dateFormat.format(currentDate);
		// 사용자 정보와 PT 담당자 목록을 모델에 추가하여 뷰로 전달
		User user = userService.getUser(userNo);
		List<Employee> employee = userService.getEmployee();
		model.addAttribute("employee", employee);
		model.addAttribute("user", user);
		model.addAttribute("date", date);
		return "addPt"; // addPt.jsp로 이동
	}

	// PT 정보 추가 처리
	@PostMapping("/addPtProcess")
	public String inserPt(Pt pt) {
		userService.insertPt(pt); // PT 정보 추가
		int userNo = pt.getFK_pt_user();
		return "redirect:userDetail?userNo=" + userNo; // 사용자 상세 페이지로 리다이렉트
	}

	// 사용자 상세 정보 페이지
	@RequestMapping(value = { "/userDetail" }, method = RequestMethod.GET)
	public String userDetail(Model model, int userNo) {
		// 사용자 정보, 락커 정보, 등록 정보, PT 정보를 모델에 추가하여 뷰로 전달
		User user = userService.getUser(userNo);
		Locker locker = userService.getLocker(userNo);
		List<RegInfo> regInfo = userService.getReginfo(userNo);
		List<Pt> pt = userService.getPt(userNo);
		model.addAttribute("user", user);
		model.addAttribute("locker", locker);
		model.addAttribute("regInfo", regInfo);
		model.addAttribute("pt", pt);
		return "userDetail"; // userDetail.jsp로 이동
	}

	// 사용자 목록 페이지
	@RequestMapping(value = { "/userList" }, method = RequestMethod.GET)
	public String userList(Model model) {
		// 모든 사용자 정보를 가져와 모델에 추가하여 뷰로 전달
		List<User> uList = userService.userList();
		model.addAttribute("uList", uList);
		return "userList"; // userList.jsp로 이동
	}

	// 사용자 정보 수정 처리
	@RequestMapping("/updateUser")
    public String updateUser(Model model, Integer userNo, String userName, String age, String phone1, String phone2,
            String phone3, @RequestParam(value = "FK_user_locker", required = false) Integer FK_user_locker,
            Date lockerRegDate, Date lockerDdate) {

        // 사용자 정보 업데이트
        User user = new User();
        user.setUserName(userName);
        user.setAge(age);
        user.setPhone1(phone1);
        user.setPhone2(phone2);
        user.setPhone3(phone3);
        if (!(FK_user_locker == null)) {
            user.setFK_user_locker(FK_user_locker);
        }
        user.setUserNo(userNo);
        userService.updateUser(user);

        // 락커 정보 업데이트
        Locker locker = new Locker();
        if (!(FK_user_locker == null)) {
            locker.setLockerNo(FK_user_locker);
        }
        locker.setLockerRegDate(lockerRegDate);
        locker.setLockerDdate(lockerDdate);
        userService.updateLocker(locker);

        return "redirect:userDetail?userNo=" + user.getUserNo(); // 사용자 상세 페이지로 리다이렉트
    }

}
