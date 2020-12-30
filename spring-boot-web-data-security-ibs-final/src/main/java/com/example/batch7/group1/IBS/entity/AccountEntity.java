package com.example.batch7.group1.IBS.entity;

import java.time.LocalDate;
    

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.PrimaryKeyJoinColumn; 
import javax.persistence.SecondaryTable;

@Entity
@Table(name="account")
//@Inheritance(strategy=InheritanceType.JOINED)
//@SecondaryTable(name="transaction_details",pkJoinColumns=@PrimaryKeyJoinColumn(name="acct_number",referencedColumnName = "acct_number"))
public class AccountEntity {
	
	/*@OneToOne
	@JoinColumn(name="uid")*/
	private Long UCI;
	@Id
	@Column(name="acct_number")
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long acctNumber;
	@Column(name="Accttype")
	private String acctType;
	@Column(name="AcctBalance")
	private double acctBalance;
	@Column(name="acct_status")
	private String acctStatus;	
	
	private double depositAmount;
	
	/*@Column(table = "transaction_details") 
	private Integer AcctNumber;*/
	/*@Column(table = "transaction_details") 
	private double debitCreditAmount;
	@Column(table = "transaction_details") 
	private LocalDate transactionDate;*/
		
	
	public AccountEntity() {
		
	}

	public Long getUCI() {
		return UCI;
	}

	public void setUCI(Long uCI) {
		UCI = uCI;
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

	public double getDepositAmount() {
		return depositAmount;
	}

	public void setDepositAmount(double depositAmount) {
		this.depositAmount = depositAmount;
	}

	/*public double getDebitCreditAmount() {
		return debitCreditAmount;
	}

	public void setDebitCreditAmount(double debitCreditAmount) {
		this.debitCreditAmount = debitCreditAmount;
	}

	public LocalDate getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(LocalDate transactionDate) {
		this.transactionDate = transactionDate;
	}*/

	public String getAcctStatus() {
		return acctStatus;
	}

	public void setAcctStatus(String acctStatus) {
		this.acctStatus = acctStatus;
	}

	
	

}
