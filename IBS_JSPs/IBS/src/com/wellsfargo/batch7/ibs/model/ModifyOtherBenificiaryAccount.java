package com.wellsfargo.batch7.ibs.model;

public class ModifyOtherBenificiaryAccount {
	private long existingOtherBenefAcctNo;
	private long modifyOtherBenefAcctNoTo;
	private String otherPeopleBenefFullNameTo;
	
	public ModifyOtherBenificiaryAccount() {
		
	}

	public ModifyOtherBenificiaryAccount(long existingOtherBenefAcctNo, long modifyOtherBenefAcctNoTo,
			String otherPeopleBenefFullNameTo) {
		super();
		this.existingOtherBenefAcctNo = existingOtherBenefAcctNo;
		this.modifyOtherBenefAcctNoTo = modifyOtherBenefAcctNoTo;
		this.otherPeopleBenefFullNameTo = otherPeopleBenefFullNameTo;
	}

	public long getExistingOtherBenefAcctNo() {
		return existingOtherBenefAcctNo;
	}

	public void setExistingOtherBenefAcctNo(long existingOtherBenefAcctNo) {
		this.existingOtherBenefAcctNo = existingOtherBenefAcctNo;
	}

	public long getModifyOtherBenefAcctNoTo() {
		return modifyOtherBenefAcctNoTo;
	}

	public void setModifyOtherBenefAcctNoTo(long modifyOtherBenefAcctNoTo) {
		this.modifyOtherBenefAcctNoTo = modifyOtherBenefAcctNoTo;
	}

	public String getOtherPeopleBenefFullNameTo() {
		return otherPeopleBenefFullNameTo;
	}

	public void setOtherPeopleBenefFullNameTo(String otherPeopleBenefFullNameTo) {
		this.otherPeopleBenefFullNameTo = otherPeopleBenefFullNameTo;
	}
	
	

}
