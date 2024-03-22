package com.health.domain;

import java.sql.Timestamp;

public class RegInfo {
	private int regNo;
	private Timestamp infoRegDate;
	private String regType;
	private String regPoint;
	private int FK_regInfo_user;
	
	public RegInfo(int regNo, Timestamp infoRegDate, String regType, String regPoint, int fK_regInfo_user) {
		this.regNo = regNo;
		this.infoRegDate = infoRegDate;
		this.regType = regType;
		this.regPoint = regPoint;
		FK_regInfo_user = fK_regInfo_user;
	}

	public int getRegNo() {
		return regNo;
	}

	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}

	public Timestamp getInfoRegDate() {
		return infoRegDate;
	}

	public void setInfoRegDate(Timestamp infoRegDate) {
		this.infoRegDate = infoRegDate;
	}

	public String getRegType() {
		return regType;
	}

	public void setRegType(String regType) {
		this.regType = regType;
	}

	public String getRegPoint() {
		return regPoint;
	}

	public void setRegPoint(String regPoint) {
		this.regPoint = regPoint;
	}

	public int getFK_regInfo_user() {
		return FK_regInfo_user;
	}

	public void setFK_regInfo_user(int fK_regInfo_user) {
		FK_regInfo_user = fK_regInfo_user;
	}
	
	
}
