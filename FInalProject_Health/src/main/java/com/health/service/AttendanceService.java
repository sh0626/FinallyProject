package com.health.service;

import java.util.Map;

import com.health.domain.Attendance;

public interface AttendanceService {
	Attendance AttendList();

	void insertAttend(int userNo);
	void updateAttend(int userNo);
}
