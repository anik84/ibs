package com.wellsfargo.batch7.group1.IBS.dao;

import java.sql.SQLException;

import com.wellsfargo.batch7.group1.IBS.dto.Account;
import com.wellsfargo.batch7.group1.IBS.exception.AccountException;

public interface AccountOperation {
	
	Account addAccount(Account account) throws AccountException;
    int balance(int AcctNumber) throws AccountException;
	void deposit(int  Amount,int AcctNumber) throws SQLException;
	void withdraw(int AcctNumber,int Amount) throws AccountException;
	void transfer(int AcctNumber,int Amount) throws AccountException;
}
