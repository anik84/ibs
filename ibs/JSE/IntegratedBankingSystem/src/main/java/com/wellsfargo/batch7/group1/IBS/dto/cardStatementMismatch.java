package com.wellsfargo.batch7.group1.IBS.dto;

public class cardStatementMismatch {
	
	private Integer reqMismatchID;
	private String mismatchDescription;
	private Integer statementMismatchuci;
	
	public cardStatementMismatch(Integer reqMismatchID, String mismatchDescription, Integer statementMismatchuci) {
		super();
		this.reqMismatchID = reqMismatchID;
		this.mismatchDescription = mismatchDescription;
		this.statementMismatchuci = statementMismatchuci;
	}

	public Integer getReqMismatchID() {
		return reqMismatchID;
	}

	public void setReqMismatchID(Integer reqMismatchID) {
		this.reqMismatchID = reqMismatchID;
	}

	public String getMismatchDescription() {
		return mismatchDescription;
	}

	public void setMismatchDescription(String mismatchDescription) {
		this.mismatchDescription = mismatchDescription;
	}

	public Integer getStatementMismatchuci() {
		return statementMismatchuci;
	}

	public void setStatementMismatchuci(Integer statementMismatchuci) {
		this.statementMismatchuci = statementMismatchuci;
	}
	
	
	

}
