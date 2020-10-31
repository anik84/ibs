package com.wellsfargo.batch7.group1.IBS.dto;

public class Beneficiaries {
	
	private Integer selfBenefAcctID;
	private Double selfBenefAcctBalance;
	private Integer benefCreditCardID;
	private Double benefCreditCardAcctBalance;
	private Integer otherBenefAcctID;
	private Double otherBenefAcctBalance;
	private Integer custBenefuci;
<<<<<<< HEAD
	Customerr c;
	
	public Beneficiaries() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Beneficiaries(Integer selfBenefAcctID, Double selfBenefAcctBalance, Integer benefCreditCardID,
			Double benefCreditCardAcctBalance, Integer otherBenefAcctID, Double otherBenefAcctBalance,
			Integer custBenefuci, Customerr c) {
		super();
		this.selfBenefAcctID = selfBenefAcctID;
		this.selfBenefAcctBalance = selfBenefAcctBalance;
		this.benefCreditCardID = benefCreditCardID;
		this.benefCreditCardAcctBalance = benefCreditCardAcctBalance;
		this.otherBenefAcctID = otherBenefAcctID;
		this.otherBenefAcctBalance = otherBenefAcctBalance;
		this.custBenefuci = custBenefuci;
		this.c = c;
	}

=======
	
>>>>>>> 7dc73a75b5e18529308d1d5fd5b0675b0573d976
	public Integer getSelfBenefAcctID() {
		return selfBenefAcctID;
	}

	public void setSelfBenefAcctID(Integer selfBenefAcctID) {
		this.selfBenefAcctID = selfBenefAcctID;
	}

	public Double getSelfBenefAcctBalance() {
		return selfBenefAcctBalance;
	}

	public void setSelfBenefAcctBalance(Double selfBenefAcctBalance) {
		this.selfBenefAcctBalance = selfBenefAcctBalance;
	}

	public Integer getBenefCreditCardID() {
		return benefCreditCardID;
	}

	public void setBenefCreditCardID(Integer benefCreditCardID) {
		this.benefCreditCardID = benefCreditCardID;
	}

	public Double getBenefCreditCardAcctBalance() {
		return benefCreditCardAcctBalance;
	}

	public void setBenefCreditCardAcctBalance(Double benefCreditCardAcctBalance) {
		this.benefCreditCardAcctBalance = benefCreditCardAcctBalance;
	}

	public Integer getOtherBenefAcctID() {
		return otherBenefAcctID;
	}

	public void setOtherBenefAcctID(Integer otherBenefAcctID) {
		this.otherBenefAcctID = otherBenefAcctID;
	}

	public Double getOtherBenefAcctBalance() {
		return otherBenefAcctBalance;
	}

	public void setOtherBenefAcctBalance(Double otherBenefAcctBalance) {
		this.otherBenefAcctBalance = otherBenefAcctBalance;
	}

	public Integer getCustBenefuci() {
		return custBenefuci;
	}

	public void setCustBenefuci(Integer custBenefuci) {
		this.custBenefuci = custBenefuci;
	}

	public Beneficiaries(Integer selfBenefAcctID, Double selfBenefAcctBalance, Integer benefCreditCardID,
			Double benefCreditCardAcctBalance, Integer otherBenefAcctID, Double otherBenefAcctBalance,
			Integer custBenefuci) {
		super();
		this.selfBenefAcctID = selfBenefAcctID;
		this.selfBenefAcctBalance = selfBenefAcctBalance;
		this.benefCreditCardID = benefCreditCardID;
		this.benefCreditCardAcctBalance = benefCreditCardAcctBalance;
		this.otherBenefAcctID = otherBenefAcctID;
		this.otherBenefAcctBalance = otherBenefAcctBalance;
		this.custBenefuci = custBenefuci;
	}
	
	

}
