package com.wellsfargo.batch7.ibs.model;

public class UserAccountBalance {
	private long accountNo;
	private double accountBalance;
	
	public UserAccountBalance() {
		
	}

	public UserAccountBalance(long accountNo, double accountBalance) {
		super();
		this.accountNo = accountNo;
		this.accountBalance = accountBalance;
	}

	public long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	

}
