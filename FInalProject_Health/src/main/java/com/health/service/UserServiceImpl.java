package com.health.service;

import java.util.List;

import javax.swing.JOptionPane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.health.dao.UserDao;
import com.health.domain.Employee;
import com.health.domain.Locker;
import com.health.domain.Pt;
import com.health.domain.RegInfo;
import com.health.domain.User;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	// UserDao 의존성 주입
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	// 사용자 목록 조회
	@Override
	public List<User> userList() {
		return userDao.userList();
	}
	
	// 특정 사용자 정보 조회
	@Override
	public User getUser(int userNo) {
		return userDao.getUser(userNo);
	}

	// 사용자의 등록 정보 조회
	@Override
	public List<RegInfo> getReginfo(int userNo) {
		return userDao.getReginfo(userNo);
	}

	// 사용자 정보 수정
	@Override
	public void updateUser(User user) {
		// 다른 사용자가 해당 사물함을 사용 중인지 확인
		userDao.updateUser(user);
	}

	// 사물함 정보 수정
	@Override
	public void updateLocker(Locker locker) {
		userDao.updateLocker(locker);
	}

	// 회원권 등록
	@Override
	public void insertInfo(RegInfo regInfo) {
		userDao.insertInfo(regInfo);
	}

	// 사용자의 사물함 정보 조회
	@Override
	public Locker getLocker(int userNo) {
		return userDao.getLocker(userNo);
	}

	// 사용자의 PT 정보 조회
	@Override
	public List<Pt> getPt(int userNo) {
		return userDao.getPt(userNo);
	}

	// PT 등록
	@Override
	public void insertPt(Pt pt) {
		userDao.insertPt(pt);
	}

	// 직원 목록 조회
	@Override
	public List<Employee> getEmployee() {	
		return userDao.getEmployee();
	}

	// PT 정보 삭제
	@Override
	public void deletePt(Pt pt) {
		userDao.deletePt(pt);
	}

	// 이용권 정보 수정
	@Override
	public void updateNum(User user) {
		userDao.updateNum(user);
	}

}
