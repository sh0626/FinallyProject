package com.health.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.health.dao.UserDao;
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

}
