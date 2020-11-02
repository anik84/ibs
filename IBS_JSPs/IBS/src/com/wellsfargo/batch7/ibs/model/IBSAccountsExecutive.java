package com.wellsfargo.batch7.ibs.model;

public class IBSAccountsExecutive {
	private String firstName;
	private String lastName;
	private String emailId;
	private String address;
	private Integer phoneNo;
	
	private IBSAccountsExecutive() {
		
	}

	public IBSAccountsExecutive(String firstName, String lastName, String emailId, String address, Integer phoneNo) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.address = address;
		this.phoneNo = phoneNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(Integer phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	

}
