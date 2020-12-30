package com.example.batch7.group1.IBS.model;

import java.time.LocalDate;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

public class CustomerModel extends UserModel{ //extends UserModel
	
	
	//private Integer custId;
	
	//private AccountModel custUCI;
	
	private Long custUCI;
	
	@NotNull(message="First Name is mandate")
	@NotBlank(message="First Name is mandate")
	private String custFirstName;
	
	@NotNull(message="Last Name is mandate")
	@NotBlank(message="Last Name is mandate")
	private String custLastName;
	
	@NotNull(message="Email is mandate")
	@NotBlank(message="Email is mandate")
	@Email(message = "Email Id is not valied")
	private String custEmail;
	
	private String custAddress;
	
	@NotNull(message="Mobile number is mandate")
	@NotBlank(message="Mobile number is mandate")
	@Pattern(regexp = "[1-9][0-9]{9}",message = "Mobile number must be exactly ten digits")
	private String custPhoneNo;
	
	@DateTimeFormat(iso=ISO.DATE)
	private LocalDate custdob;
	
	private String custTPassword;

	private String isReqApproved;

	private String custUserStatus;
	
	/*@NotNull(message="custKYC is mandate")
	@NotBlank(message="custKYC is mandate")
	private String custKYC;*/

	private String custemailsent;
	
	


	public CustomerModel() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Long getCustUCI() {
		return custUCI;
	}




	public void setCustUCI(Long custUCI) {
		this.custUCI = custUCI;
	}




	public LocalDate getCustdob() {
		return custdob;
	}




	public void setCustdob(LocalDate custdob) {
		this.custdob = custdob;
	}




	public String getCustFirstName() {
		return custFirstName;
	}




	public void setCustFirstName(String custFirstName) {
		this.custFirstName = custFirstName;
	}




	public String getCustLastName() {
		return custLastName;
	}




	public void setCustLastName(String custLastName) {
		this.custLastName = custLastName;
	}




	public String getCustEmail() {
		return custEmail;
	}




	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}




	public String getCustAddress() {
		return custAddress;
	}




	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}




	public String getCustPhoneNo() {
		return custPhoneNo;
	}




	public void setCustPhoneNo(String custPhoneNo) {
		this.custPhoneNo = custPhoneNo;
	}




	public String getCustTPassword() {
		return custTPassword;
	}




	public void setCustTPassword(String custTPassword) {
		this.custTPassword = custTPassword;
	}




	public String getIsReqApproved() {
		return isReqApproved;
	}




	public void setIsReqApproved(String isReqApproved) {
		this.isReqApproved = isReqApproved;
	}




	public String getCustUserStatus() {
		return custUserStatus;
	}




	public void setCustUserStatus(String custUserStatus) {
		this.custUserStatus = custUserStatus;
	}




	/*public String getCustKYC() {
		return custKYC;
	}




	public  void setCustKYC(String custKYC) {
		this.custKYC = custKYC;
	}*/




	public String getCustemailsent() {
		return custemailsent;
	}




	public void setCustemailsent(String custemailsent) {
		this.custemailsent = custemailsent;
	}


	
}
