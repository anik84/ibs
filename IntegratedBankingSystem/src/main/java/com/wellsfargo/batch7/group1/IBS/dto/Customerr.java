package com.wellsfargo.batch7.group1.IBS.dto;

import java.awt.Image;

public class Customerr {
	
	private Integer UCI;
	private String custFirstName;
	private String custLastName;
	private String custAddress;
	private String custPhoneNo;
	private String password;
	private Boolean isReqApproved;
	private String userStatus;
	private Image BLOB;
	private Boolean emailSent;
	
	
	
	public Customerr() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customerr(Integer uCI, String custFirstName, String custLastName, String custAddress, String custPhoneNo,
			String password, Boolean isReqApproved, String userStatus, Image bLOB, Boolean emailSent) {
		super();
		UCI = uCI;
		this.custFirstName = custFirstName;
		this.custLastName = custLastName;
		this.custAddress = custAddress;
		this.custPhoneNo = custPhoneNo;
		this.password = password;
		this.isReqApproved = isReqApproved;
		this.userStatus = userStatus;
		BLOB = bLOB;
		this.emailSent = emailSent;
	}

	public Integer getUCI() {
		return UCI;
	}

	public void setUCI(Integer uCI) {
		UCI = uCI;
	}

	public String getCustFirstName() {
		return custFirstName;
	}

	public void setCustFirstName(String custFirstName) {
		this.custFirstName = custFirstName;
	}

	public String getCustLastName() {
		return custLastName;
	}

	public void setCustLastName(String custLastName) {
		this.custLastName = custLastName;
	}

	public String getCustAddress() {
		return custAddress;
	}

	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}

	public String getCustPhoneNo() {
		return custPhoneNo;
	}

	public void setCustPhoneNo(String custPhoneNo) {
		this.custPhoneNo = custPhoneNo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getIsReqApproved() {
		return isReqApproved;
	}

	public void setIsReqApproved(Boolean isReqApproved) {
		this.isReqApproved = isReqApproved;
	}

	public String getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}

	public Image getBLOB() {
		return BLOB;
	}

	public void setBLOB(Image bLOB) {
		BLOB = bLOB;
	}

	public Boolean getEmailSent() {
		return emailSent;
	}

	public void setEmailSent(Boolean emailSent) {
		this.emailSent = emailSent;
	}
	
	
	
	

}
