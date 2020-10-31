package com.wellsfargo.batch7.group1.IBS.dto;

public class loanAccts {

	private Integer loanID;
	private Double  loanAmount;
	private String loanStatus;
	private Integer loanAcctsuci;
	
	public loanAccts(Integer loanID, Double loanAmount, String loanStatus, Integer loanAcctsuci) {
		super();
		this.loanID = loanID;
		this.loanAmount = loanAmount;
		this.loanStatus = loanStatus;
		this.loanAcctsuci = loanAcctsuci;
	}

	public Integer getLoanID() {
		return loanID;
	}

	public void setLoanID(Integer loanID) {
		this.loanID = loanID;
	}

	public Double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(Double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public String getLoanStatus() {
		return loanStatus;
	}

	public void setLoanStatus(String loanStatus) {
		this.loanStatus = loanStatus;
	}

	public Integer getLoanAcctsuci() {
		return loanAcctsuci;
	}

	public void setLoanAcctsuci(Integer loanAcctsuci) {
		this.loanAcctsuci = loanAcctsuci;
	}
	
	
	
	
	
}
