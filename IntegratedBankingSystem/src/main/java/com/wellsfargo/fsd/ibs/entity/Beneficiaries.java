package com.wellsfargo.fsd.ibs.entity;                 

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Beneficiaries")

public class Beneficiaries {
	
	@Id
	@OneToMany
	@Column(name="selfBenefAcctID")
	private Account selfBenefAcctID;
	@Column(name="selfBenefAcctBalance")
	private Double selfBenefAcctBalance;
	@Column(name="benefCreditCardID")
	private Integer benefCreditCardID;
	@Column(name="benefCreditCardAcctBalance")
	private Double benefCreditCardAcctBalance;
	@Column(name="otherBenefAcctID")
	private Integer otherBenefAcctID;
	@Column(name="otherBenefAcctBalance")
	private Double otherBenefAcctBalance;
	@Column(name="custBenefuci")
	private Integer custBenefuci;
	
	public Beneficiaries() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Beneficiaries(Account selfBenefAcctID, Double selfBenefAcctBalance, Integer benefCreditCardID,
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

	public Account getSelfBenefAcctID() {
		return selfBenefAcctID;
	}

	public void setSelfBenefAcctID(Account selfBenefAcctID) {
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
	
	

}
