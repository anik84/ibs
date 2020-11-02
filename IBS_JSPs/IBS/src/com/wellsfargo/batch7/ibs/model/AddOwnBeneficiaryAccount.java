package com.wellsfargo.batch7.ibs.model;

public class AddOwnBeneficiaryAccount {
	private long benefAcctNo;
	
	public AddOwnBeneficiaryAccount() {
		
	}

	public AddOwnBeneficiaryAccount(long benefAcctNo) {
		super();
		this.benefAcctNo = benefAcctNo;
	}

	public long getBenefAcctNo() {
		return benefAcctNo;
	}

	public void setBenefAcctNo(long benefAcctNo) {
		this.benefAcctNo = benefAcctNo;
	}
	
	

}
