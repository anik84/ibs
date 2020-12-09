package com.iiht.training.eloan.repository;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.iiht.training.eloan.dto.LoanDto;
import com.iiht.training.eloan.dto.LoanOutputDto;
import com.iiht.training.eloan.entity.Loan;
import com.iiht.training.eloan.entity.ProcessingInfo;
import com.iiht.training.eloan.entity.SanctionInfo;
import com.iiht.training.eloan.entity.Users;



@Repository
public interface LoanRepository extends JpaRepository<Loan, Long>{

	List<Loan> findAllByCustomerId(Long customerId);

	//boolean getByStatus(Long loanAppId);
	
	@Query(value="select ln.status from loan ln where ln.id=:id",nativeQuery=true)
	Integer getStatusById(@Param("id") Long id);
	
	@Modifying
	@Transactional
	@Query(value="update loan ln set ln.status=1 where ln.id=:id",nativeQuery=true)
	void setProcessedStaus(@Param("id") Long id);
	
	@Modifying
	@Transactional
	@Query(value="update loan ln set ln.status=2 where ln.id=:id",nativeQuery=true)
	void setSanctionedStaus(@Param("id") Long id);
	
	List<Loan> findAllByStatus(int i);

	

	//List<Loan> findAllByProcessedStatus(int j);

	//Optional<Loan> findAllByCustomerId(Long customerId);
	
}
