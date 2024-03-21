package com.health.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.health.domain.Member;
import com.health.service.MemberService;

@Controller
@SessionAttributes("member")
public class MemberController {

	private MemberService memberService;

	@Autowired
	public void setMemberService(MemberService memberService) {
		this.memberService = memberService;
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(Model model, @RequestParam("userId") String id, @RequestParam("pw") String pw,
			HttpSession session, HttpServletResponse response) throws ServletException, IOException {

		int result = memberService.login(id, pw);

		if (result == -1) {
			response.setContentType("text/html; charset=utf-8");
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println(" alert('존재하지 않는 아이디 입니다.');");
			out.println(" history.back();");
			out.println("</script>");

			return null;

		} else if (result == 0) {
			response.setContentType("text/html; charset=utf-8");
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println(" alert('비밀번호가 다릅니다.');");
			System.out.println(result);
			out.println(" location.href='loginForm'");
			out.println("</script>");

			return null;
		}

		Member member = memberService.getMember(id);
		session.setAttribute("isLogin", true);

		model.addAttribute("member", member);
		System.out.println("member.userName : " + member.getUserName());
		System.out.println("member.user권한 : " + member.getAuthority());

		return "redirect:/main";
	}

	@RequestMapping("/logout")
	public String logout(HttpSession session) {

		session.invalidate();

		return "redirect:/main";
	}
	
	@RequestMapping("/joinResult")
	public String joinResult(Model model, Member member, String authority, String id, String pw1, String userName, 
									String phone1, String phone2, String phone3, String gender, String age, String regPoint) {
		member.setAuthority(authority);
		member.setUserName(userName);
		member.setId(id);
		member.setPw(pw1);
		member.setPhone1(phone1);
		member.setPhone2(phone2);
		member.setPhone3(phone3);
		member.setGender(gender);
		member.setAge(age);
		member.setRegPoint(regPoint);
		
		memberService.addMember(member);
		System.out.println("joinResult : " + member.getUserName());
		
		return "redirect:loginForm";
	}
	
	@RequestMapping("/overIdCheck")
	public String overlapIdCheck(Model model, String id) {
		boolean overlap = memberService.overlapIdCheck(id);
		
		model.addAttribute("id", id);
		model.addAttribute("overlap", overlap);
		
		return "forward:WEB-INF/views/memver/overlapIdCheck.jsp";
	}
}
