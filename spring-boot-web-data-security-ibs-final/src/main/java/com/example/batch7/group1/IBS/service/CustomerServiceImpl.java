package com.example.batch7.group1.IBS.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.batch7.group1.IBS.entity.CustomerEntity;
import com.example.batch7.group1.IBS.exception.IBSException;
import com.example.batch7.group1.IBS.model.CustomerModel;
import com.example.batch7.group1.IBS.model.UserModel;
import com.example.batch7.group1.IBS.repo.CustomerRepo;
import com.example.batch7.group1.IBS.repo.UserRepo;
import com.example.batch7.group1.IBS.util.EMParser;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepo customerRepo;
	
	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private PasswordEncoder encoder;
	
	@Transactional
	@Override
	public void register(CustomerModel customer) throws IBSException {
		if(customer!=null) {
			if(customerRepo.existsByUserName(customer.getUserName())) {
				throw new IBSException("User Id: "+customer.getUserName()+" already exist");
			} else {
				customer.setUserId(null);
				customer.setRole("user");
				customer.setPassword(encoder.encode("temp#"+System.nanoTime()));
				customer.setCustUCI(System.nanoTime());
				customer.setCustUserStatus("new");
				customer.setIsReqApproved("new");
				customer = EMParser.parse(customerRepo.save(EMParser.parse(customer)));
			}
		}
		//return customer;
	}

	@Override
	public List<CustomerModel> getNewRegistrationReq() throws IBSException {
		// TODO Auto-generated method stub
		return customerRepo.findAll().stream().map(e->EMParser.parse(e)).collect(Collectors.toList());
	}
	
	@Override
	public void setUserOnApproval(Integer uId) throws IBSException {
		String tPwd =encoder.encode("tPwd123");
		String uPwd =encoder.encode("uPwd123");
		customerRepo.setUserStatus(uId,tPwd,uPwd); 
		
	}
	
	@Override
	public void setUserOnRejection(Integer uId) throws IBSException {
		customerRepo.setUserRejectionStatus(uId); 
		
	}
	
	@Override
	public CustomerModel getApprovalStatus(String userName) throws IBSException {
		
		return EMParser.parse(customerRepo.getByUserName(userName)); 
		
	}
	
	@Override
	public void resetPassword(UserModel user) throws IBSException {
		if (user.getPassword().equals(user.getConfirmPwd())) {
			customerRepo.resetPwd(user.getUserName(),encoder.encode(user.getPassword())); 
		} else {
			throw new IBSException("New Password and Confirm Password not matching");
		}
		
	}

	

}
