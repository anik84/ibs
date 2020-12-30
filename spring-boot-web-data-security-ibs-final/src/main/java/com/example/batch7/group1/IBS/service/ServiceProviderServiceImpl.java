package com.example.batch7.group1.IBS.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.batch7.group1.IBS.entity.BeneficiariesEntity;
import com.example.batch7.group1.IBS.entity.ServiceProviderEntity;
import com.example.batch7.group1.IBS.exception.IBSException;
import com.example.batch7.group1.IBS.model.AccountModel;
import com.example.batch7.group1.IBS.model.ServiceProviderModel;
import com.example.batch7.group1.IBS.model.ServiceProviderRegistrationModel;
import com.example.batch7.group1.IBS.repo.AccountRepo;
import com.example.batch7.group1.IBS.repo.SvcPvdrRepo;
import com.example.batch7.group1.IBS.util.EMParser;

@Service
public class ServiceProviderServiceImpl implements ServiceProviderService {
	@Autowired
	private SvcPvdrRepo svcPvdrRepo;
	
	@Autowired
	private PasswordEncoder encoder;
	
	@Transactional
	@Override
	public void register(ServiceProviderRegistrationModel svcPvdr) throws IBSException {
		if(svcPvdr!=null) {
			if(svcPvdr.getPassword().equals(svcPvdr.getConfirmPwd())) {
				svcPvdr.setPassword(encoder.encode(svcPvdr.getPassword()));
				//svcPvdr = EMParser.parse(svcPvdrRepo.save(EMParser.parse(svcPvdr)));
				svcPvdr.setSvcPvdrStatus("new");
				svcPvdrRepo.save(EMParser.parse(svcPvdr));
				
			}else {
				throw new IBSException("Password and confirmed password not matching.");
			}
			
		}
		//return svcPvdr;
	}
	
	@Override
	public List<ServiceProviderRegistrationModel> getNewRegistrationReq() throws IBSException {
		// TODO Auto-generated method stub
		return svcPvdrRepo.findAll().stream().map(e->EMParser.parse(e)).collect(Collectors.toList());
	}

	@Override
	public void setUserOnApproval(Integer uid) throws IBSException {
		// TODO Auto-generated method stub
		Long sid=System.nanoTime();
		svcPvdrRepo.setUserStatus(uid,sid);
		
	}
	
	
	  @Override public List<ServiceProviderEntity> getAllSvcPvdrAccount() { return
	  svcPvdrRepo.findAll();//.stream().map(e ->EMParser.parse(e)).collect(Collectors.toList())
	  
	  }
	 

	

	@Override
	public ServiceProviderRegistrationModel getApprovalStatus(String userName) throws IBSException {
		// TODO Auto-generated method stub
		return EMParser.parse(svcPvdrRepo.getByUserName(userName)); 
	}

	@Override
	public void setUserOnRejection(Integer uid) throws IBSException {
		// TODO Auto-generated method stub
		svcPvdrRepo.setUserRejectionStatus(uid);
	}
}
