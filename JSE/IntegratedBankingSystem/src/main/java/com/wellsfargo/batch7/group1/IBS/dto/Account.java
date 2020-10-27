package com.wellsfargo.batch7.group1.IBS.dto;



public class Account implements Comparable<Account> {
	
	
	private Integer acctNumber;
	private Integer accountUCI;
	private String acctType;
	private Integer acctBalance;
	
	
	
	
	public Account() {
		super();
	}

	public Integer getAcctNumber() {
		return acctNumber;
	}





	public void setAcctNumber(Integer acctNumber) {
		this.acctNumber = acctNumber;
	}





	public Integer getAccountUCI() {
		return accountUCI;
	}





	public void setAccountUCI(Integer accountUCI) {
		this.accountUCI = accountUCI;
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
