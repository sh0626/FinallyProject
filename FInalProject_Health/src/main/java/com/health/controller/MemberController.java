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
import org.springframework.web.bind.support.SessionStatus;

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

	// 로그인
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(Model model, @RequestParam("userId") String id, @RequestParam("pw") String pw,
			HttpSession session, HttpServletResponse response) throws ServletException, IOException {

		int result = memberService.login(id, pw);

		// 로그인 성공시
		if (result == -1) {
			response.setContentType("text/html; charset=utf-8");
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println(" history.back();");
			out.println("</script>");

			return null;

		// 로그인 실패시
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
		
		//member에 담기
		Member member = memberService.getMember(id);
		session.setAttribute("isLogin", true);
		model.addAttribute("member", member);

		return "redirect:/main";
	}

	// 로그아웃
	@RequestMapping("/logout")
	public String logout(SessionStatus sessionStatus,HttpSession session) {
		
		session.removeAttribute("id");
		
		// 세션 닫기
		sessionStatus.setComplete();
		session.invalidate();

		return "redirect:/main";
	}
	
	// 회원가입
	@RequestMapping("/joinResult")
	public String joinResult(Model model, Member member, String authority, String id, String pw1, String userName,
			String phone1, String phone2, String phone3, String gender, String age, String FK_user_point , String pw2) {
		if (!pw1.equals(pw2)) {
			model.addAttribute("error", "비밀번호가 일치하지 않습니다.");
			return "memberJoinForm";
		}
		
		member.setAuthority(authority);
		member.setUserName(userName);
		member.setPhone1(phone1);
		member.setPhone2(phone2);
		member.setPhone3(phone3);
		member.setGender(gender);
		member.setAge(age);

		member.setFK_user_point(FK_user_point);

		member.setId(id);
		member.setPw(pw1);

		memberService.addMember(member);
		System.out.println("joinResult : " + member.getUserName());

		return "redirect:loginForm";
	}

	// id 중복체크
	@RequestMapping("/overlapIdCheck")
	public String overlapIdCheck(Model model, String id) {
		
		// 아이디 중복 여부
		boolean overlap = memberService.overlapIdCheck(id);

		// 중복 여부 저장
		model.addAttribute("id", id);	
		model.addAttribute("overlap", overlap);

		return "forward:WEB-INF/views/overlapIdCheck.jsp";
	}
	
	// 마이페이지
	@RequestMapping("/mypage")
	public String updateForm(Model model, HttpSession session) {
		return "/mypage";
	}
	
	@RequestMapping("/memberUpdateResult") 
	public String memberUpdateInfo(Model model, Member member, String pw1, String phone1, String phone2, String phone3, String age) {
	member.setPw(pw1);
	member.setPhone1(phone1);
	member.setPhone2(phone2);
	member.setPhone3(phone3);
	member.setAge(age);
	
	System.out.println("memberUpdateResult : " + member.getId());
	memberService.updateMember(member);		
	model.addAttribute("member", member);
	
	return "redirect:mypage";
	}

}
