package com.example.batch7.group1.IBS.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.batch7.group1.IBS.entity.AccountEntity;
import com.example.batch7.group1.IBS.entity.BeneficiariesEntity;
import com.example.batch7.group1.IBS.model.BeneficiariesModel;


@Repository
public interface BenefRepo extends JpaRepository<BeneficiariesEntity,Integer>{

	boolean existsByBenefAcctNo(Long benefAcctNo);

	List<BeneficiariesEntity> findAccountByBenefUci(Long custUCI);

	@Modifying
	@Transactional
	@Query(value = "update beneficiaries b set b.benef_acct_no=:benefAcctNo,b.benef_name=:benefName where b.benef_id=:benefId", nativeQuery = true)
	void updateBenifByBenefAcctNo(@Param("benefId") Integer benefId,@Param("benefAcctNo") Long benefAcctNo,@Param("benefName") String benefName);

	BeneficiariesEntity findAccountByBenefAcctNo(Long benefAcctNo);
	
	@Modifying
	@Transactional
	@Query(value = "update beneficiaries b set b.benef_acct_no=:benefAcctNo,b.benef_type=:benefType where b.benef_name=:benefName", nativeQuery = true)
	void modifyBenef(@Param("benefAcctNo") Long benefAcctNo,@Param("benefType") String benefType,@Param("benefName") String benefName);

	
	/*@Modifying
	@Transactional
	@Query(value = "update beneficiaries b set b.benef_credit_acct_no=:benefCreditAcctNo,b.benef_type=:benefType where b.benef_credit_name=:benefCreditName", nativeQuery = true)
	void modifyCredit(@Param("benefAcctNo") Long benefAcctNo,@Param("benefType") String benefType,@Param("benefCreditName") String benefCreditName);

	boolean existsByBenefCreditAcctNo(Long benefAcctNo);*/

	
}
