package com.wellsfargo.batch7.group1.IBS.dto;

import java.time.LocalDate;


public class Account implements Comparable<Account> {
	
	
	private String AcctNumber;
	private String UCI;
	private String AcctHolderName;
	private String AcctType;
	private Integer Amount;
	private Integer NewAmount;
	private LocalDate AcctOpenDate;
	private String AcctStatus;
	private LocalDate MaturityDate;
	
	
	
	
	public Account() {
		super();
	}


	

	

	public Account(String acctNumber, String uCI, String acctHolderName, String acctType, Integer amount,
			Integer newAmount, LocalDate acctOpenDate, String acctStatus, LocalDate maturityDate) {
		super();
		AcctNumber = acctNumber;
		UCI = uCI;
		AcctHolderName = acctHolderName;
		AcctType = acctType;
		Amount = amount;
		NewAmount = newAmount;
		AcctOpenDate = acctOpenDate;
		AcctStatus = acctStatus;
		MaturityDate = maturityDate;
	}






	public String getAcctNumber() {
		return AcctNumber;
	}






	public void setAcctNumber(String acctNumber) {
		AcctNumber = acctNumber;
	}






	public String getUCI() {
		return UCI;
	}






	public void setUCI(String uCI) {
		UCI = uCI;
	}






	public String getAcctHolderName() {
		return AcctHolderName;
	}






	public void setAcctHolderName(String acctHolderName) {
		AcctHolderName = acctHolderName;
	}






	public String getAcctType() {
		return AcctType;
	}






	public void setAcctType(String acctType) {
		AcctType = acctType;
	}






	public Integer getAmount() {
		return Amount;
	}






	public void setAmount(Integer amount) {
		Amount = amount;
	}






	public Integer getNewAmount() {
		return NewAmount;
	}






	public void setNewAmount(Integer newAmount) {
		NewAmount = newAmount;
	}






	public LocalDate getAcctOpenDate() {
		return AcctOpenDate;
	}






	public void setAcctOpenDate(LocalDate acctOpenDate) {
		AcctOpenDate = acctOpenDate;
	}






	public String getAcctStatus() {
		return AcctStatus;
	}






	public void setAcctStatus(String acctStatus) {
		AcctStatus = acctStatus;
	}






	public LocalDate getMaturityDate() {
		return MaturityDate;
	}






	public void setMaturityDate(LocalDate maturityDate) {
		MaturityDate = maturityDate;
	}









	@Override
	public String toString() {
		return "Account [AcctNumber=" + AcctNumber + ", UCI=" + UCI + ", AcctHolderName=" + AcctHolderName
				+ ", AcctType=" + AcctType + ", Amount=" + Amount + ", NewAmount=" + NewAmount + ", AcctOpenDate="
				+ AcctOpenDate + ", AcctStatus=" + AcctStatus + ", MaturityDate=" + MaturityDate + "]";
	}






	public int compareTo(Account o) {
		// TODO Auto-generated method stub
		if(Amount==o.Amount)  
			return 0;  
			else if(Amount>o.Amount)  
			return 1;  
			else  
			return -1; 
	}
	
}
