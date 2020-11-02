package com.wellsfargo.batch7.ibs.model;

public class PayUtilityBill {
	private long fromAccountNo;
	private long serviceProviderAccount;
	private double billAmount;
	private String transactionPassword;
	
	public PayUtilityBill() {
		
	}

	public PayUtilityBill(long fromAccountNo, long serviceProviderAccount, double billAmount,
			String transactionPassword) {
		super();
		this.fromAccountNo = fromAccountNo;
		this.serviceProviderAccount = serviceProviderAccount;
		this.billAmount = billAmount;
		this.transactionPassword = transactionPassword;
	}

	public long getFromAccountNo() {
		return fromAccountNo;
	}

	public void setFromAccountNo(long fromAccountNo) {
		this.fromAccountNo = fromAccountNo;
	}

	public long getServiceProviderAccount() {
		return serviceProviderAccount;
	}

	public void setServiceProviderAccount(long serviceProviderAccount) {
		this.serviceProviderAccount = serviceProviderAccount;
	}

	public double getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}

	public String getTransactionPassword() {
		return transactionPassword;
	}

	public void setTransactionPassword(String transactionPassword) {
		this.transactionPassword = transactionPassword;
	}
	
	

}
