package com.wellsfargo.batch7.group1.IBS.dao;


import com.wellsfargo.batch7.group1.IBS.dto.serviceProviders;
import com.wellsfargo.batch7.group1.IBS.exception.AccountException;

public interface ServiceProviderOperation {
	
	serviceProviders addRegistration(serviceProviders service) throws AccountException;
	serviceProviders pay(serviceProviders service) throws AccountException;
	serviceProviders receive(serviceProviders service) throws AccountException;
    

}
