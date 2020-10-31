package com.wellsfargo.batch7.group1.IBS.dao;

import com.wellsfargo.batch7.group1.IBS.dto.Beneficiaries;
import com.wellsfargo.batch7.group1.IBS.exception.AccountException;

public interface BeneficiaryOperation {
	Beneficiaries addAccount(Beneficiaries b) throws AccountException;
	Beneficiaries mopdifyAccount(Beneficiaries b) throws AccountException;
	Beneficiaries fundTransfer(Beneficiaries b) throws AccountException;
}
