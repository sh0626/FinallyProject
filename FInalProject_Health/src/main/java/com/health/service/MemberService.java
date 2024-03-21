package com.health.service;

import com.health.domain.Member;

public interface MemberService {

	// 회원 로그인을 처리하는 메서드
	public int login(String id, String pw);
	
	// 한 명의 회원 정보를 반환하는 메서드
	public Member getMember(String id);
	
}
