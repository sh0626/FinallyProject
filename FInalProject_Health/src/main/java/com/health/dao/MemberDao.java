package com.health.dao;

import com.health.domain.Member;

public interface MemberDao {

	// id를 기반으로 한 명의 회원 정보를 반환
	public Member getMember(String id);
	
	// 회원 정보를 회원 테이블에 저장
	public void addMember(Member member);

	// 회원 정보 수정 시에 기존 비밀번호가 맞는지 체크
	public String memberPwCheck(String id);
	
	// 회원 정보를 회원 테이블에서 수정
	public void updateMember(Member Member);
}