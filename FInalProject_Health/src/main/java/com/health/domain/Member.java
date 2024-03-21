package com.health.domain;

import java.sql.Timestamp;

public class Member {
	
	private String userName, age, gender, phone1, phone2, phone3, authority, id, pw, regPoint;
	private int userNo, possessNum, totalNum;
	private Timestamp regDate;

	public Member() {}

	public Member(String userName, String age, String gender, String phone1, String phone2, String phone3, String regPoint,
			String authority, String id, String pw, int userNo, int possessNum, int totalNum, Timestamp regDate) {
		super();
		this.userName = userName;
		this.age = age;
		this.gender = gender;
		this.phone1 = phone1;
		this.phone2 = phone2;
		this.phone3 = phone3;
		this.authority = authority;
		this.id = id;
		this.pw = pw;
		this.userNo = userNo;
		this.possessNum = possessNum;
		this.totalNum = totalNum;
		this.regDate = regDate;
		this.regPoint = regPoint;
	}


	public String getRegPoint() {
		return regPoint;
	}

	public void setRegPoint(String regPoint) {
		this.regPoint = regPoint;
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

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
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

	public Timestamp getRegDate() {
		return regDate;
	}

	public void setRegDate(Timestamp regDate) {
		this.regDate = regDate;
	}

	
}
