package com.health.domain;

import java.sql.Timestamp;

public class Journal {

	private int journalNo;
	private String journalTitle;
	private String userName;
	private Timestamp journalDate;
	private int userNo;

	public Journal() {}

	public Journal(int journalNo, String journalTitle, String userName, Timestamp journalDate, int userNo) {
		this.journalNo = journalNo;
		this.journalTitle = journalTitle;
		this.userName = userName;
		this.journalDate = journalDate;
		this.userNo = userNo;
	}

	public int getJournalNo() {
		return journalNo;
	}

	public void setJournalNo(int journalNo) {
		this.journalNo = journalNo;
	}

	public String getJournalTitle() {
		return journalTitle;
	}

	public void setJournalTitle(String journalTitle) {
		this.journalTitle = journalTitle;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Timestamp getJournalDate() {
		return journalDate;
	}

	public void setJournalDate(Timestamp journalDate) {
		this.journalDate = journalDate;
	}

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	
}