package com.example.batch7.group1.IBS.service;

import java.util.List;

import com.example.batch7.group1.IBS.entity.AccountEntity;
import com.example.batch7.group1.IBS.entity.TransactionEntity;
import com.example.batch7.group1.IBS.exception.IBSException;
import com.example.batch7.group1.IBS.model.AccountModel;
import com.example.batch7.group1.IBS.model.TransactionModel;

public interface AccountService {
	
	AccountModel openNewAccount(AccountModel account) throws IBSException;
	List<AccountModel> getAll() throws IBSException;
	AccountModel accountBalance(Long acctNumber) throws IBSException;
	List<TransactionEntity> miniStatement(Long acctNumber) throws IBSException;
	List<AccountEntity> getAccountsByUCI() throws IBSException;
	//List<AccountModel> getAccountsByUCI() throws IBSException;
	
	void setDeposit(Long acctNumber,Double depositAmount) throws IBSException;
	void setUserOnApproval(Long acctNumber) throws IBSException;
	void setUserOnRejection(Long acctNumber) throws IBSException;
	List<AccountModel> getAllAccounts() throws IBSException;
	List<TransactionEntity> periodicStatement(TransactionModel transactions) throws IBSException;
	void doTransfer(AccountModel accounts) throws IBSException;
	void payBill(AccountModel accounts) throws IBSException;
	List<TransactionEntity> getSvcPvdrTrans() throws IBSException;
	
}
