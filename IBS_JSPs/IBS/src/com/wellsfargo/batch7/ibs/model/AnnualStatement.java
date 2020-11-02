package com.wellsfargo.batch7.ibs.model;

import java.time.LocalDate;

public class AnnualStatement {
	private long accountNo;
	private LocalDate fromDate;
	private LocalDate toDate;
	
	public AnnualStatement() {
		
	}

	public AnnualStatement(long accountNo, LocalDate fromDate, LocalDate toDate) {
		super();
		this.accountNo = accountNo;
		this.fromDate = fromDate;
		this.toDate = toDate;
	}

	public long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}

	public LocalDate getFromDate() {
		return fromDate;
	}

	public void setFromDate(LocalDate fromDate) {
		this.fromDate = fromDate;
	}

	public LocalDate getToDate() {
		return toDate;
	}

	public void setToDate(LocalDate toDate) {
		this.toDate = toDate;
	}
	
	

}
