package com.iiht.training.eloan.service.impl;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iiht.training.eloan.dto.LoanDto;
import com.iiht.training.eloan.dto.LoanOutputDto;
import com.iiht.training.eloan.dto.RejectDto;
import com.iiht.training.eloan.dto.SanctionDto;
import com.iiht.training.eloan.dto.SanctionOutputDto;
import com.iiht.training.eloan.entity.Loan;
import com.iiht.training.eloan.exception.InvalidDataException;
import com.iiht.training.eloan.repository.LoanRepository;
import com.iiht.training.eloan.repository.ProcessingInfoRepository;
import com.iiht.training.eloan.repository.SanctionInfoRepository;
import com.iiht.training.eloan.repository.UsersRepository;
import com.iiht.training.eloan.service.ManagerService;

@Service
public class ManagerServiceImpl implements ManagerService {

	@Autowired
	private UsersRepository usersRepository;
	
	@Autowired
	private LoanRepository loanRepository;
	
	@Autowired
	private ProcessingInfoRepository processingInfoRepository;
	
	@Autowired
	private SanctionInfoRepository sanctionInfoRepository;
	
	@Override
	public List<LoanOutputDto> allProcessedLoans() {
		return loanRepository.findAllByStatus(1)
				.stream().map(e->EDParser.parse(e)).collect(Collectors.toList());
	}

	@Transactional
	@Override
	public RejectDto rejectLoan(Long managerId, Long loanAppId, RejectDto rejectDto) {
		Loan loan = new Loan();
		if (rejectDto != null && managerId != null && loanAppId != null) {
			if (!usersRepository.findById(managerId).get().getRole().equalsIgnoreCase("manager")) {//!usersRepository.getRole(managerId).equalsIgnoreCase("manager")
				throw new InvalidDataException("Manager Id # " + managerId + " does not exist");
			} else if (!loanRepository.existsById(loanAppId)) {
				throw new InvalidDataException("Loan Id # " + loanAppId + " does not exist");
			} else if (loanRepository.findById(loanAppId).get().getStatus() != 1) {//loanRepository.getStatusById(loanAppId) != 1
				throw new InvalidDataException("Loan status with Id # " + loanAppId + " can't be rejected.");
			} else {
				loan = (loanRepository.findById(loanAppId).get());
				rejectDto = EDParser
						.parseReject(loanRepository.save(EDParser.parse(managerId,loanAppId,rejectDto,loan)));
			}
		}
		
		return rejectDto;
	}

	@Transactional
	@Override
	public SanctionOutputDto sanctionLoan(Long managerId, Long loanAppId, SanctionDto sanctionDto) {
		SanctionOutputDto sanctionOutputDto = new SanctionOutputDto();
		if (sanctionDto != null && managerId != null && loanAppId != null) {
			if (!usersRepository.findById(managerId).get().getRole().equalsIgnoreCase("manager")) {//!usersRepository.getRole(managerId).equalsIgnoreCase("manager")
				throw new InvalidDataException("Manager Id # " + managerId + " does not exist");
			} else if (!loanRepository.existsById(loanAppId)) {
				throw new InvalidDataException("Loan Id # " + loanAppId + " does not exist");
			} else if (loanRepository.findById(loanAppId).get().getStatus() != 1) {//loanRepository.getStatusById(loanAppId) != 1
				throw new InvalidDataException("Loan with Id # " + loanAppId + " can't be sanctioned.");
			} else {
				//loan = (loanRepository.findById(loanAppId).get());
				sanctionOutputDto.setLoanAmountSanctioned(sanctionDto.getLoanAmountSanctioned());
				sanctionOutputDto.setTermOfLoan(sanctionDto.getTermOfLoan());
				sanctionOutputDto.setPaymentStartDate(sanctionDto.getPaymentStartDate());
				
				/*aprovedLoan.setLcd((LocalDate.parse(aprovedLoan.getPsd())).plusMonths(aprovedLoan.getLoanterm()).toString());
				System.out.println(aprovedLoan.getLcd());		
				int tpa = ((int)(aprovedLoan.getAmotsanctioned()) * (1 + 9/100) ^ (int)(aprovedLoan.getLoanterm()))/(int)(aprovedLoan.getLoanterm());*/
				
				double amount=sanctionDto.getLoanAmountSanctioned();
				double term=sanctionDto.getTermOfLoan();
				double TermPaymentAmount= ( amount* (1 + (0.15*(term/12))));
				double EMI = TermPaymentAmount/term;
				LocalDate paymentStartDate= LocalDate.now();
				LocalDate loanClosureDate = paymentStartDate.plusMonths((long) term);
				
				sanctionOutputDto.setLoanClosureDate(loanClosureDate.toString());
				sanctionOutputDto.setMonthlyPayment(EMI);
				loanRepository.setSanctionedStaus(loanAppId);	
				sanctionOutputDto = EDParser.parse(sanctionInfoRepository.save(EDParser.parse(managerId,loanAppId,sanctionOutputDto)));
			}
		}
		return sanctionOutputDto;
	}

}
