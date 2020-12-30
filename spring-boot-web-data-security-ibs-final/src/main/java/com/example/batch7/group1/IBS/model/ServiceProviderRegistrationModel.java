package com.example.batch7.group1.IBS.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class ServiceProviderRegistrationModel extends ServiceProviderModel{
	
	@NotNull(message="Password is mandate")
	@NotBlank(message="Password is mandate")
	private String password;
	
	@NotNull(message="Confirm Password is mandate")
	@NotBlank(message="Confirm Password is mandate")
	private String confirmPwd;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPwd() {
		return confirmPwd;
	}

	public void setConfirmPwd(String confirmPwd) {
		this.confirmPwd = confirmPwd;
	}
	
	
	
}
