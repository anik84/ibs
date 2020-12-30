package com.example.batch7.group1.IBS.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.example.batch7.group1.IBS.entity.ServiceProviderEntity;
import com.example.batch7.group1.IBS.entity.UserEntity;

public interface UserRepo extends JpaRepository<UserEntity, Integer>{
	boolean existsByUserName(String userName);
	UserEntity findByUserName(String userName);
	
	/*@Modifying
	@Transactional
	@Query(value="insert into user_details usr (usr.userName,usr.role) values(userName,'customer')",nativeQuery=true)
	void setUserDetails(@Param("userName") String userName);*/
	void save(ServiceProviderEntity parse);
}
