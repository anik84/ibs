package com.wellsfargo.batch7.ibs.model;

public class AddOtherPeopleBenifAccount {
	private String otherPeopleBenefFullName;
	private String otherPeopleBenefAcctNo;
	
	public AddOtherPeopleBenifAccount() {
		
	}

	public AddOtherPeopleBenifAccount(String otherPeopleBenefFullName, String otherPeopleBenefAcctNo) {
		super();
		this.otherPeopleBenefFullName = otherPeopleBenefFullName;
		this.otherPeopleBenefAcctNo = otherPeopleBenefAcctNo;
	}

	public String getOtherPeopleBenefFullName() {
		return otherPeopleBenefFullName;
	}

	public void setOtherPeopleBenefFullName(String otherPeopleBenefFullName) {
		this.otherPeopleBenefFullName = otherPeopleBenefFullName;
	}

	public String getOtherPeopleBenefAcctNo() {
		return otherPeopleBenefAcctNo;
	}

	public void setOtherPeopleBenefAcctNo(String otherPeopleBenefAcctNo) {
		this.otherPeopleBenefAcctNo = otherPeopleBenefAcctNo;
	}
	
	

}
