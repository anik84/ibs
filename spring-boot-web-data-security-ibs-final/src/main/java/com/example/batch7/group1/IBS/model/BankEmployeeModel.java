package com.example.batch7.group1.IBS.model;


public class BankEmployeeModel{// extends UserModel 
	
	private Long empId;
	private String empName;
	private String password;
	private String role;
	
	
	public BankEmployeeModel() {
		
	}


	public BankEmployeeModel(Long empId, String empName, String password, String role) {
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
