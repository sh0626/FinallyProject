package com.health.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.health.domain.Member;

@Repository
public class MemberDaoImpl implements MemberDao {

	private SqlSessionTemplate sqlSession;
	
	private final String NAME_SPACE = "com.health.mapper.MemberMapper";
	
	@Autowired
	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	@Override
	public Member getMember(String id) {
		return sqlSession.selectOne(NAME_SPACE + ".getMember", id); 
	}
	
	@Override
	public void addMember(Member member) {
		sqlSession.insert(NAME_SPACE + ".addMember", member);
	}
}
