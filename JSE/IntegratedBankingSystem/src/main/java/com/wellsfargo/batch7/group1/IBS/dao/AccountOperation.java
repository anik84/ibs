package com.wellsfargo.batch7.group1.IBS.dao;

import java.sql.SQLException;

import com.wellsfargo.batch7.group1.IBS.dto.Account;
import com.wellsfargo.batch7.group1.IBS.exception.AccountException;

public interface AccountOperation {
	
	Account addAccount(Account account) throws AccountException;
<<<<<<< HEAD
    Account balance(int AcctNumber) throws AccountException;
	Account deposit(int Amount,int Account) throws SQLException;
	Account withdraw(int Amount,int Account) throws AccountException;
	Account transfer(int AcctNumber,int Amount) throws AccountException;
}
=======
    int balance(int AcctNumber) throws AccountException;
	void deposit(int  Amount,int AcctNumber) throws SQLException;
	void withdraw(int AcctNumber,int Amount) throws AccountException;
	void transfer(int AcctNumber,int Amount) throws AccountException;
}
>>>>>>> 7dc73a75b5e18529308d1d5fd5b0675b0573d976
