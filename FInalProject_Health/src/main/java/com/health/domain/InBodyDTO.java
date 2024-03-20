package com.health.domain;

public class InBodyDTO {
	private int inbodyNo;
	private String inbodyDate;
	private String inbodyURL;
	private int FK_inbody_user;

	public InBodyDTO() {
	}

	public InBodyDTO(int inbodyNo, String inbodyDate, String inbodyURL, int FK_inbody_user) {
		super();
		this.inbodyNo = inbodyNo;
		this.inbodyDate = inbodyDate;
		this.inbodyURL = inbodyURL;
		this.FK_inbody_user = FK_inbody_user;
	}

	public int getinbodyNo() {
		return inbodyNo;
	}

	public void setinbodyNo(int inbodyNo) {
		this.inbodyNo = inbodyNo;
	}

	public String getInbodyDate() {
		return inbodyDate;
	}

	public void setInbodyDate(String inbodyDate) {
		this.inbodyDate = inbodyDate;
	}

	public String getInbodyURL() {
		return inbodyURL;
	}

	public void setInbodyURL(String inbodyURL) {
		this.inbodyURL = inbodyURL;
	}

	public int getFK_inbody_user() {
		return FK_inbody_user;
	}

	public void setFK_inbody_user(int FK_inbody_user) {
		this.FK_inbody_user = FK_inbody_user;
	}

}
