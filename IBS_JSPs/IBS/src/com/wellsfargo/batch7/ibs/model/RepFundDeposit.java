package com.wellsfargo.batch7.ibs.model;

public class RepFundDeposit {
	private long accountNo;
	private double depositAmount;
	
	public RepFundDeposit() {
		
	}

	public RepFundDeposit(long accountNo, double depositAmount) {
		super();
		this.accountNo = accountNo;
		this.depositAmount = depositAmount;
	}

	public long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}

	public double getDepositAmount() {
		return depositAmount;
	}

	public void setDepositAmount(double depositAmount) {
		this.depositAmount = depositAmount;
	}
	
	

}
