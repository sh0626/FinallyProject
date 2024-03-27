package com.health.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.health.domain.User;
import com.health.domain.Employee;
import com.health.domain.Locker;
import com.health.domain.Pt;
import com.health.domain.RegInfo;

@Repository
public class UserDaoImpl implements UserDao {
	
	// 정의한 Mapper namespace를 상수로 정의
	private final String NAME_SPACE = "com.health.mapper.UserMapper";
	
	private SqlSessionTemplate sqlSession;
	
	@Autowired
	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	// 직원 목록 조회
	@Override
	public List<Employee> getEmployee() {
		return sqlSession.selectList(NAME_SPACE + ".getEmployee");
	}

	// 사용자 목록 조회
	@Override
	public List<User> userList() {
		return sqlSession.selectList(NAME_SPACE + ".userList");
	}

	// 특정 사용자 정보 조회
	@Override
	public User getUser(int userNo) {
		return sqlSession.selectOne(NAME_SPACE + ".getUser", userNo);
	}

	// 사용자의 사물함 정보 조회
	@Override
	public Locker getLocker(int userNo) {
		return sqlSession.selectOne(NAME_SPACE + ".getLocker", userNo);
	}

	// 사용자의 등록 정보 조회
	@Override
	public List<RegInfo> getReginfo(int userNo) {
		return sqlSession.selectList(NAME_SPACE + ".getUserRegdata", userNo);
	}

	// 사용자의 PT 정보 조회
	@Override
	public List<Pt> getPt(int userNo) {
		return sqlSession.selectList(NAME_SPACE + ".getUserPt", userNo);
	}

	// 회원권 등록
	@Override
	public void insertInfo(RegInfo regInfo) {
		sqlSession.insert(NAME_SPACE + ".addInfo", regInfo);
		sqlSession.insert(NAME_SPACE + ".plusInfo", regInfo);
	}

	// 사용자 정보 수정
	@Override
	public void updateUser(User user) {
		sqlSession.update(NAME_SPACE + ".updateUser", user);
	}

	// PT 등록
	@Override
	public void insertPt(Pt pt) {
		sqlSession.insert(NAME_SPACE + ".addPt", pt);
		sqlSession.update(NAME_SPACE + ".updatePt", pt);
		sqlSession.update(NAME_SPACE + ".plusPt", pt);
	}

	// 사물함 정보 수정
	@Override
	public void updateLocker(Locker locker) {
		sqlSession.update(NAME_SPACE + ".updateLocker", locker);
	}

	// PT 정보 삭제
	@Override
	public void deletePt(Pt pt) {
		sqlSession.delete(NAME_SPACE + ".deletePt", pt);
		sqlSession.update(NAME_SPACE + ".updatePt2", pt);
	}

	// 이용권 정보 수정
	@Override
	public void updateNum(User user) {
		sqlSession.update(NAME_SPACE + ".updateNum", user);
	}

	// 사물함 중복 확인
	@Override
	public User overlapLocker(int FK_user_locker) {
		return sqlSession.selectOne(NAME_SPACE + ".overlapLocker", FK_user_locker);
	}
}
