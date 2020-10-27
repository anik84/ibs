package com.wellsfargo.batch7.group1.IBS.dto;

public class bankRepresentatives {
	
	private Integer repID;
	private String repFirstName;
	private String repLastName;
	private String repPhoneNo;
	
	public bankRepresentatives(Integer repID, String repFirstName, String repLastName, String repPhoneNo) {
		super();
		this.repID = repID;
		this.repFirstName = repFirstName;
		this.repLastName = repLastName;
		this.repPhoneNo = repPhoneNo;
	}

	public Integer getRepID() {
		return repID;
	}

	public void setRepID(Integer repID) {
		this.repID = repID;
	}

	public String getRepFirstName() {
		return repFirstName;
	}

	public void setRepFirstName(String repFirstName) {
		this.repFirstName = repFirstName;
	}

	public String getRepLastName() {
		return repLastName;
	}

	public void setRepLastName(String repLastName) {
		this.repLastName = repLastName;
	}

	public String getRepPhoneNo() {
		return repPhoneNo;
	}

	public void setRepPhoneNo(String repPhoneNo) {
		this.repPhoneNo = repPhoneNo;
	}
	
	

}
