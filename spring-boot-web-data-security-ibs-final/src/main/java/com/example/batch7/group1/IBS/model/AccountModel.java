package com.example.batch7.group1.IBS.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;




public class AccountModel {
	
	
	//private CustomerModel UCI;
	
	private Long UCI;
	   
	/*@NotNull(message="AcctNumer is mandate")
	@NotBlank(message="AcctNumber is mandate")*/
	private Long acctNumber;
	
	@NotNull(message="Accttype is mandate")
	@NotBlank(message="Accttype is mandate")
	private String acctType;

	/*@NotNull(message="Acctbalance is mandate")
	@NotBlank(message="Acctbalance is mandate")*/
	private double acctBalance;
	
	private double depositAmount;
	
	/*private double debitCreditAmount;
	private LocalDate transactionDate;*/
	
	private String acctStatus;
	
	private Long benefAcctNo;
	//private Double transferAmount;
	private String transPwd;
	
	//svc pvdr acct no
	private Long accountNumber;
	
    public AccountModel() {
		
	}

    

   public String getAcctStatus() {
		return acctStatus;
	}



	public void setAcctStatus(String acctStatus) {
		this.acctStatus = acctStatus;
	}


public double getDepositAmount() {
		return depositAmount;
	}



	public void setDepositAmount(double depositAmount) {
		this.depositAmount = depositAmount;
	}



public Long getUCI() {
		return UCI;
	}

	public void setUCI(Long UCI) {
		this.UCI=UCI;
	}

    public Long getAcctNumber() {
		return acctNumber;
	}

	public void setAcctNumber(Long acctNumber) {
		this.acctNumber = acctNumber;
	}


	public String getAcctType() {
		return acctType;
	}

	public void setAcctType(String acctType) {
		this.acctType = acctType;
	}

	public double getAcctBalance() {
		return acctBalance;
	}

	public void setAcctBalance(double acctBalance) {
		this.acctBalance = acctBalance;
	}



	public Long getBenefAcctNo() {
		return benefAcctNo;
	}



	public void setBenefAcctNo(Long benefAcctNo) {
		this.benefAcctNo = benefAcctNo;
	}



	/*
	 * public Double getTransferAmount() { return transferAmount; }
	 * 
	 * 
	 * 
	 * public void setTransferAmount(Double transferAmount) { this.transferAmount =
	 * transferAmount; }
	 */



	public String getTransPwd() {
		return transPwd;
	}



	public void setTransPwd(String transPwd) {
		this.transPwd = transPwd;
	}



	public Long getAccountNumber() {
		return accountNumber;
	}



	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}



	
	
	


}
