package com.wellsfargo.fsd.ibs.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.wellsfargo.fsd.ibs.entity.Customer;

public class AccountModel {
	
	
	private Customer UCI;

	private Integer acctNumber;
	
	@NotNull(message="Accttype is mandate")
	@NotBlank(message="Accttype is mandate")
	private String acctType;

	@NotNull(message="Acctbalance is mandate")
	@NotBlank(message="Acctbalance is mandate")
	private Integer acctBalance;
	
	public AccountModel() {
		
	}

	public AccountModel(Customer uCI,Integer acctNumber, String acctType, Integer acctBalance) {
		super();
		UCI = uCI;
		this.acctNumber = acctNumber;
		this.acctType = acctType;
		this.acctBalance = acctBalance;
	}

	public Customer getUCI() {
		return UCI;
	}

	public void setUCI(Customer uCI) {
		UCI = uCI;
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
	
	


}
