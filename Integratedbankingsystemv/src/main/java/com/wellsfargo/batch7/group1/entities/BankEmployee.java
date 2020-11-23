package com.wellsfargo.batch7.group1.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="BankEmp")

public class BankEmployee extends User{
	
	@Column(name="Emp_Name")
	private String empName;
	@Column(name="Emp_Designation")
	private String empdesignation;
	
	
	public BankEmployee() {
		
	}
	
	public BankEmployee(Integer userId, String userName, String password, String role,String empName, String empdesignation) {
		super(userId, userName, password, role);
		this.empName = empName;
		this.empdesignation = empdesignation;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpdesignation() {
		return empdesignation;
	}

	public void setEmpdesignation(String empdesignation) {
		this.empdesignation = empdesignation;
	}
	
	

}
