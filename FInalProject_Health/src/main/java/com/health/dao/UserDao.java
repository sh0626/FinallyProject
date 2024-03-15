package com.health.dao;

import java.util.List;

import com.health.domain.User;

public interface UserDao {
	
	// 유저 리스트를 DB에서 읽어와 반환하는 메소드
	public List<User> userList();
	
	public User getUser(int userNo);
}
