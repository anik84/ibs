package com.wellsfargo.batch7.group1.IBS.dto;

import java.time.LocalDate;


public class Transaction {

	private String TransId;
	private String AcctNumber;
	private LocalDate TransDateTime;
	private String TransType;
	private Double Amount;
	
	
	
	public Transaction() {
		super();
	}



	public Transaction(String transId, String acctNumber, LocalDate transDateTime, String transType, Double amount) {
		super();
		TransId = transId;
		AcctNumber = acctNumber;
		TransDateTime = transDateTime;
		TransType = transType;
		Amount = amount;
	}



	public String getTransId() {
		return TransId;
	}



	public void setTransId(String transId) {
		TransId = transId;
	}



	public String getAcctNumber() {
		return AcctNumber;
	}



	public void setAcctNumber(String acctNumber) {
		AcctNumber = acctNumber;
	}



	public LocalDate getTransDateTime() {
		return TransDateTime;
	}



	public void setTransDateTime(LocalDate transDateTime) {
		TransDateTime = transDateTime;
	}



	public String getTransType() {
		return TransType;
	}



	public void setTransType(String transType) {
		TransType = transType;
	}



	public Double getAmount() {
		return Amount;
	}



	public void setAmount(Double amount) {
		Amount = amount;
	}



	@Override
	public String toString() {
		return "Transaction [TransId=" + TransId + ", AcctNumber=" + AcctNumber + ", TransDateTime=" + TransDateTime
				+ ", TransType=" + TransType + ", Amount=" + Amount + "]";
	}
	
	



}