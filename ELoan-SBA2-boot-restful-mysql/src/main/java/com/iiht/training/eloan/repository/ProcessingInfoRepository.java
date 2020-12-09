package com.iiht.training.eloan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iiht.training.eloan.dto.LoanOutputDto;
import com.iiht.training.eloan.entity.ProcessingInfo;
import com.iiht.training.eloan.entity.Users;

@Repository
public interface ProcessingInfoRepository extends JpaRepository<ProcessingInfo, Long>{

	//Users save(LoanOutputDto parse);

}
