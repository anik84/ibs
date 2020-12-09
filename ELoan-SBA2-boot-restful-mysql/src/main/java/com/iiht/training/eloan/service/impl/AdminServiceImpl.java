package com.iiht.training.eloan.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iiht.training.eloan.dto.UserDto;
import com.iiht.training.eloan.entity.Users;
import com.iiht.training.eloan.exception.InvalidDataException;
import com.iiht.training.eloan.repository.UsersRepository;
import com.iiht.training.eloan.service.AdminService;



@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private UsersRepository usersRepository;
	
	@Transactional
	@Override
	public UserDto registerClerk(UserDto userDto) {
		if(userDto!=null) {
			userDto = EDParser.parse(usersRepository.save(EDParser.parse(userDto)));
		}else {
			throw new InvalidDataException("Please provide user details.");
		}
		
		return userDto;
	}

	@Transactional
	@Override
	public UserDto registerManager(UserDto userDto) {
		if(userDto!=null) {
			userDto = EDParser.parse(usersRepository.save(EDParser.parse(userDto)));
		}else {
			throw new InvalidDataException("Please provide user details.");
		}
		
		return userDto;
	}

	@Override
	public List<UserDto> getAllClerks() {
		return usersRepository.findByRole("clerk").stream().map(e->EDParser.parse(e)).collect(Collectors.toList());
	}
	
	@Override
	public List<UserDto> getAllManagers() {
		return usersRepository.findByRole("manager").stream().map(e->EDParser.parse(e)).collect(Collectors.toList());
	}

}
