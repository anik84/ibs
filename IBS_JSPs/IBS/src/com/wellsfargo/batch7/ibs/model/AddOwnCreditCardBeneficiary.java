package com.wellsfargo.batch7.ibs.model;

public class AddOwnCreditCardBeneficiary {
	private String benefCreditCardName;
	private long benefCreditCardNo;
	private Integer benefCVVNo;
	
	public AddOwnCreditCardBeneficiary() {
		
	}

	public AddOwnCreditCardBeneficiary(String benefCreditCardName, long benefCreditCardNo, Integer benefCVVNo) {
		super();
		this.benefCreditCardName = benefCreditCardName;
		this.benefCreditCardNo = benefCreditCardNo;
		this.benefCVVNo = benefCVVNo;
	}

	public String getBenefCreditCardName() {
		return benefCreditCardName;
	}

	public void setBenefCreditCardName(String benefCreditCardName) {
		this.benefCreditCardName = benefCreditCardName;
	}

	public long getBenefCreditCardNo() {
		return benefCreditCardNo;
	}

	public void setBenefCreditCardNo(long benefCreditCardNo) {
		this.benefCreditCardNo = benefCreditCardNo;
	}

	public Integer getBenefCVVNo() {
		return benefCVVNo;
	}

	public void setBenefCVVNo(Integer benefCVVNo) {
		this.benefCVVNo = benefCVVNo;
	}

	
	
	

}
