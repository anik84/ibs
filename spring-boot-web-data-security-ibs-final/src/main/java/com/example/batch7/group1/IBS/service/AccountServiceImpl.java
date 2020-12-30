package com.example.batch7.group1.IBS.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.example.batch7.group1.IBS.entity.AccountEntity;
import com.example.batch7.group1.IBS.entity.TransactionEntity;
import com.example.batch7.group1.IBS.exception.IBSException;
import com.example.batch7.group1.IBS.model.AccountModel;
import com.example.batch7.group1.IBS.model.CustomerModel;
import com.example.batch7.group1.IBS.model.TransactionModel;
import com.example.batch7.group1.IBS.repo.AccountRepo;
import com.example.batch7.group1.IBS.repo.CustomerRepo;
import com.example.batch7.group1.IBS.repo.SvcPvdrRepo;
import com.example.batch7.group1.IBS.repo.TransactionRepo;
import com.example.batch7.group1.IBS.repo.UserRepo;
import com.example.batch7.group1.IBS.util.EMParser;

import java.time.LocalDateTime;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountRepo accountRepo;

	@Autowired
	private CustomerRepo custRepo;

	@Autowired
	private TransactionRepo transRepo;
	
	@Autowired
	private SvcPvdrRepo svcPvdrRepo;

	@Transactional
	@Override
	public AccountModel openNewAccount(AccountModel account) throws IBSException {
		if (account.getDepositAmount() < 0.0) {
			throw new IBSException("Deposit Amount can't be less than 0.0");
		} else {
			Long accountNo = System.nanoTime();
			accountRepo.InsertTransDetails(accountNo, accountNo,java.time.LocalDate.now(), account.getDepositAmount(),"OpeningBalance");

			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
			account.setAcctNumber(accountNo);
			account.setUCI(custRepo.findByUserName(auth.getName()).getCustUCI());
			/*
			 * account.setTransactionDate(java.time.LocalDate.now());
			 * account.setDebitCreditAmount(account.getDepositAmount());
			 */
			account.setAcctBalance(account.getDepositAmount());
			account.setAcctStatus("new");
			account = EMParser.aparse(accountRepo.save(EMParser.aparse(account)));
		}
		return account;

	}

	@Override
	public List<AccountModel> getAll() throws IBSException {
		return accountRepo.findAll().stream().map(e -> EMParser.aparse(e)).collect(Collectors.toList());
	}

	@Override
	public AccountModel accountBalance(Long acctNumber) throws IBSException {

		// return EMParser.parse(accountRepo.getByUserName(userName));
		// TODO Auto-generated method stub
		if (!accountRepo.existsById(acctNumber)) {
			throw new IBSException("Account#" + acctNumber + " does not exists");
		}
		return EMParser.aparse(accountRepo.findById(acctNumber).get());
	}

	@Override
	public List<TransactionEntity> miniStatement(Long acctNumber) throws IBSException {
		return transRepo.findByAcctNumber(acctNumber);
	}

	@Override
	public List<TransactionEntity> periodicStatement(TransactionModel transactions) throws IBSException {
		return transRepo.getPeriodicStatement(transactions.getAcctNumber(), transactions.getFromDate(),
				transactions.getToDate());
	}

	@Override
	public List<AccountEntity> getAccountsByUCI() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		return accountRepo.findByUCI(custRepo.findByUserName(auth.getName()).getCustUCI());

	}

	@Override
	public List<AccountModel> getAllAccounts() throws IBSException {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		return accountRepo.findByUCI(custRepo.findByUserName(auth.getName()).getCustUCI()).stream()
				.map(e -> EMParser.aparse(e)).collect(Collectors.toList());
	}

	@Override
	public void setUserOnApproval(Long acctNumber) throws IBSException {
		// TODO Auto-generated method stub
		accountRepo.setUserStatus(acctNumber);
	}

	@Override
	public void setUserOnRejection(Long acctNumber) throws IBSException {
		// TODO Auto-generated method stub
		accountRepo.setUserRejectionStatus(acctNumber);
	}

	@Override
	public void setDeposit(Long acctNumber, Double depositAmount) throws IBSException {
		accountRepo.InsertTransDetails(acctNumber, acctNumber, java.time.LocalDate.now(), depositAmount,"Deposit");
		accountRepo.setDepositAccount(acctNumber, depositAmount);
	}

	@Override
	public void doTransfer(AccountModel accounts) throws IBSException { 
		accountRepo.InsertTransDetails(accounts.getAcctNumber(),accounts.getBenefAcctNo(),java.time.LocalDate.now(),accounts.getDepositAmount(),"Transfer"); 
		accountRepo.setTransferAccount(accounts.getAcctNumber(),accounts.getDepositAmount()); 
		
	}
	
	@Override 
	public void payBill(AccountModel accounts) throws IBSException { 
		accountRepo.InsertTransDetails(accounts.getAcctNumber(),accounts.getAccountNumber(),java.time.LocalDate.now(),accounts.getDepositAmount(),"Debit"); 
		accountRepo.setTransferAccount(accounts.getAcctNumber(),accounts.getDepositAmount()); 
		accountRepo.setDepositAccount(accounts.getAccountNumber(), accounts.getDepositAmount()); 
		accountRepo.InsertTransDetails(accounts.getAcctNumber(),accounts.getAccountNumber(),java.time.LocalDate.now(),accounts.getDepositAmount(),"Credit"); 
	}

	@Override
	public List<TransactionEntity> getSvcPvdrTrans() throws IBSException {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		//System.out.println(svcPvdrRepo.getByUserName(auth.getName()).getAccountNumber());
		return transRepo.findByToAcctNo(svcPvdrRepo.getByUserName(auth.getName()).getAccountNumber());
		
	}

}
