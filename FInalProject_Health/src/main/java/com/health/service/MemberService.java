package com.health.service;

import com.health.domain.Member;

public interface MemberService {

	// 회원 로그인을 처리하는 메서드
	public int login(String id, String pw);
	
	// 한 명의 회원 정보를 반환하는 메서드
	public Member getMember(String id);
	
	// 회원가입시 아이디 중복 체크
	public boolean overlapIdCheck(String id);
	
	// 회원정보를 회원 테이블에 저장
	public void addMember(Member member);
}
