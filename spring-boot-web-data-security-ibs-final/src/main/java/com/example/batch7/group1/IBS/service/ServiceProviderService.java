package com.example.batch7.group1.IBS.service;

import java.util.List;

import com.example.batch7.group1.IBS.entity.ServiceProviderEntity;
import com.example.batch7.group1.IBS.exception.IBSException;
import com.example.batch7.group1.IBS.model.ServiceProviderModel;
import com.example.batch7.group1.IBS.model.ServiceProviderRegistrationModel;

public interface ServiceProviderService {
	void register(ServiceProviderRegistrationModel svcPvdr) throws IBSException;
	List<ServiceProviderRegistrationModel> getNewRegistrationReq() throws IBSException;
	void setUserOnApproval(Integer uid) throws IBSException;
	void setUserOnRejection(Integer uid) throws IBSException;
	ServiceProviderRegistrationModel getApprovalStatus(String svcPvdrName) throws IBSException;
	List<ServiceProviderEntity> getAllSvcPvdrAccount();
}
