package com.example.batch7.group1.IBS.repo;

import java.time.LocalDate;
import java.util.Collection;
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

@Repository
public interface AccountRepo extends JpaRepository<AccountEntity, Long> {

	List<AccountEntity> findByUCI(Long uci);

	@Modifying
	@Transactional
	@Query(value = "insert into transactions (acct_number,to_acct_number,transaction_date,debit_credit_amount,transaction_type) values(?1,?2,?3,?4,?5)", nativeQuery = true)
	void InsertTransDetails(@Param("acctNumber") Long acctNumber, @Param("toAcctNo") Long toAcctNo, @Param("transactionDate") LocalDate transactionDate,
			@Param("debitCreditAmount") Double debitCreditAmount,@Param("transType") String transType);

	@Modifying
	@Transactional
	@Query(value = "update account a set a.acct_status='approved' where a.acct_number=:acctNumber", nativeQuery = true)
	void setUserStatus(@Param("acctNumber") Long acctNumber);

	@Modifying
	@Transactional
	@Query(value = "update account a set a.acct_status='rejected' where a.acct_number=:acctNumber", nativeQuery = true)
	void setUserRejectionStatus(@Param("acctNumber") Long acctNumber);

	@Modifying
	@Transactional
	@Query(value = "update account a set a.acct_balance=a.acct_balance + :depositAmount,a.deposit_amount=:depositAmount where a.acct_number=:acctNumber", nativeQuery = true)
	void setDepositAccount(@Param("acctNumber") Long acctNumber, @Param("depositAmount") Double depositAmount);
	
	@Modifying 
	@Transactional 
	@Query(value = "update account a set a.acct_balance=a.acct_balance - :depositAmount,a.deposit_amount=:depositAmount where a.acct_number=:acctNumber", nativeQuery = true) 
	 void setTransferAccount(@Param("acctNumber") Long acctNumber, @Param("depositAmount") Double depositAmount);
}
