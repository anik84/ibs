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
@Table(name="transactions")
//@Inheritance(strategy=InheritanceType.JOINED)
public class TransactionEntity{ // extends AccountEntity
	
	@Id
	@Column(name="trans_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer transId;
	
	@Column(name = "acct_number") 
	private Long acctNumber;
	
	@Column(name = "debit_credit_amount") 
	private double debitCreditAmount;
	@Column(name = "transaction_date") 
	private LocalDate transactionDate;
	
	@Column(name = "to_acct_number") 
	private Long toAcctNo;
	
	@Column(name = "transaction_type") 
	private String transType;
		
	
	public TransactionEntity() {
		
	}


	public Integer getTransId() {
		return transId;
	}


	public void setTransId(Integer transId) {
		this.transId = transId;
	}


	public Long getAcctNumber() {
		return acctNumber;
	}


	public void setAcctNumber(Long acctNumber) {
		this.acctNumber = acctNumber;
	}


	public double getDebitCreditAmount() {
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
	}


	public Long getToAcctNo() {
		return toAcctNo;
	}


	public void setToAcctNo(Long toAcctNo) {
		this.toAcctNo = toAcctNo;
	}


	public String getTransType() {
		return transType;
	}


	public void setTransType(String transType) {
		this.transType = transType;
	}

		

}
