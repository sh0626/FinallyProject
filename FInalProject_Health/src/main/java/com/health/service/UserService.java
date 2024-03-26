package com.health.service;

import java.util.List;

import org.springframework.ui.Model;

import com.health.domain.Employee;
import com.health.domain.Locker;
import com.health.domain.Pt;
import com.health.domain.RegInfo;
import com.health.domain.User;

public interface UserService {
	
	public List<User> userList();
	
	public User getUser(int userNo);
	
	public Locker getLocker(int userNo);
	
	List<RegInfo> getReginfo(int userNo);
	 
	void updateUser(User user);
		
	void updateLocker(Locker locker);
	
	void insertInfo(RegInfo regInfo);
	
	List<Pt> getPt(int userNo);
	
	void insertPt(Pt pt);
	
	public List<Employee> getEmployee();
}
