package com.wellsfargo.batch7.ibs.model;

import java.time.LocalDate;

public class MonthlyStatement {
	private long accountNo;
	private String stmtMonth;
		
	public MonthlyStatement(){
		
	}

	public MonthlyStatement(long accountNo, String stmtMonth) {
		super();
		this.accountNo = accountNo;
		this.stmtMonth = stmtMonth;
	}

	public long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}

	public String getStmtMonth() {
		return stmtMonth;
	}

	public void setStmtMonth(String stmtMonth) {
		this.stmtMonth = stmtMonth;
	}
	
}
