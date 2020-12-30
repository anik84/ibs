package com.example.batch7.group1.IBS.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BankEmp")

public class BankEmployeeEntity{ // extends UserEntity
	
	@Id
	@Column(name="emp_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long empId;
	
	@Column(name="emp_name")
	private String empName;
	
	@Column(name="password")
	private String password;
	
	@Column(name="role")
	private String role;
	
	
	public BankEmployeeEntity() {
		
	}


	public BankEmployeeEntity(Long empId, String empName, String password, String role) {
		//super();
		this.empId = empId;
		this.empName = empName;
		this.password = password;
		this.role = role;
	}


	public Long getEmpId() {
		return empId;
	}


	public void setEmpId(Long empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}
		

}
