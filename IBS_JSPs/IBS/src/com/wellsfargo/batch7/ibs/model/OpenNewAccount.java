package com.wellsfargo.batch7.ibs.model;

public class OpenNewAccount {
	
	private double depositAmount;
	private String accountType;
	private long accountNo;
	
	public OpenNewAccount(double depositAmount, String accountType, long accountNo) {
		super();
		this.depositAmount = depositAmount;
		this.accountType = accountType;
		this.accountNo = accountNo;
	}

	public double getDepositAmount() {
		return depositAmount;
	}

	public void setDepositAmount(double depositAmount) {
		this.depositAmount = depositAmount;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	
	

}
