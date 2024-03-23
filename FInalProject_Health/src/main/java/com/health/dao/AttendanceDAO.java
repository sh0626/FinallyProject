package com.health.dao;

import com.health.domain.Attendance;

public interface AttendanceDAO {
	Attendance AttendList();

	void insertAttend(int userNo);
	void updateAttend(int userNo);
}
