package com.health.domain;

import java.sql.Timestamp;

public class Pt {
	private int ptNo;
	private Timestamp ptRegDate;
	private String ptPurpose;
	private int ptTotalNum;
	private int	ptPossessNum;
	private int FK_pt_user;
	private int FK_pt_employee;
	private int userNo;
	private String employeeName;
	
	public Pt() {}

	public Pt(int ptNo, Timestamp ptRegDate, String ptPurpose, int ptTotalNum, int ptPossessNum, int fK_pt_user,
			int fK_pt_employee, int userNo, String employeeName) {
		super();
		this.ptNo = ptNo;
		this.ptRegDate = ptRegDate;
		this.ptPurpose = ptPurpose;
		this.ptTotalNum = ptTotalNum;
		this.ptPossessNum = ptPossessNum;
		FK_pt_user = fK_pt_user;
		FK_pt_employee = fK_pt_employee;
		this.userNo = userNo;
		this.employeeName = employeeName;
	}

	public int getPtNo() {
		return ptNo;
	}

	public void setPtNo(int ptNo) {
		this.ptNo = ptNo;
	}

	public Timestamp getPtRegDate() {
		return ptRegDate;
	}

	public void setPtRegDate(Timestamp ptRegDate) {
		this.ptRegDate = ptRegDate;
	}

	public String getPtPurpose() {
		return ptPurpose;
	}

	public void setPtPurpose(String ptPurpose) {
		this.ptPurpose = ptPurpose;
	}

	public int getPtTotalNum() {
		return ptTotalNum;
	}

	public void setPtTotalNum(int ptTotalNum) {
		this.ptTotalNum = ptTotalNum;
	}

	public int getPtPossessNum() {
		return ptPossessNum;
	}

	public void setPtPossessNum(int ptPossessNum) {
		this.ptPossessNum = ptPossessNum;
	}

	public int getFK_pt_user() {
		return FK_pt_user;
	}

	public void setFK_pt_user(int fK_pt_user) {
		FK_pt_user = fK_pt_user;
	}

	public int getFK_pt_employee() {
		return FK_pt_employee;
	}

	public void setFK_pt_employee(int fK_pt_employee) {
		FK_pt_employee = fK_pt_employee;
	}

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	
}