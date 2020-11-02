package com.wellsfargo.batch7.ibs.model;

public class ModifyOwnBenificiaryAccountNo {
	private long existingBenefAcctNo;
	private long modifyBenefAcctNoTo;
	
	public ModifyOwnBenificiaryAccountNo() {
		
	}

	public ModifyOwnBenificiaryAccountNo(long existingBenefAcctNo, long modifyBenefAcctNoTo) {
		super();
		this.existingBenefAcctNo = existingBenefAcctNo;
		this.modifyBenefAcctNoTo = modifyBenefAcctNoTo;
	}

	public long getExistingBenefAcctNo() {
		return existingBenefAcctNo;
	}

	public void setExistingBenefAcctNo(long existingBenefAcctNo) {
		this.existingBenefAcctNo = existingBenefAcctNo;
	}

	public long getModifyBenefAcctNoTo() {
		return modifyBenefAcctNoTo;
	}

	public void setModifyBenefAcctNoTo(long modifyBenefAcctNoTo) {
		this.modifyBenefAcctNoTo = modifyBenefAcctNoTo;
	}
	
	

}
