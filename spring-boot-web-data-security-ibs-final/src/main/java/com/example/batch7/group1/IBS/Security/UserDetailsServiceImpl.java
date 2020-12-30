package com.example.batch7.group1.IBS.Security;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.batch7.group1.IBS.entity.UserEntity;
import com.example.batch7.group1.IBS.exception.IBSException;
import com.example.batch7.group1.IBS.model.ServiceProviderRegistrationModel;
import com.example.batch7.group1.IBS.repo.UserRepo;
import com.example.batch7.group1.IBS.util.EMParser;


@Service
public class UserDetailsServiceImpl implements UserDetailsService{

	@Autowired
	private UserRepo userRepo;
	
	/*@Autowired
	private EmployeeRepo employeeRepo;*/
	
	/*@Autowired
	private PasswordEncoder encoder;*/
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		//System.out.println("inside user load user");
		if(!userRepo.existsByUserName(username)) {
			throw new UsernameNotFoundException("invlaid user credits!");
		}
		
		UserEntity user = userRepo.findByUserName(username);
		
		return new User(user.getUserName(), user.getPassword(), 
				Collections.singletonList(new SimpleGrantedAuthority(user.getRole())));
	}
	
	/*public void svcPvdrRegister(ServiceProviderRegistrationModel user) throws IBSException {
		if(user!=null) {
			if(user.getPassword().equals(user.getConfirmPwd())) {
				user.setPassword(encoder.encode(user.getPassword()));
				userRepo.save(EMParser.parse(user));
			}else {
				throw new IBSException("Password do not match");
			}
		}
	}
	
	public void userRegister(ServiceProviderRegistrationModel user) throws IBSException {
		if(user!=null) {
			if(user.getPassword().equals(user.getConfirmPwd())) {
				user.setPassword(encoder.encode(user.getPassword()));
				userRepo.save(EMParser.parse(user));
			}else {
				throw new IBSException("Password do not match");
			}
		}
	}*/
	
}
