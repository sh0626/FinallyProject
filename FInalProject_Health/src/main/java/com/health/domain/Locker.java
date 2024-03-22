package com.health.domain;

import java.sql.Timestamp;

public class Locker {
	private int lockerNo;
	private Timestamp lockerRegDate;
	private Timestamp lockerDdate;

	public Locker() {}

	public Locker(int lockerNo, Timestamp lockerRegDate, Timestamp lockerDdate) {
		this.lockerNo = lockerNo;
		this.lockerRegDate = lockerRegDate;
		this.lockerDdate = lockerDdate;
	}

	public int getLockerNo() {
		return lockerNo;
	}

	public void setLockerNo(int lockerNo) {
		this.lockerNo = lockerNo;
	}

	public Timestamp getLockerRegDate() {
		return lockerRegDate;
	}

	public void setLockerRegDate(Timestamp lockerRegDate) {
		this.lockerRegDate = lockerRegDate;
	}

	public Timestamp getLockerDdate() {
		return lockerDdate;
	}

	public void setLockerDdate(Timestamp lockerDdate) {
		this.lockerDdate = lockerDdate;
	}

	
}