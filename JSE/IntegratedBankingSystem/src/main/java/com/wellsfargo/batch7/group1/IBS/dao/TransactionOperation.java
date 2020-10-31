package com.wellsfargo.batch7.group1.IBS.dao;

import java.time.LocalDate;


import com.wellsfargo.batch7.group1.IBS.dto.Transaction;
import com.wellsfargo.batch7.group1.IBS.exception.AccountException;

public interface TransactionOperation {
	
	Transaction reqMiniStmt(String AcctNumber) throws AccountException;
	Transaction reqPeriodicStmt(String AcctNumber,LocalDate TransDateTime) throws AccountException;
	
}
