package com.wellsfargo.batch7.group1.IBS.services;

import java.sql.SQLException;
<<<<<<< HEAD

=======
import java.util.List;
>>>>>>> 7dc73a75b5e18529308d1d5fd5b0675b0573d976

import com.wellsfargo.batch7.group1.IBS.dto.Account;
import com.wellsfargo.batch7.group1.IBS.exception.AccountException;

public interface AccountService {
	
<<<<<<< HEAD
	Account addAccount(Account account) throws AccountException,SQLException;
    //List<Account> balance(List<Account> account) throws AccountException;
	Account deposit(int Amount,int AcctNumber) throws AccountException,SQLException;
	Account withdraw(int Amount,int AcctNumber) throws AccountException;
	Account transfer(int AcctNumber,int Amount) throws AccountException;
	Account balance(int AcctNumber) throws AccountException;
=======
	Account addAccount(Account account) throws AccountException;
    //List<Account> balance(List<Account> account) throws AccountException;
	void deposit(int Amount,int acctNumber) throws AccountException,SQLException;
	void withdraw(int AcctNumber,int Amount) throws AccountException;
	void transfer(int AcctNumber,int Amount) throws AccountException;
	int balance(int AcctNumber) throws AccountException;
>>>>>>> 7dc73a75b5e18529308d1d5fd5b0675b0573d976
}
