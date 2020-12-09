package com.iiht.training.eloan.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class LoanDto {
	
	@NotNull(message="Loan Name can't be null")
	@NotBlank(message="Loan Name can't be blank")
	private String loanName;
	
	@NotNull(message="Loan amount can't be null")
	private Double loanAmount;
	
	@NotNull(message="Application date can't be null")
	@NotBlank(message="Application date can't be blank")
	private String loanApplicationDate;
	
	@NotNull(message="Business Structure can't be null")
	@NotBlank(message="Business Structure can't be blank")
	private String businessStructure;
	
	@NotNull(message="Billing indicator can't be null")
	@NotBlank(message="Billing indicator can't be blank")
	private String billingIndicator;
	
	@NotNull(message="Tax indicator can't be null")
	@NotBlank(message="Tax indicator can't be blank")
	private String taxIndicator;
	
	public String getLoanName() {
		return loanName;
	}
	public void setLoanName(String loanName) {
		this.loanName = loanName;
	}
	public Double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(Double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public String getLoanApplicationDate() {
		return loanApplicationDate;
	}
	public void setLoanApplicationDate(String loanApplicationDate) {
		this.loanApplicationDate = loanApplicationDate;
	}
	public String getBusinessStructure() {
		return businessStructure;
	}
	public void setBusinessStructure(String businessStructure) {
		this.businessStructure = businessStructure;
	}
	public String getBillingIndicator() {
		return billingIndicator;
	}
	public void setBillingIndicator(String billingIndicator) {
		this.billingIndicator = billingIndicator;
	}
	public String getTaxIndicator() {
		return taxIndicator;
	}
	public void setTaxIndicator(String taxIndicator) {
		this.taxIndicator = taxIndicator;
	}
	
	
}
