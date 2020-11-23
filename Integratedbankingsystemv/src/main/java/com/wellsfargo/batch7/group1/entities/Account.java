package com.wellsfargo.batch7.group1.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Account")

public class Account {
	
	@OneToOne
	@JoinColumn(name="uid")
	private Customer UCI;
	@Id
	@Column(name="AcctNumber",unique=true)
	private Integer acctNumber;
	@Column(name="Accttype")
	private String acctType;
	@Column(name="AcctBalance")
	private Integer acctBalance;
	
	public Account() {
		
	}

	public Account(Customer uCI, Integer acctNumber, String acctType, Integer acctBalance) {
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
