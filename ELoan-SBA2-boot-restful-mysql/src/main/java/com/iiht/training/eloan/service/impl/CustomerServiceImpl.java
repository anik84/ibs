package com.iiht.training.eloan.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iiht.training.eloan.dto.LoanDto;
import com.iiht.training.eloan.dto.LoanOutputDto;
import com.iiht.training.eloan.dto.UserDto;
import com.iiht.training.eloan.entity.Loan;
import com.iiht.training.eloan.exception.InvalidDataException;
import com.iiht.training.eloan.repository.LoanRepository;
import com.iiht.training.eloan.repository.ProcessingInfoRepository;
import com.iiht.training.eloan.repository.SanctionInfoRepository;
import com.iiht.training.eloan.repository.UsersRepository;
import com.iiht.training.eloan.service.CustomerService;



@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private UsersRepository usersRepository;
	
	@Autowired
	private LoanRepository loanRepository;
	
	@Autowired
	private ProcessingInfoRepository processingInfoRepository;
	
	@Autowired
	private SanctionInfoRepository sanctionInfoRepository;
	
	@Transactional
	@Override
	public UserDto register(UserDto userDto) {
		if(userDto!=null) {
			/*if(usersRepository.existsByEmail(userDto.getEmail())) {
				throw new InvalidDataException("User Email " + userDto.getEmail() + " already exists");
			}*/
			userDto = EDParser.parse(usersRepository.save(EDParser.parse(userDto)));
		}else {
			throw new InvalidDataException("Please provide user details.");
		}
		
		return userDto;
	}

	@Transactional
	@Override
	public LoanOutputDto applyLoan(Long customerId, LoanDto loanDto) {
		
		LoanOutputDto loanOutputDto = new LoanOutputDto();
		if(loanDto!=null && customerId!=null) {
			if(usersRepository.existsById(customerId)) {
				loanOutputDto.setCustomerId(customerId);
				loanOutputDto.setLoanDto(loanDto);
				loanOutputDto = EDParser.parse(loanRepository.save(EDParser.parse(loanOutputDto)),loanDto);
			}
			else {
				throw new InvalidDataException("Customer with id: " + customerId + " does not exist. Please Register to apply Loan.");
			}	
		}
		
		return loanOutputDto;
	}

	@Override
	public LoanOutputDto getStatus(Long loanAppId) {
		LoanDto loanDto = new LoanDto();
		if(!loanRepository.existsById(loanAppId)) {
			throw new InvalidDataException("Loan id "+loanAppId+" does not exists");
		}
		
		return EDParser.parse(loanRepository.findById(loanAppId).get(), loanDto);
	}

	@Override
	public List<LoanOutputDto> getStatusAll(Long customerId) {
		if(!usersRepository.existsById(customerId)) {
			throw new InvalidDataException("Customer id provided: "+customerId+" does not exists");
		}
		return loanRepository.findAllByCustomerId(customerId)
				.stream().map(e->EDParser.parse(e)).collect(Collectors.toList());
		
		
	}
}
