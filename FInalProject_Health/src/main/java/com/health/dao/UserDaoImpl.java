package com.health.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.health.domain.User;

@Repository
public class UserDaoImpl implements UserDao {
	
	// 정의한 Mapper namespace를 상수로 정의
	private final String NAME_SPACE = "com.health.mapper.UserMapper";
	
	private SqlSessionTemplate sqlSession;
	
	@Autowired
	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	@Override
	public List<User> userList() {
		return sqlSession.selectList(NAME_SPACE +".userList");
	}

	@Override
	public User getUser(int userNo) {
		return sqlSession.selectOne(NAME_SPACE + ".getUser", userNo);
	}
	
}
