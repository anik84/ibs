package com.example.batch7.group1.IBS.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.batch7.group1.IBS.entity.BankEmployeeEntity;
import com.example.batch7.group1.IBS.entity.UserEntity;
import com.example.batch7.group1.IBS.model.BankEmployeeModel;

public interface EmployeeRepo extends JpaRepository<BankEmployeeEntity, Long>{

	//boolean existsByUserName(String string);

	boolean existsByEmpName(String string);

	BankEmployeeEntity findByEmpName(String username);

	

}
