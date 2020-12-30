package com.example.batch7.group1.IBS.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.example.batch7.group1.IBS.entity.AccountEntity;
import com.example.batch7.group1.IBS.entity.BeneficiariesEntity;
import com.example.batch7.group1.IBS.exception.IBSException;
import com.example.batch7.group1.IBS.model.AccountModel;
import com.example.batch7.group1.IBS.model.BeneficiariesModel;
import com.example.batch7.group1.IBS.model.CustomerModel;
import com.example.batch7.group1.IBS.repo.AccountRepo;
import com.example.batch7.group1.IBS.repo.BenefRepo;
import com.example.batch7.group1.IBS.repo.CustomerRepo;
import com.example.batch7.group1.IBS.util.EMParser;
import java.time.LocalDateTime;    

@Service
public class BenefServiceImpl implements BenefService{
	
	@Autowired
	private BenefRepo benefRepo;
	
	@Autowired
	private CustomerRepo custRepo;
	
	@Transactional
	@Override
	public BeneficiariesModel addBenefAcct(BeneficiariesModel benef) throws IBSException {
		if (benefRepo.existsByBenefAcctNo(benef.getBenefAcctNo())) {
			throw new IBSException("Entered beneficiary account already exists");
		} else {
			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
			benef.setBenefUci(custRepo.findByUserName(auth.getName()).getCustUCI());
			benef = EMParser.parse(benefRepo.save(EMParser.parse(benef)));
		}
		
		return benef;
		
	}
	@Transactional
	@Override
	public BeneficiariesModel openNewBenef(BeneficiariesModel benef) throws IBSException {
		if (benefRepo.existsByBenefAcctNo(benef.getBenefAcctNo())) {
			throw new IBSException("Beneficiary Account already exist.");
		} else {
			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
			benef.setBenefUci(custRepo.findByUserName(auth.getName()).getCustUCI());
			benef = EMParser.parse(benefRepo.save(EMParser.parse(benef)));
		}
		
		return benef;
	}
	
	@Override
	public List<BeneficiariesEntity> getBenefByUCI() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		return benefRepo.findAccountByBenefUci(custRepo.findByUserName(auth.getName()).getCustUCI());//.stream().map(e -> EMParser.parse(e)).collect(Collectors.toList())
		
	}
	@Override
	public void updateBenefAcct(@Valid BeneficiariesModel benef) {
		benefRepo.updateBenifByBenefAcctNo(benef.getBenefId(),benef.getBenefAcctNo(),benef.getBenefName());
		
	}
	@Override
	public BeneficiariesEntity getBenefByBenefAcctNo(Long benefAcctNo) {
		return benefRepo.findAccountByBenefAcctNo(benefAcctNo);
	}


	/*@Override
	public BeneficiariesModel openNewCredit(BeneficiariesModel benef) throws IBSException {
		benef = EMParser.parse(benefRepo.save(EMParser.parse(benef)));
		return benef;
	}*/




	/*@Override
	public void updateBenef(Long benefAcctNo, String benefName, String benefType) throws IBSException {
		// TODO Auto-generated method stub
		benefRepo.modifyBenef(benefAcctNo, benefType, benefName);
		
	}*/


	@Override
	public void updateCredit(Long benefAcctNo, String benefName, String benefType) throws IBSException {
		// TODO Auto-generated method stub
		benefRepo.modifyBenef(benefAcctNo, benefType, benefName);
	}

}
