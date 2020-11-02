package com.wellsfargo.batch7.ibs.model;

import java.time.LocalDate;

public class NewUserRegistration {
	private String firstName;
	private String lastName;
	private String emailId;
	private String address;
	private String phoneNo;
	private LocalDate dob;
	private String newUserCategory;
	
	
	public NewUserRegistration() {
		
	}


	public NewUserRegistration(String firstName, String lastName, String emailId, String address, String phoneNo,
			LocalDate dob, String newUserCategory) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.address = address;
		this.phoneNo = phoneNo;
		this.dob = dob;
		this.newUserCategory = newUserCategory;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getPhoneNo() {
		return phoneNo;
	}


	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}


	public LocalDate getDob() {
		return dob;
	}


	public void setDob(LocalDate dob) {
		this.dob = dob;
	}


	public String getNewUserCategory() {
		return newUserCategory;
	}


	public void setNewUserCategory(String newUserCategory) {
		this.newUserCategory = newUserCategory;
	}


	
	
}
