package com.wellsfargo.batch7.group1.IBS.dao;

import java.sql.SQLException;

import com.wellsfargo.batch7.group1.IBS.dto.Account;
import com.wellsfargo.batch7.group1.IBS.exception.AccountException;

public interface AccountOperation {
	
	Account addAccount(Account account) throws AccountException;
    int balance(String AcctNumber) throws AccountException;
	void deposit(String AcctNumber,int NewAmount) throws SQLException;
	void withdraw(String AcctNumber,int NewAmount) throws AccountException;
	void transfer(String AcctNumber,int NewAmount) throws AccountException;
}
