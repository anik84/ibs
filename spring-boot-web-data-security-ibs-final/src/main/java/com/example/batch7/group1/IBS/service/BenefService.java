package com.example.batch7.group1.IBS.service;

import java.util.List;

import javax.validation.Valid;

import com.example.batch7.group1.IBS.entity.BeneficiariesEntity;
import com.example.batch7.group1.IBS.exception.IBSException;
import com.example.batch7.group1.IBS.model.AccountModel;
import com.example.batch7.group1.IBS.model.BeneficiariesModel;

public interface BenefService {
	
	BeneficiariesModel openNewBenef(BeneficiariesModel account) throws IBSException;

	BeneficiariesModel addBenefAcct(BeneficiariesModel benef) throws IBSException;

	List<BeneficiariesEntity> getBenefByUCI();

	void updateBenefAcct(@Valid BeneficiariesModel benef);

	BeneficiariesEntity getBenefByBenefAcctNo(Long benefAcctNo);
	
	//void updateBenef(Long benefAcctNo,String benefName,String benefType) throws IBSException;
	//BeneficiariesModel openNewCredit(BeneficiariesModel account) throws IBSException;
	void updateCredit(Long benefAcctNo,String benefName,String benefType) throws IBSException;
	
}
