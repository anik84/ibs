package com.example.batch7.group1.IBS.util;

import java.util.List;

import com.example.batch7.group1.IBS.entity.AccountEntity;
import com.example.batch7.group1.IBS.entity.BeneficiariesEntity;
import com.example.batch7.group1.IBS.entity.CustomerEntity;
import com.example.batch7.group1.IBS.entity.ServiceProviderEntity;
import com.example.batch7.group1.IBS.entity.TransactionEntity;
import com.example.batch7.group1.IBS.entity.UserEntity;
import com.example.batch7.group1.IBS.model.AccountModel;
import com.example.batch7.group1.IBS.model.BeneficiariesModel;
import com.example.batch7.group1.IBS.model.CustomerModel;
import com.example.batch7.group1.IBS.model.ServiceProviderModel;
import com.example.batch7.group1.IBS.model.ServiceProviderRegistrationModel;
import com.example.batch7.group1.IBS.model.TransactionModel;
import com.example.batch7.group1.IBS.model.UserModel;


public class EMParser {
	
	public static ServiceProviderRegistrationModel parse(ServiceProviderEntity source) {
		ServiceProviderRegistrationModel target=new ServiceProviderRegistrationModel();
		//target.setId(source.getId());
		target.setUserId(source.getUserId());
		target.setUserName(source.getUserName());
		target.setAccountNumber(source.getAccountNumber());
		//target.setSvcPvdrName(source.getSvcPvdrName());
		target.setSvcPvdrPhoneNo(source.getSvcPvdrPhoneNo());
		target.setSvcPvdrEmail(source.getSvcPvdrEmail());
		target.setRole(source.getRole());
		target.setPassword(source.getPassword());
		//target.setIsReqApproved(source.getIsReqApproved());
		target.setSvcPvdrStatus(source.getSvcPvdrStatus());
		return target;		
	}
	
	public static ServiceProviderEntity parse(ServiceProviderRegistrationModel source) {
		ServiceProviderEntity target=new ServiceProviderEntity();
		target.setUserId(null);
		//target.setId(null);
		target.setUserName(source.getUserName());
		target.setAccountNumber(source.getAccountNumber());
		//target.setSvcPvdrName(source.getSvcPvdrName());
		target.setSvcPvdrPhoneNo(source.getSvcPvdrPhoneNo());
		target.setSvcPvdrEmail(source.getSvcPvdrEmail());
		target.setRole(source.getRole());
		target.setPassword(source.getPassword());
		//target.setIsReqApproved(source.getIsReqApproved());
		target.setSvcPvdrStatus(source.getSvcPvdrStatus());
		return target;		
	}
	
	/*public static ServiceProviderEntity parse(ServiceProviderModel source) {
		ServiceProviderEntity target=new ServiceProviderEntity();
		//target.setId(source.getId());
		target.setAccountNumber(source.getAccountNumber());
		return target;		
	}*/
	
	public static CustomerModel parse(CustomerEntity source) {
		CustomerModel target=new CustomerModel();
		target.setCustUCI(source.getCustUCI());
		target.setUserId(source.getUserId());
		target.setUserName(source.getUserName());
		target.setPassword(source.getPassword());
		target.setRole(source.getRole());
		target.setCustFirstName(source.getCustFirstName());
		target.setCustLastName(source.getCustLastName());
		target.setCustEmail(source.getCustEmail());
		target.setCustAddress(source.getCustAddress());
		target.setCustdob(source.getCustdob());
		target.setCustPhoneNo(source.getCustPhoneNo());
		target.setCustUserStatus(source.getCustUserStatus());
		target.setIsReqApproved(source.getIsReqApproved());
		//target.setRole("customer");
		return target;		
	}

	public static CustomerEntity parse(CustomerModel source) {
		CustomerEntity target=new CustomerEntity();
		//target.set(source.getCustId());
		target.setCustUCI(source.getCustUCI());
		target.setUserId(source.getUserId());
		target.setUserName(source.getUserName());
		target.setPassword(source.getPassword());
		target.setRole(source.getRole());
		//target.setCustId(source.getCustId());
		target.setCustFirstName(source.getCustFirstName());
		target.setCustLastName(source.getCustLastName());
		target.setCustEmail(source.getCustEmail());
		target.setCustAddress(source.getCustAddress());
		target.setCustdob(source.getCustdob());
		target.setCustPhoneNo(source.getCustPhoneNo());
		target.setCustUserStatus(source.getCustUserStatus());
		target.setIsReqApproved(source.getIsReqApproved());
		return target;		
	}

