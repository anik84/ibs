package com.example.batch7.group1.IBS.service;

import java.util.List;

import com.example.batch7.group1.IBS.exception.IBSException;
import com.example.batch7.group1.IBS.model.CustomerModel;
import com.example.batch7.group1.IBS.model.UserModel;

public interface CustomerService {
	
	void register(CustomerModel customer) throws IBSException;
	//List<CustomerModel> getAll() throws IBSException;
	List<CustomerModel> getNewRegistrationReq() throws IBSException;
	void setUserOnApproval(Integer uId) throws IBSException;
	void setUserOnRejection(Integer uId) throws IBSException;
	CustomerModel getApprovalStatus(String userName) throws IBSException;
	void resetPassword(UserModel user) throws IBSException;
}
