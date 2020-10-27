package com.wellsfargo.batch7.group1.IBS.services;

import java.sql.SQLException;
import java.util.List;

import com.wellsfargo.batch7.group1.IBS.dto.Account;
import com.wellsfargo.batch7.group1.IBS.exception.AccountException;

public interface AccountService {
	
	Account addAccount(Account account) throws AccountException;
    //List<Account> balance(List<Account> account) throws AccountException;
	void deposit(int Amount,int acctNumber) throws AccountException,SQLException;
	void withdraw(int AcctNumber,int Amount) throws AccountException;
	void transfer(int AcctNumber,int Amount) throws AccountException;
	int balance(int AcctNumber) throws AccountException;
}