	public static UserModel uparse(UserEntity source) {
		UserModel target=new UserModel();
		//target.setUserId(source.getUserId());
		target.setUserName(source.getUserName());
		/*target.setPassword(source.getPassword());*/
		target.setRole("customer");
		return target;		
	}
	
	public static UserEntity uparse(UserModel source) {
		UserEntity target=new UserEntity();
		//target.setUserId(source.getUserId());
		target.setUserName(source.getUserName());
		/*target.setPassword(source.getPassword());*/
		target.setRole("customer");
		return target;		
	}


	public static CustomerModel cparse(CustomerEntity source) {
		CustomerModel target=new CustomerModel();
		/*target.setUserId(source.getUserId());
		target.setUserName(source.getUserName());
		target.setPassword(source.getPassword());
		target.setRole(source.getRole());*/
		//target.setCustId(source.getCustId());
		//target.setCustUCI(aparse(source.getCustUCI()));
		target.setCustFirstName(source.getCustFirstName());
		target.setCustLastName(source.getCustLastName());
		target.setCustEmail(source.getCustEmail());
		target.setCustAddress(source.getCustAddress());
		target.setCustdob(source.getCustdob());
		target.setCustPhoneNo(source.getCustPhoneNo());
		return target;		
	}

	public static CustomerEntity cparse(CustomerModel source) {
		CustomerEntity target=new CustomerEntity();
		/*target.setUserId(source.getUserId());
		target.setUserName(source.getUserName());
		target.setPassword(source.getPassword());
		target.setRole(source.getRole());*/
		//target.setCustId(source.getCustId());
		//target.setCustUCI(aparse(source.getCustUCI()));
		target.setCustFirstName(source.getCustFirstName());
		target.setCustLastName(source.getCustLastName());
		target.setCustEmail(source.getCustEmail());
		target.setCustAddress(source.getCustAddress());
		target.setCustdob(source.getCustdob());
		target.setCustPhoneNo(source.getCustPhoneNo());
		return target;		
	}
    
	public static AccountModel aparse(AccountEntity source) {
		AccountModel target = new AccountModel();
		/*target.setDebitCreditAmount(source.getDebitCreditAmount());
		target.setTransactionDate(source.getTransactionDate());*/
		target.setAcctBalance(source.getAcctBalance());
		target.setUCI(source.getUCI());
		target.setAcctNumber(source.getAcctNumber());
		target.setAcctType(source.getAcctType());
		target.setDepositAmount(source.getDepositAmount());
		target.setAcctStatus(source.getAcctStatus());
		//target.setUCI(cparse(source.getUCI()));
		return target;
	}
	
	public static AccountEntity aparse(AccountModel source) {
		AccountEntity target = new AccountEntity();
		/*target.setDebitCreditAmount(source.getDebitCreditAmount());
		target.setTransactionDate(source.getTransactionDate());*/
		target.setDepositAmount(source.getDepositAmount());
		target.setUCI(source.getUCI());
		target.setAcctNumber(source.getAcctNumber());
		target.setAcctType(source.getAcctType());
		target.setAcctBalance(source.getAcctBalance());
		target.setAcctStatus(source.getAcctStatus());
		//target.setUCI(cparse(source.getUCI()));
		return target;
	}
	
	public static TransactionEntity parse(TransactionModel source) {
		TransactionEntity target = new TransactionEntity();
		target.setAcctNumber(source.getAcctNumber());
		target.setDebitCreditAmount(source.getDebitCreditAmount());
		target.setTransactionDate(source.getTransactionDate());
		target.setToAcctNo(source.getToAcctNo());
		target.setTransType(source.getTransType());
		return target;
	}
	
	/*public static TransactionModel parse(TransactionEntity source) {
		TransactionModel target = new TransactionModel();
		target.setAcctNumber(source.getAcctNumber());
		target.setDebitCreditAmount(source.getDebitCreditAmount());
		target.setTransactionDate(source.getTransactionDate());
		return target;
	}*/
	
	public static BeneficiariesEntity parse(BeneficiariesModel source) {
		BeneficiariesEntity target = new BeneficiariesEntity();
		target.setBenefUci(source.getBenefUci());
		target.setBenefAcctNo(source.getBenefAcctNo());
		target.setBenefName(source.getBenefName());
		target.setBenefType(source.getBenefType());
		target.setAcctType(source.getAcctType());
		return target;
	}
	
	public static BeneficiariesModel parse(BeneficiariesEntity source) {
		BeneficiariesModel target = new BeneficiariesModel();
		target.setBenefUci(source.getBenefUci());
		target.setBenefAcctNo(source.getBenefAcctNo());
		target.setBenefName(source.getBenefName());
		target.setBenefType(source.getBenefType());
		target.setAcctType(source.getAcctType());
		return target;
	}

		
	
}
