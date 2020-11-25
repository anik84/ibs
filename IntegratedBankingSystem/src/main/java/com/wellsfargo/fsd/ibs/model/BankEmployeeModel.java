package com.wellsfargo.fsd.ibs.model;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class BankEmployeeModel extends UserModel {
	
	@NotNull(message="Emp Name is mandate")
	@NotBlank(message="Emp Name is mandate")
	private String empName;
	@NotNull(message="Emp Designation is mandate")
	@NotBlank(message="Emp Designation is mandate")
	private String empdesignation;
	
	
	public BankEmployeeModel() {
		
	}
	
	public BankEmployeeModel(Integer userId, String userName, String password, String role,String empName, String empdesignation) {
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
