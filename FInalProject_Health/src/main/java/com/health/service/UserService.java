package com.health.service;

import java.util.List;

import com.health.domain.User;

public interface UserService {
	
	public List<User> userList();
	
	public User getUser(int userNo);
}
