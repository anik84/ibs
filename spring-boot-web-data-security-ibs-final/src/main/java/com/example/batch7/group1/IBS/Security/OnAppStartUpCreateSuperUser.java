package com.example.batch7.group1.IBS.Security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.example.batch7.group1.IBS.entity.BankEmployeeEntity;
import com.example.batch7.group1.IBS.entity.UserEntity;
import com.example.batch7.group1.IBS.repo.EmployeeRepo;
import com.example.batch7.group1.IBS.repo.UserRepo;

@Component
public class OnAppStartUpCreateSuperUser {

	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private PasswordEncoder encoder;
	
	@EventListener
	public void createSuperUserOnStartUp(ApplicationStartedEvent event) {
		if(!userRepo.existsByUserName("executive")) {
			userRepo.save(new UserEntity(null, 
					"executive", encoder.encode("executive"), "executive"));
		}
		
		if(!userRepo.existsByUserName("rep")) {
			userRepo.save(new UserEntity(null, 
					"rep", encoder.encode("rep"), "rep"));
		}
	}
}
