package com.health.domain;

public class Attendance {
	private int userNo;
	private String userName;
	private int possessNum;
	private int attendanceNo;
	private String attendanceDate;

	public Attendance() {
		// TODO Auto-generated constructor stub
	}

	public Attendance(int userNo, String userName, int possessNum, int attendanceNo, String attendanceDate) {
		this.userNo = userNo;
		this.userName = userName;
		this.possessNum = possessNum;
		this.attendanceNo = attendanceNo;
		this.attendanceDate = attendanceDate;
	}

	public int getAttendanceNo() {
		return attendanceNo;
	}

	public void setAttendanceNo(int attendanceNo) {
		this.attendanceNo = attendanceNo;
	}

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getpossessNum() {
		return possessNum;
	}

	public void setpossessNum(int possessNum) {
		this.possessNum = possessNum;
	}

	public String getAttendanceDate() {
		return attendanceDate;
	}

	public void setAttendanceDate(String attendanceDate) {
		this.attendanceDate = attendanceDate;
	}

}
