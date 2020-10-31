package com.wellsfargo.batch7.group1.IBS.dto;

public class IBSExecutives {
	
	private Integer executiveID;
	private String executiveFirstName;
	private String executiveLastName;
	private String executivePhoneNo;
	
	public IBSExecutives(Integer executiveID, String executiveFirstName, String executiveLastName,
			String executivePhoneNo) {
		super();
		this.executiveID = executiveID;
		this.executiveFirstName = executiveFirstName;
		this.executiveLastName = executiveLastName;
		this.executivePhoneNo = executivePhoneNo;
	}

	public Integer getExecutiveID() {
		return executiveID;
	}

	public void setExecutiveID(Integer executiveID) {
		this.executiveID = executiveID;
	}

	public String getExecutiveFirstName() {
		return executiveFirstName;
	}

	public void setExecutiveFirstName(String executiveFirstName) {
		this.executiveFirstName = executiveFirstName;
	}

	public String getExecutiveLastName() {
		return executiveLastName;
	}

	public void setExecutiveLastName(String executiveLastName) {
		this.executiveLastName = executiveLastName;
	}

	public String getExecutivePhoneNo() {
		return executivePhoneNo;
	}

	public void setExecutivePhoneNo(String executivePhoneNo) {
		this.executivePhoneNo = executivePhoneNo;
	}
	
}
