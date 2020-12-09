package com.iiht.training.eloan.service.impl;

import java.util.List;
import java.util.Optional;

import com.iiht.training.eloan.dto.LoanDto;
import com.iiht.training.eloan.dto.LoanOutputDto;
import com.iiht.training.eloan.dto.ProcessingDto;
import com.iiht.training.eloan.dto.RejectDto;
import com.iiht.training.eloan.dto.SanctionDto;
import com.iiht.training.eloan.dto.SanctionOutputDto;
import com.iiht.training.eloan.dto.UserDto;
import com.iiht.training.eloan.entity.Loan;
import com.iiht.training.eloan.entity.ProcessingInfo;
import com.iiht.training.eloan.entity.SanctionInfo;
import com.iiht.training.eloan.entity.Users;

public class EDParser {
	
	public static UserDto parse(Users source) {
		UserDto target = new UserDto();
		target.setId(source.getId());
		target.setFirstName(source.getFirstName());
		target.setLastName(source.getLastName());
		target.setEmail(source.getEmail());
		target.setMobile(source.getMobile());
		target.setRole(source.getRole());
		return target;
	}
	
	public static Users parse(UserDto source) {
		Users target = new Users();
		target.setId(source.getId());
		target.setFirstName(source.getFirstName());
		target.setLastName(source.getLastName());
		target.setEmail(source.getEmail());
		target.setMobile(source.getMobile());
		target.setRole(source.getRole());
		return target;
	}
	
	public static LoanOutputDto parse(Loan source) {
		LoanOutputDto target = new LoanOutputDto();
		LoanDto source1 = new LoanDto();
		target.setCustomerId(source.getCustomerId());
		target.setLoanAppId(source.getId());
		
		source1.setLoanName(source.getLoanName());
		source1.setLoanAmount(source.getLoanAmount());
		source1.setLoanApplicationDate(source.getLoanApplicationDate());
		source1.setBusinessStructure(source.getBusinessStructure());
		source1.setLoanAmount(source.getLoanAmount());
		source1.setBillingIndicator(source.getBillingIndicator());
		source1.setTaxIndicator(source.getTaxIndicator());
		target.setLoanDto(source1);
		
		return target;
	}
	
	
	public static Loan parse(LoanOutputDto source) {
		Loan target = new Loan();
		//target.setId(source.getLoanAppId());
		target.setCustomerId(source.getCustomerId());
		target.setLoanName(source.getLoanDto().getLoanName());
		target.setLoanAmount(source.getLoanDto().getLoanAmount());
		target.setLoanApplicationDate(source.getLoanDto().getLoanApplicationDate());
		target.setBusinessStructure(source.getLoanDto().getBusinessStructure());
		target.setBillingIndicator(source.getLoanDto().getBillingIndicator());
		target.setTaxIndicator(source.getLoanDto().getTaxIndicator());
		return target;
	}
	
	public static LoanOutputDto parse(Loan source,LoanDto source1) {
		LoanOutputDto target = new LoanOutputDto();
		target.setCustomerId(source.getCustomerId());
		target.setLoanAppId(source.getId());
		
		source1.setLoanName(source.getLoanName());
		source1.setLoanAmount(source.getLoanAmount());
		source1.setLoanApplicationDate(source.getLoanApplicationDate());
		source1.setBusinessStructure(source.getBusinessStructure());
		source1.setLoanAmount(source.getLoanAmount());
		source1.setBillingIndicator(source.getBillingIndicator());
		source1.setTaxIndicator(source.getTaxIndicator());
		target.setLoanDto(source1);
		
		target.setStatus(source.getStatus());
		return target;
	}
	
	public static ProcessingDto parse(ProcessingInfo processingInfo) {
		ProcessingDto target = new ProcessingDto();
		target.setAcresOfLand(processingInfo.getAcresOfLand());
		target.setLandValue(processingInfo.getLandValue());
		target.setAppraisedBy(processingInfo.getAppraisedBy());
		target.setValuationDate(processingInfo.getValuationDate());
		target.setAddressOfProperty(processingInfo.getAddressOfProperty());
		target.setSuggestedAmountOfLoan(processingInfo.getSuggestedAmountOfLoan());
		return target;
	}

	public static ProcessingInfo parse(Long clerkId, Long loanAppId, ProcessingDto processingDto) {
		ProcessingInfo target = new ProcessingInfo();
		target.setLoanClerkId(clerkId);
		target.setLoanAppId(loanAppId);
		target.setAcresOfLand(processingDto.getAcresOfLand());
		target.setLandValue(processingDto.getLandValue());
		target.setAppraisedBy(processingDto.getAppraisedBy());
		target.setValuationDate(processingDto.getValuationDate());
		target.setAddressOfProperty(processingDto.getAddressOfProperty());
		target.setSuggestedAmountOfLoan(processingDto.getSuggestedAmountOfLoan());
		return target;
	}

	public static Loan parse(Long managerId, Long loanAppId, RejectDto rejectDto,Loan loan) {
		Loan target = new Loan();
		//LoanDto source1 = new LoanDto();
		target.setId(loanAppId);
		target.setCustomerId(loan.getCustomerId());
		target.setLoanName(loan.getLoanName());
		target.setLoanAmount(loan.getLoanAmount());
		target.setLoanApplicationDate(loan.getLoanApplicationDate());
		target.setBusinessStructure(loan.getBusinessStructure());
		target.setLoanAmount(loan.getLoanAmount());
		target.setBillingIndicator(loan.getBillingIndicator());
		target.setTaxIndicator(loan.getTaxIndicator());
		target.setRemark(rejectDto.getRemark());
		target.setStatus(-1);
		return target;
	}

	public static RejectDto parseReject(Loan loan) {
		RejectDto target = new RejectDto();
		target.setRemark(loan.getRemark());
		return target;
	}

	public static SanctionInfo parse(Long managerId, Long loanAppId, SanctionOutputDto sanctionOutputDto) {
		SanctionInfo target = new SanctionInfo();
		target.setLoanAppId(loanAppId);
		target.setManagerId(managerId);
		target.setLoanAmountSanctioned(sanctionOutputDto.getLoanAmountSanctioned());
		target.setTermOfLoan(sanctionOutputDto.getTermOfLoan());
		target.setPaymentStartDate(sanctionOutputDto.getPaymentStartDate());
		target.setLoanClosureDate(sanctionOutputDto.getLoanClosureDate());
		target.setMonthlyPayment(sanctionOutputDto.getMonthlyPayment());
		return target;
	}

	public static SanctionOutputDto parse(SanctionInfo sanctionInfo) {
		SanctionOutputDto target = new SanctionOutputDto();
		target.setLoanAmountSanctioned(sanctionInfo.getLoanAmountSanctioned());
		target.setTermOfLoan(sanctionInfo.getTermOfLoan());
		target.setPaymentStartDate(sanctionInfo.getPaymentStartDate());
		target.setLoanClosureDate(sanctionInfo.getLoanClosureDate());
		target.setMonthlyPayment(sanctionInfo.getMonthlyPayment());
		return target;
	}

	
	
}








