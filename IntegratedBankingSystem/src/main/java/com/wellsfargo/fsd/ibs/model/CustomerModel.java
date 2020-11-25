package com.wellsfargo.fsd.ibs.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class CustomerModel extends UserModel{
	
	
	private AccountModel custUCI;
	
	@NotNull(message="First Name is mandate")
	@NotBlank(message="First Name is mandate")
	private String custFirstName;
	
	@NotNull(message="Last Name is mandate")
	@NotBlank(message="Last Name is mandate")
	private String custLastName;
	
	@NotNull(message="First Name is mandate")
	@NotBlank(message="First Name is mandate")
	@Email(message = "Email Id is not valied")
	private String custEmail;
	
	private String custAddress;
	
	@NotNull(message="Mobile number is mandate")
	@NotBlank(message="Mobile number is mandate")
	@Pattern(regexp = "[1-9][0-9]{9}",message = "Mobile number must be exactly ten digits")
	private String custPhoneNo;
	
	private String custTPassword;

	private String isReqApproved;

	private String custUserStatus;
	
	@NotNull(message="custKYC is mandate")
	@NotBlank(message="custKYC is mandate")
	private String custKYC;

	private String custemailsent;
	
	


	public CustomerModel() {
		super();
		// TODO Auto-generated constructor stub
	}




	public CustomerModel(Integer userId, String userName, String password, String role, String custFirstName, String custLastName, String custEmail, String custAddress,
			String custPhoneNo, String custTPassword, String isReqApproved, String custUserStatus, String custKYC,
			String custemailsent) {
		super(userId, userName, password, role);
		this.custFirstName = custFirstName;
		this.custLastName = custLastName;
		this.custEmail = custEmail;
		this.custAddress = custAddress;
		this.custPhoneNo = custPhoneNo;
		this.custTPassword = custTPassword;
		this.isReqApproved = isReqApproved;
		this.custUserStatus = custUserStatus;
		this.custKYC = custKYC;
		this.custemailsent = custemailsent;
	}

	public AccountModel getCustUCI() {
		return custUCI;
	}




	public void setCustUCI(AccountModel custUCI) {
		this.custUCI = custUCI;
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




	public String getCustKYC() {
		return custKYC;
	}




	public  void setCustKYC(String custKYC) {
		this.custKYC = custKYC;
	}




	public String getCustemailsent() {
		return custemailsent;
	}




	public void setCustemailsent(String custemailsent) {
		this.custemailsent = custemailsent;
	}


	
}
