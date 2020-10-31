package com.wellsfargo.batch7.ibs.model;

public class UserLogin {
	private String userId;
	private String password;
	private String userCategory;
	
	public UserLogin() {
		
	}

	public UserLogin(String userId, String password, String userCategory) {
		super();
		this.userId = userId;
		this.password = password;
		this.userCategory = userCategory;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserCategory() {
		return userCategory;
	}

	public void setUserCategory(String userCategory) {
		this.userCategory = userCategory;
	}
	
	
	
	

}
