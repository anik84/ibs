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
		
		if(account.getAcctNumber()==null || account.getAcctNumber().length()<4 || account.getAcctNumber().length()>20) {
			errMsgs.add("Account number is manditory and must be of 4 to 20 AlphaNumber in length");
		}
		
		if(account.getAcctNumber()==null) {
			errMsgs.add("Account Number cannot be null");
		}
		
		if(account.getAcctNumber().isEmpty()) {
			if(true)
			errMsgs.add("Account Number cannot be blank");
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
	public Account addAccount(Account account) throws AccountException {
		// TODO Auto-generated method stub
		
			if(isValidAccount(account)) {
				accountoperation.addAccount(account);
			}
		
		return account;
	}
	
    
	


	@Override
	public void deposit(String acctNumber, int NewAmount) throws AccountException, SQLException {
		// TODO Auto-generated method stub
		accountoperation.deposit(acctNumber, NewAmount);
		
		
	}


	@Override
	public int balance(String AcctNumber) throws AccountException {
		// TODO Auto-generated method stub
		return accountoperation.balance(AcctNumber);
	}


	@Override
	public void withdraw(String AcctNumber, int NewAmount) throws AccountException {
		// TODO Auto-generated method stub
		accountoperation.withdraw(AcctNumber, NewAmount);
	}


	@Override
	public void transfer(String AcctNumber, int Amount) throws AccountException {
		// TODO Auto-generated method stub
		accountoperation.transfer(AcctNumber, Amount);
	}

}
