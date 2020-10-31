package com.wellsfargo.batch7.group1.IBS.services;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.wellsfargo.batch7.group1.IBS.dao.AccountOperation;
import com.wellsfargo.batch7.group1.IBS.dao.AccountOperationImpl;
import com.wellsfargo.batch7.group1.IBS.dto.Account;
import com.wellsfargo.batch7.group1.IBS.exception.AccountException;

public class AccountServiceImpl implements AccountService{
	
	private AccountOperation accountoperation;
	

	public AccountServiceImpl() {
		this.accountoperation=new AccountOperationImpl();
		
	}
    
	
	private boolean isValidAccount(Account account) throws AccountException {
		boolean isValid=true;
		List<String> errMsgs = new ArrayList<String>(); 
		if(account.getAcctNumber()==null) {
			errMsgs.add("Account Number cannot be null");
		}
		if(errMsgs.isEmpty()) {
			isValid=true;			
		}else {
			isValid=false;
			throw new AccountException(errMsgs.toString());
		}
		
		return isValid;
	}
	
	@Override
<<<<<<< HEAD
	public Account addAccount(Account account) throws AccountException,SQLException {
=======
	public Account addAccount(Account account) throws AccountException {
>>>>>>> 7dc73a75b5e18529308d1d5fd5b0675b0573d976
		// TODO Auto-generated method stub
		
			if(isValidAccount(account)) {
				accountoperation.addAccount(account);
			}
		
		return account;
	}
	
    
	


	@Override
<<<<<<< HEAD
	public Account deposit(int Amount,int AcctNumber) throws AccountException, SQLException {
		// TODO Auto-generated method stub
		return accountoperation.deposit(Amount,AcctNumber);
=======
	public void deposit(int Amount,int acctNumber) throws AccountException, SQLException {
		// TODO Auto-generated method stub
		accountoperation.deposit(Amount,acctNumber);
>>>>>>> 7dc73a75b5e18529308d1d5fd5b0675b0573d976
		
	}


	@Override
<<<<<<< HEAD
	public Account balance(int AcctNumber) throws AccountException {
		// TODO Auto-generated method stub
		
		return accountoperation.balance(AcctNumber);
		
=======
	public int balance(int AcctNumber) throws AccountException {
		// TODO Auto-generated method stub
		return accountoperation.balance(AcctNumber);
>>>>>>> 7dc73a75b5e18529308d1d5fd5b0675b0573d976
	}


	@Override
<<<<<<< HEAD
	public Account withdraw(int Amount,int AcctNumber) throws AccountException {
		// TODO Auto-generated method stub
		return accountoperation.withdraw(Amount,AcctNumber);

	}
	@Override
	public Account transfer(int AcctNumber, int Amount) throws AccountException {
		// TODO Auto-generated method stub
		return accountoperation.transfer(AcctNumber, Amount);
=======
	public void withdraw(int AcctNumber, int Amount) throws AccountException {
		// TODO Auto-generated method stub
		accountoperation.withdraw(AcctNumber, Amount);

	}
	@Override
	public void transfer(int AcctNumber, int Amount) throws AccountException {
		// TODO Auto-generated method stub
		accountoperation.transfer(AcctNumber, Amount);
>>>>>>> 7dc73a75b5e18529308d1d5fd5b0675b0573d976
	}

}
