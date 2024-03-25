package com.health.domain;

import java.sql.Date;

public class Locker {
	private int lockerNo;
	private int FK_user_locker;
	private Date lockerRegDate;
	private Date lockerDdate;

	public Locker() {}

	public Locker(int lockerNo, int fK_user_locker, Date lockerRegDate, Date lockerDdate) {
		super();
		this.lockerNo = lockerNo;
		FK_user_locker = fK_user_locker;
		this.lockerRegDate = lockerRegDate;
		this.lockerDdate = lockerDdate;
	}

	public int getLockerNo() {
		return lockerNo;
	}

	public void setLockerNo(int lockerNo) {
		this.lockerNo = lockerNo;
	}

	public int getFK_user_locker() {
		return FK_user_locker;
	}

	public void setFK_user_locker(int fK_user_locker) {
		FK_user_locker = fK_user_locker;
	}

	public Date getLockerRegDate() {
		return lockerRegDate;
	}

	public void setLockerRegDate(Date lockerRegDate) {
		this.lockerRegDate = lockerRegDate;
	}

	public Date getLockerDdate() {
		return lockerDdate;
	}

	public void setLockerDdate(Date lockerDdate) {
		this.lockerDdate = lockerDdate;
	}


}