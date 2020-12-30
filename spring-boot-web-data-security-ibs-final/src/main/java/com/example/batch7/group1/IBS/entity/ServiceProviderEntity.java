package com.example.batch7.group1.IBS.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Serviceprovider")

public class ServiceProviderEntity extends UserEntity {//extends UserEntity 
	
	/*@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;*/
	
	@Column(name="Service_Provider_Id")
	private Long svcPvdrId;
	
	@Column(name="Account_Number")
	private Long accountNumber;
	
	/*@Column(name="Service_Provider_Name")
	private String svcPvdrName;*/
	
	@Column(name="Service_Provider_Email")
	private String svcPvdrEmail;
	
	@Column(name="Service_Provider_Phone_No")
	private String svcPvdrPhoneNo;
	
	@Column(name="password")
	private String password;
	
	@Column(name="role")
	private String role;
	
	/*@Column(name="docKYC")
	private String docKYC;
	
	@Column(name="Service_Provider_isReqApproved")
	private String isReqApproved;*/
	
	@Column(name="Service_Provider_Status")
	private String svcPvdrStatus;
	
	public ServiceProviderEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ServiceProviderEntity(Long id, Long svcPvdrId, Long accountNumber, String svcPvdrName,
			String svcPvdrEmail, String svcPvdrPhoneNo, String password,String role) {
		//super();
		//this.id = id;
		this.svcPvdrId = svcPvdrId;
		this.accountNumber = accountNumber;
		//this.svcPvdrName = svcPvdrName;
		this.svcPvdrEmail = svcPvdrEmail;
		this.svcPvdrPhoneNo = svcPvdrPhoneNo;
		this.password = password;
		this.role=role;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

/*	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}*/

	public Long getSvcPvdrId() {
		return svcPvdrId;
	}

	public void setSvcPvdrId(Long svcPvdrId) {
		this.svcPvdrId = svcPvdrId;
	}

	public Long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}

	/*public String getSvcPvdrName() {
		return svcPvdrName;
	}

	public void setSvcPvdrName(String svcPvdrName) {
		this.svcPvdrName = svcPvdrName;
	}*/

	public String getSvcPvdrEmail() {
		return svcPvdrEmail;
	}

	public void setSvcPvdrEmail(String svcPvdrEmail) {
		this.svcPvdrEmail = svcPvdrEmail;
	}

	public String getSvcPvdrPhoneNo() {
		return svcPvdrPhoneNo;
	}

	public void setSvcPvdrPhoneNo(String svcPvdrPhoneNo) {
		this.svcPvdrPhoneNo = svcPvdrPhoneNo;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	/*public String getIsReqApproved() {
		return isReqApproved;
	}

	public void setIsReqApproved(String isReqApproved) {
		this.isReqApproved = isReqApproved;
	}*/

	public String getSvcPvdrStatus() {
		return svcPvdrStatus;
	}

	public void setSvcPvdrStatus(String svcPvdrStatus) {
		this.svcPvdrStatus = svcPvdrStatus;
	}

	

	
}
