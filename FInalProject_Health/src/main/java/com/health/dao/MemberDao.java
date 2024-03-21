package com.health.dao;

import com.health.domain.Member;

public interface MemberDao {

	// 한 명의 회원 정보를 반환
	public Member getMember(String id);
	
	// 회원 정보를 회원 테이블에 저장
	public void addMember(Member member);
}
