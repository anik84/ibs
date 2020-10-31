package com.wellsfargo.batch7.group1.IBS.dao;

import java.sql.SQLException;

import com.wellsfargo.batch7.group1.IBS.dto.Account;
import com.wellsfargo.batch7.group1.IBS.exception.AccountException;

public interface AccountOperation {
	
	Account addAccount(Account account) throws AccountException;
    Account balance(int AcctNumber) throws AccountException;
	Account deposit(int Amount,int Account) throws SQLException;
	Account withdraw(int Amount,int Account) throws AccountException;
	Account transfer(int AcctNumber,int Amount) throws AccountException;
}