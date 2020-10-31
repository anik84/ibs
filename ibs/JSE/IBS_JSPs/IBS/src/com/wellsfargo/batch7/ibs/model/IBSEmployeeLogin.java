package com.wellsfargo.batch7.ibs.model;

public class IBSEmployeeLogin {
	private String loginId;
	private String empPassword;
	private String empCategory;
	
	public IBSEmployeeLogin() {
		
	}

	public IBSEmployeeLogin(String loginId, String empPassword, String empCategory) {
		super();
		this.loginId = loginId;
		this.empPassword = empPassword;
		this.empCategory = empCategory;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getEmpPassword() {
		return empPassword;
	}

	public void setEmpPassword(String empPassword) {
		this.empPassword = empPassword;
	}

	public String getEmpCategory() {
		return empCategory;
	}

	public void setEmpCategory(String empCategory) {
		this.empCategory = empCategory;
	}
	

}
