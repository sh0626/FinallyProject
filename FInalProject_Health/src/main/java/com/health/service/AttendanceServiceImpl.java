package com.health.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.health.dao.AttendanceDAO;
import com.health.domain.Attendance;

@Service
public class AttendanceServiceImpl implements AttendanceService {
	@Autowired
	private AttendanceDAO attendanceDAO;

	@Override
	public Attendance AttendList() {
		return attendanceDAO.AttendList();
		
	}

	@Override
	public void insertAttend(int userNo) {
		// TODO Auto-generated method stub
		attendanceDAO.insertAttend(userNo);
	}

	@Override
	public void updateAttend(int userNo) {
		// TODO Auto-generated method stub
		attendanceDAO.updateAttend(userNo);
	}
	

}
