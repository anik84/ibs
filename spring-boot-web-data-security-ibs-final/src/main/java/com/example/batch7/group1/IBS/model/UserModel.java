package com.example.batch7.group1.IBS.model;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class UserModel {
	
	private Integer userId;
	
	/*@NotNull(message="User Name is mandate")
	@NotBlank(message="User Name is mandate")*/
	private String userName;
	
	/*@NotNull(message="Password is mandate")
	@NotBlank(message="Password is mandate")*/
	private String password;
	
	private String confirmPwd;
	
	private String role;
	
	public UserModel() {
		
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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

	public String getConfirmPwd() {
		return confirmPwd;
	}

	public void setConfirmPwd(String confirmPwd) {
		this.confirmPwd = confirmPwd;
	}
	
	


}
