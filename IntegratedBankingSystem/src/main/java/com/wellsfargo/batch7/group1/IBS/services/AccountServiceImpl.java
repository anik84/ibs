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
	public Account addAccount(Account account) throws AccountException,SQLException {
		// TODO Auto-generated method stub
		
			if(isValidAccount(account)) {
				accountoperation.addAccount(account);
			}
		
		return account;
	}
	
    
	


	@Override
	public Account deposit(int Amount,int AcctNumber) throws AccountException, SQLException {
		// TODO Auto-generated method stub
		return accountoperation.deposit(Amount,AcctNumber);
		
	}


	@Override
	public Account balance(int AcctNumber) throws AccountException {
		// TODO Auto-generated method stub
		
		return accountoperation.balance(AcctNumber);
		
	}


	@Override
	public Account withdraw(int Amount,int AcctNumber) throws AccountException {
		// TODO Auto-generated method stub
		return accountoperation.withdraw(Amount,AcctNumber);

	}
	@Override
	public Account transfer(int AcctNumber, int Amount) throws AccountException {
		// TODO Auto-generated method stub
		return accountoperation.transfer(AcctNumber, Amount);
	}

}
