package com.wellsfargo.batch7.ibs.model;

public class TransferFund {
	private long fromAccountNo;
	private long toAccountNo;
	private double transferAmount;
	private String transactionPassword;
	
	public TransferFund() {
		
	}

	public TransferFund(long fromAccountNo, long toAccountNo, double transferAmount, String transactionPassword) {
		super();
		this.fromAccountNo = fromAccountNo;
		this.toAccountNo = toAccountNo;
		this.transferAmount = transferAmount;
		this.transactionPassword = transactionPassword;
	}

	public long getFromAccountNo() {
		return fromAccountNo;
	}

	public void setFromAccountNo(long fromAccountNo) {
		this.fromAccountNo = fromAccountNo;
	}

	public long getToAccountNo() {
		return toAccountNo;
	}

	public void setToAccountNo(long toAccountNo) {
		this.toAccountNo = toAccountNo;
	}

	public double getTransferAmount() {
		return transferAmount;
	}

	public void setTransferAmount(double transferAmount) {
		this.transferAmount = transferAmount;
	}

	public String getTransactionPassword() {
		return transactionPassword;
	}

	public void setTransactionPassword(String transactionPassword) {
		this.transactionPassword = transactionPassword;
	}
	
	
	

}
