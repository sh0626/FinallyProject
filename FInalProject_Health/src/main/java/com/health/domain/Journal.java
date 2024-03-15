package com.health.domain;

import java.sql.Timestamp;

public class Journal {

	private int journalNo;
	private String journalTitle;
	private String userName;
	private Timestamp journalDate;
	private int userNo;
	private int FK_journal_user;
	
	public Journal() {}

	public Journal(int journalNo, String journalTitle, String userName, Timestamp journalDate, int userNo,
			int fK_journal_user) {
		super();
		this.journalNo = journalNo;
		this.journalTitle = journalTitle;
		this.userName = userName;
		this.journalDate = journalDate;
		this.userNo = userNo;
		FK_journal_user = fK_journal_user;
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

	public int getFK_journal_user() {
		return FK_journal_user;
	}

	public void setFK_journal_user(int fK_journal_user) {
		FK_journal_user = fK_journal_user;
	}

	
	
}