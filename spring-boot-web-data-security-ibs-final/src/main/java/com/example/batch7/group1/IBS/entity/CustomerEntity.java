package com.example.batch7.group1.IBS.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
@Table(name="Customer")
@Inheritance(strategy=InheritanceType.JOINED)
public class CustomerEntity extends UserEntity{//extends UserEntity
	
	//@Id
	/*@Column(name="custid")
	@GeneratedValue
	private Integer custId;*/
	//@OneToOne(mappedBy="UCI",cascade=CascadeType.ALL)
	//private AccountEntity custUCI;
	@Column(name="cust_uci")
	private Long custUCI;
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
	@Column(name="Cust_dob")
	@DateTimeFormat(iso=ISO.DATE)
	private LocalDate custdob;
	@Column(name="Cust_Transaction_Password")
	private String custTPassword;
	@Column(name="Cust_isReqApproved")
	private String isReqApproved;
	@Column(name="Cust_UStatus")
	private String custUserStatus;
	/*@Column(name="Cust_KYC")
	private String custKYC;*/
	@Column(name="Cust_Emailsent")
	private String custemailsent;
	
	


	public CustomerEntity() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getCustFirstName() {
		return custFirstName;
	}




	public Long getCustUCI() {
		return custUCI;
	}




	public void setCustUCI(Long custUCI) {
		this.custUCI = custUCI;
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




	public LocalDate getCustdob() {
		return custdob;
	}




	public void setCustdob(LocalDate custdob) {
		this.custdob = custdob;
	}

    
	
}
