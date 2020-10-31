package com.wellsfargo.batch7.group1.IBS.dto;



public class Account implements Comparable<Account> {
	
	
	private Integer acctNumber;
	private String acctType;
	private Integer acctBalance;
	private Long accountUCI;
	Customerr c;
	
	public Account() {
		
	}
	
	
	
	public Account(Integer acctNumber, String acctType, Integer acctBalance, Long accountUCI, Customerr c) {
		super();
		this.acctNumber = acctNumber;
		this.acctType = acctType;
		this.acctBalance = acctBalance;
		this.accountUCI = accountUCI;
		this.c = c;
	}



	public Account(Integer acctBalance,Integer acctNumber) {
		super();
		this.acctBalance = acctBalance;
		this.acctNumber = acctNumber;
	}

	public Account(Integer acctNumber, String acctType, Integer acctBalance, Long accountUCI) {
		super();
		this.acctNumber = acctNumber;
		this.acctType = acctType;
		this.acctBalance = acctBalance;
		this.accountUCI = accountUCI;
	}

	public Integer getAcctNumber() {
		return acctNumber;
	}



	public void setAcctNumber(Integer acctNumber) {
		this.acctNumber = acctNumber;
	}



	public String getAcctType() {
		return acctType;
	}



	public void setAcctType(String acctType) {
		this.acctType = acctType;
	}



	public Integer getAcctBalance() {
		return acctBalance;
	}



	public void setAcctBalance(Integer acctBalance) {
		this.acctBalance = acctBalance;
	}



	public Long getAccountUCI() {
		return accountUCI;
	}



	public void setAccountUCI(Long accountUCI) {
		this.accountUCI = accountUCI;
	}



	public int compareTo(Account o) {
		// TODO Auto-generated method stub
		if(acctBalance==o.acctBalance)  
			return 0;  
			else if(acctBalance>o.acctBalance)  
			return 1;  
			else  
			return -1; 
	}
	
}
