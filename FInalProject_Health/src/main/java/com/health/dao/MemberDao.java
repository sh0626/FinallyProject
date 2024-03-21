package com.health.dao;

import com.health.domain.Member;

public interface MemberDao {

	// 한 명의 회원 정보를 반환하는 메서드
	public Member getMember(String id);
	
}
