package com.example.batch7.group1.IBS.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;




public class TransactionModel { //extends AccountModel
	
	private Integer transId;
	
	private Long acctNumber;
	private double debitCreditAmount;
	@DateTimeFormat(iso=ISO.DATE)
	private LocalDate transactionDate;
	
	
	private Long toAcctNo;
	private String transType;
	
	@DateTimeFormat(iso=ISO.DATE)
	private LocalDate fromDate;
	@DateTimeFormat(iso=ISO.DATE)
	private LocalDate toDate;
	
	private String month;
	private String year;
	
	
    public TransactionModel() {
		
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


	public LocalDate getFromDate() {
		return fromDate;
	}


	public void setFromDate(LocalDate fromDate) {
		this.fromDate = fromDate;
	}


	public LocalDate getToDate() {
		return toDate;
	}


	public void setToDate(LocalDate toDate) {
		this.toDate = toDate;
	}


	public String getMonth() {
		return month;
	}


	public void setMonth(String month) {
		this.month = month;
	}


	public String getYear() {
		return year;
	}


	public void setYear(String year) {
		this.year = year;
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
