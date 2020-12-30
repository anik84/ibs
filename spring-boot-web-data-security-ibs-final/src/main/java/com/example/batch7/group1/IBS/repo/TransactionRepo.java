package com.example.batch7.group1.IBS.repo;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.batch7.group1.IBS.entity.AccountEntity;
import com.example.batch7.group1.IBS.entity.CustomerEntity;
import com.example.batch7.group1.IBS.entity.TransactionEntity;
import com.example.batch7.group1.IBS.model.AccountModel;
import com.example.batch7.group1.IBS.model.ServiceProviderRegistrationModel;
import com.example.batch7.group1.IBS.model.TransactionModel;


@Repository
public interface TransactionRepo extends JpaRepository<TransactionEntity,Integer>{

	List<TransactionEntity> findByAcctNumber(Long acctNumber);
 //select * from transactions where acct_number=45131585553114 and transaction_date >= '2020-01-05' and transaction_date <='2020-01-10';

	//List<TransactionEntity> getPeriodicStatement(Long acctNumber, LocalDate fromDate, LocalDate toDate);

	@Query(value="select * from transactions t where t.acct_number=:acctNumber and t.transaction_date >=:fromDate and t.transaction_date <=:toDate",nativeQuery = true)
	List<TransactionEntity> getPeriodicStatement(@Param("acctNumber") Long acctNumber,@Param("fromDate") LocalDate fromDate,@Param("toDate") LocalDate toDate);

	List<TransactionEntity> findByToAcctNo(Long accountNumber);
}
