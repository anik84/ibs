package com.example.batch7.group1.IBS.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.transaction.annotation.Transactional;

import com.example.batch7.group1.IBS.entity.CustomerEntity;
import com.example.batch7.group1.IBS.entity.UserEntity;
import com.example.batch7.group1.IBS.model.CustomerModel;



public interface CustomerRepo extends JpaRepository<CustomerEntity,Integer>{
	
	@Modifying
	@Transactional
	@Query(value="update customer c,user_details u set c.cust_is_req_approved='approved',c.cust_transaction_password=:tPwd,u.pwd=:uPwd where u.uid=:uid",nativeQuery=true)
	void setUserStatus(@Param("uid") Integer uid, @Param("tPwd") String tPwd, @Param("uPwd") String uPwd);
		
	@Modifying
	@Transactional
	@Query(value="update customer c set c.cust_is_req_approved='rejected' where c.uid=:uid",nativeQuery=true)
	void setUserRejectionStatus(@Param("uid") Integer uid);
	
	@Modifying
	@Transactional
	@Query(value="update customer c,user_details u set c.cust_ustatus='active',u.pwd=:uPwd where u.unm=:uname",nativeQuery=true)
	void resetPwd(@Param("uname") String uname, @Param("uPwd") String uPwd);

	boolean existsByUserName(String userName);

	CustomerEntity getByUserName(String userName);
	CustomerEntity findByUserName(String userName);

	

}
