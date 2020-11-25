package com.wellsfargo.fsd.ibs.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.wellsfargo.fsd.ibs.entity.Account;

public class BeneficiariesModel {

	
	@NotNull(message="selfBenefAcctID is mandate")
	@NotBlank(message="selfBenefAcctID is mandate")
	private Account selfBenefAcctID;
	
	@NotNull(message="selfBenefAcctBalance is mandate")
	@NotBlank(message="selfBenefAcctBalance is mandate")
	private Double selfBenefAcctBalance;
	
	@NotNull(message="benefCreditCardID is mandate")
	@NotBlank(message="benefCreditCardID is mandate")
	private Integer benefCreditCardID;
	
	@NotNull(message="benefCreditCardAcctBalance is mandate")
	@NotBlank(message="benefCreditCardAcctBalance is mandate")
	private Double benefCreditCardAcctBalance;
	
	@NotNull(message="otherBenefAcctID is mandate")
	@NotBlank(message="otherBenefAcctID is mandate")
	private Integer otherBenefAcctID;
	
	@NotNull(message="otherBenefAcctBalance is mandate")
	@NotBlank(message="otherBenefAcctBalance is mandate")
	private Double otherBenefAcctBalance;
	
	@NotNull(message="custBenefuci is mandate")
	@NotBlank(message="custBenefuci is mandate")
	private Integer custBenefuci;
	
	public BeneficiariesModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BeneficiariesModel(Account selfBenefAcctID, Double selfBenefAcctBalance, Integer benefCreditCardID,
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
