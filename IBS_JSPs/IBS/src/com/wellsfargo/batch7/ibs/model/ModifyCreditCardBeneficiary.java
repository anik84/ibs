package com.wellsfargo.batch7.ibs.model;

public class ModifyCreditCardBeneficiary {
	
	private long existingBenefCreditCardNo;
	private long modifyBenefCreditCardNoTo;
	private String modifyBenefCreditCardNameTo;
	private Integer modifyBenefCreditCardCVVTo;
	
	public ModifyCreditCardBeneficiary() {
		
	}

	public ModifyCreditCardBeneficiary(long existingBenefCreditCardNo, long modifyBenefCreditCardNoTo,
			String modifyBenefCreditCardNameTo, Integer modifyBenefCreditCardCVVTo) {
		super();
		this.existingBenefCreditCardNo = existingBenefCreditCardNo;
		this.modifyBenefCreditCardNoTo = modifyBenefCreditCardNoTo;
		this.modifyBenefCreditCardNameTo = modifyBenefCreditCardNameTo;
		this.modifyBenefCreditCardCVVTo = modifyBenefCreditCardCVVTo;
	}

	public long getExistingBenefCreditCardNo() {
		return existingBenefCreditCardNo;
	}

	public void setExistingBenefCreditCardNo(long existingBenefCreditCardNo) {
		this.existingBenefCreditCardNo = existingBenefCreditCardNo;
	}

	public long getModifyBenefCreditCardNoTo() {
		return modifyBenefCreditCardNoTo;
	}

	public void setModifyBenefCreditCardNoTo(long modifyBenefCreditCardNoTo) {
		this.modifyBenefCreditCardNoTo = modifyBenefCreditCardNoTo;
	}

	public String getModifyBenefCreditCardNameTo() {
		return modifyBenefCreditCardNameTo;
	}

	public void setModifyBenefCreditCardNameTo(String modifyBenefCreditCardNameTo) {
		this.modifyBenefCreditCardNameTo = modifyBenefCreditCardNameTo;
	}

	public Integer getModifyBenefCreditCardCVVTo() {
		return modifyBenefCreditCardCVVTo;
	}

	public void setModifyBenefCreditCardCVVTo(Integer modifyBenefCreditCardCVVTo) {
		this.modifyBenefCreditCardCVVTo = modifyBenefCreditCardCVVTo;
	}
	
	
	

}
