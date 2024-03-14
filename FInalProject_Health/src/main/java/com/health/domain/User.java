package com.health.domain;

import com.google.protobuf.Timestamp;

public class User {
	private int userNo;
	private String userName;
	private String age;
	private String gender;
	private Timestamp regDate;
	private String phone1;
	private String phone2;
	private String phone3;
	private int possessNum;
	private int totalNum;

	public User() {
	}

	public User(int userNo, String userName, String age, String gender, Timestamp regDate, String phone1, String phone2,
			String phone3, int possessNum, int totalNum) {
		this.userNo = userNo;
		this.userName = userName;
		this.age = age;
		this.gender = gender;
		this.regDate = regDate;
		this.phone1 = phone1;
		this.phone2 = phone2;
		this.phone3 = phone3;
		this.possessNum = possessNum;
		this.totalNum = totalNum;
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

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Timestamp getRegDate() {
		return regDate;
	}

	public void setRegDate(Timestamp regDate) {
		this.regDate = regDate;
	}

	public String getPhone1() {
		return phone1;
	}

	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}

	public String getPhone2() {
		return phone2;
	}

	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}

	public String getPhone3() {
		return phone3;
	}

	public void setPhone3(String phone3) {
		this.phone3 = phone3;
	}

	public int getPossessNum() {
		return possessNum;
	}

	public void setPossessNum(int possessNum) {
		this.possessNum = possessNum;
	}

	public int getTotalNum() {
		return totalNum;
	}

	public void setTotalNum(int totalNum) {
		this.totalNum = totalNum;
	}

}