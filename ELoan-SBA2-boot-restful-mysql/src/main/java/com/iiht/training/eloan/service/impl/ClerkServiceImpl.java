package com.iiht.training.eloan.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iiht.training.eloan.dto.LoanOutputDto;
import com.iiht.training.eloan.dto.ProcessingDto;
import com.iiht.training.eloan.exception.InvalidDataException;
import com.iiht.training.eloan.repository.LoanRepository;
import com.iiht.training.eloan.repository.ProcessingInfoRepository;
import com.iiht.training.eloan.repository.SanctionInfoRepository;
import com.iiht.training.eloan.repository.UsersRepository;
import com.iiht.training.eloan.service.ClerkService;

@Service
public class ClerkServiceImpl implements ClerkService {

	@Autowired
	private UsersRepository usersRepository;

	@Autowired
	private LoanRepository loanRepository;

	@Autowired
	private ProcessingInfoRepository processingInfoRepository;

	@Autowired
	private SanctionInfoRepository sanctionInfoRepository;

	@Override
	public List<LoanOutputDto> allAppliedLoans() {
		return loanRepository.findAllByStatus(0)
				.stream().map(e->EDParser.parse(e)).collect(Collectors.toList());
	}

	@Transactional
	@Override
	public ProcessingDto processLoan(Long clerkId, Long loanAppId, ProcessingDto processingDto) {
		if (processingDto != null && clerkId != null && loanAppId != null) {
			// System.out.println(loanRepository.getStatusById(loanAppId));
			if (!usersRepository.getRole(clerkId).equalsIgnoreCase("clerk")) {
				throw new InvalidDataException("Clerk Id # " + clerkId + " does not exist");
			} else if (!loanRepository.existsById(loanAppId)) {
				throw new InvalidDataException("Loan Id # " + loanAppId + " does not exist");
			} else if (loanRepository.getStatusById(loanAppId) != 0) {
				throw new InvalidDataException("Loan status with Id # " + loanAppId + " already under process.");
			} else {
				loanRepository.setProcessedStaus(loanAppId);
				processingDto = EDParser
						.parse(processingInfoRepository.save(EDParser.parse(clerkId, loanAppId, processingDto)));
			}
		}

		return processingDto;
	}

}
