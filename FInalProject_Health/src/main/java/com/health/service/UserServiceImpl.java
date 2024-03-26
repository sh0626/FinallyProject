package com.health.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

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
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	@Override
	public List<User> userList() {
		return userDao.userList();
	}
	
	@Override
	public User getUser(int userNo) {
		return userDao.getUser(userNo);
	}

	@Override
	public List<RegInfo> getReginfo(int userNo) {
		
		return userDao.getReginfo(userNo);
	}

	@Override
	public void updateUser(User user) {
		userDao.updateUser(user);
		
	}

	@Override
	public void updateLocker(Locker locker) {
		userDao.updateLocker(locker);
		
	}

	@Override
	public void insertInfo(RegInfo regInfo) {
		userDao.insertInfo(regInfo);
		
	}

	@Override
	public Locker getLocker(int userNo) {
		
		return userDao.getLocker(userNo);
	}

	@Override
	public List<Pt> getPt(int userNo) {
		return userDao.getPt(userNo);
	}

	@Override
	public void insertPt(Pt pt) {
		userDao.insertPt(pt);
		
	}

	@Override
	public List<Employee> getEmployee() {	
		return userDao.getEmployee();
	}


}
