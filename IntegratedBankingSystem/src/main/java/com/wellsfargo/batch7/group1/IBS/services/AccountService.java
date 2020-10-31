package com.wellsfargo.batch7.group1.IBS.services;

import java.sql.SQLException;


import com.wellsfargo.batch7.group1.IBS.dto.Account;
import com.wellsfargo.batch7.group1.IBS.exception.AccountException;

public interface AccountService {
	
	Account addAccount(Account account) throws AccountException,SQLException;
    //List<Account> balance(List<Account> account) throws AccountException;
	Account deposit(int Amount,int AcctNumber) throws AccountException,SQLException;
	Account withdraw(int Amount,int AcctNumber) throws AccountException;
	Account transfer(int AcctNumber,int Amount) throws AccountException;
	Account balance(int AcctNumber) throws AccountException;
}
