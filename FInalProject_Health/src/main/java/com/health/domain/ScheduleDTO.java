package com.health.domain;

public class ScheduleDTO {
	private String id;
	private String subject;
	private String startDate;
	private String endDate;
	private String memo;
	private String employeeName;

	public ScheduleDTO() {
	}

	public ScheduleDTO(String id, String subject, String startDate, String endDate, String memo,
			String employeeName) {
		this.id = id;
		this.subject = subject;
		this.startDate = startDate;
		this.endDate = endDate;
		this.memo = memo;
		this.employeeName = employeeName;
	}

	public String getemployeeName() {
		return employeeName;
	}

	public void setemployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
}
