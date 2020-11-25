package com.wellsfargo.fsd.ibs.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Customer")

public class Customer extends User{
	
	
	@OneToOne(mappedBy="UCI",cascade=CascadeType.ALL)
	private Account custUCI;
	@Column(name="Cust_Fname")
	private String custFirstName;
	@Column(name="Cust_Lname")
	private String custLastName;
	@Column(name="Cust_Email")
	private String custEmail;
	@Column(name="Cust_Address")
	private String custAddress;
	@Column(name="Cust_Phoneno")
	private String custPhoneNo;
	@Column(name="Cust_Transaction_Password")
	private String custTPassword;
	@Column(name="Cust_isReqApproved")
	private String isReqApproved;
	@Column(name="Cust_UStatus")
	private String custUserStatus;
	@Column(name="Cust_KYC")
	private String custKYC;
	@Column(name="Cust_Emailsent")
	private String custemailsent;
	
	


	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}




	public Customer(Integer userId, String userName, String password, String role, String custFirstName, String custLastName, String custEmail, String custAddress,
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

	public Account getCustUCI() {
		return custUCI;
	}




	public void setCustUCI(Account custUCI) {
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
