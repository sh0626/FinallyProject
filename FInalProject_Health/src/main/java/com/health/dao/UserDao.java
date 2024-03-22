package com.health.dao;

import java.util.List;

import org.springframework.ui.Model;

import com.health.domain.User;
import com.health.domain.Locker;
import com.health.domain.Pt;
import com.health.domain.RegInfo;

public interface UserDao {
	
	// 유저 리스트를 DB에서 읽어와 반환하는 메소드
	List<User> userList();
	
	User getUser(int userNo);
	
	List<RegInfo> getReginfo(int userNo);
	
	void updateUser(User user);
	
	void updatePt(Pt pt);
	
	void updateLocker(Locker locker);
}
