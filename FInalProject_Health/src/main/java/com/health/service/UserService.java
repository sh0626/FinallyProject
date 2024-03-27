package com.health.service;

import java.util.List;

import org.springframework.ui.Model;

import com.health.domain.Employee;
import com.health.domain.Locker;
import com.health.domain.Pt;
import com.health.domain.RegInfo;
import com.health.domain.User;

public interface UserService {

	// 직원 목록 조회
	public List<Employee> getEmployee();

	// 사용자 목록 조회
	public List<User> userList();

	// 특정 사용자 정보 조회
	public User getUser(int userNo);

	// 사용자의 사물함 정보 조회
	public Locker getLocker(int userNo);

	// 사용자의 등록 정보 조회
	List<RegInfo> getReginfo(int userNo);

	// 사용자의 PT 정보 조회
	List<Pt> getPt(int userNo);

	// 회원권 등록
	void insertInfo(RegInfo regInfo);

	// 사용자 정보 수정
	void updateUser(User user);

	// PT 등록
	void insertPt(Pt pt);

	// 사물함 정보 수정
	void updateLocker(Locker locker);

	// PT 정보 삭제
	void deletePt(Pt pt);

	// 이용권 정보 수정
	void updateNum(User user);
}
