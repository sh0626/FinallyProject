package com.health.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.health.domain.Attendance;

@Repository
public class AttendanceDAOImpl implements AttendanceDAO {
	private static final String NAME_SPACE = "com.health.mapper.AttendanceMapper";

	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public Attendance AttendList() {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(NAME_SPACE + ".getAttend");
	}

	@Override
	public void insertAttend(int userNo) {
		// TODO Auto-generated method stub
		sqlSession.insert(NAME_SPACE + ".insertAttend", userNo);
	}

	@Override
	public void updateAttend(int userNo) {
		// TODO Auto-generated method stub
		sqlSession.update(NAME_SPACE + ".updateAttend", userNo);
	}

}
