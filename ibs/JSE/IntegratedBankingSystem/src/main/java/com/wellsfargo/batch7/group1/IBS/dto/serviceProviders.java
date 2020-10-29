package com.wellsfargo.batch7.group1.IBS.dto;

import java.awt.Image;

public class serviceProviders {
	
	private Integer accountID;
	private String executiveLastName;
	private String executivePhoneNo;
	private String password;
	private Image docKYC;
	
	public serviceProviders(Integer accountID, String executiveLastName, String executivePhoneNo, String password,
			Image docKYC) {
		super();
		this.accountID = accountID;
		this.executiveLastName = executiveLastName;
		this.executivePhoneNo = executivePhoneNo;
		this.password = password;
		this.docKYC = docKYC;
	}

	public Integer getAccountID() {
		return accountID;
	}

	public void setAccountID(Integer accountID) {
		this.accountID = accountID;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Image getDocKYC() {
		return docKYC;
	}

	public void setDocKYC(Image docKYC) {
		this.docKYC = docKYC;
	}
	
	

}
