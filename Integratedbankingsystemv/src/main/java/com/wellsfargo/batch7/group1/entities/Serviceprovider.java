package com.wellsfargo.batch7.group1.entities;

import java.awt.Image;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Serviceprovider")

public class Serviceprovider extends User {
	
	
	@GeneratedValue
	@Column(name="serviceProviderID")
	private Integer serviceProviderID;
	@Column(name="accountNumber")
	private Integer accountNumber;
	@Column(name="executiveLastName")
	private String executiveLastName;
	@Column(name="executivePhoneNo")
	private String executivePhoneNo;
	@Column(name="tPassword")
	private String tPassword;
	@Column(name="docKYC")
	private String docKYC;
	private Integer accountID;
	
	public Serviceprovider() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Serviceprovider(Integer userId, String userName, String password, String role,Integer accountID, Integer accountNumber,String executiveLastName, String executivePhoneNo, String tPassword,
			String docKYC) {
		super(userId, userName, password, role);
		this.accountID = accountID;
		this.accountNumber = accountNumber;
		this.executiveLastName = executiveLastName;
		this.executivePhoneNo = executivePhoneNo;
		this.tPassword = tPassword;
		this.docKYC = docKYC;
	}

	public Integer getAccountID() {
		return accountID;
	}

	public void setAccountID(Integer accountID) {
		this.accountID = accountID;
	}
	
	public Integer getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getExecutiveLastName() {
		return executiveLastName;
	}

	public void setExecutiveLastName(String executiveLastName) {
		this.executiveLastName = executiveLastName;
	}

	public String getExecutivePhoneNo() {
		return executivePhoneNo;
	}

	public void setExecutivePhoneNo(String executivePhoneNo) {
		this.executivePhoneNo = executivePhoneNo;
	}

	public String gettPassword() {
		return tPassword;
	}

	public void setPassword(String tPassword) {
		this.tPassword = tPassword;
	}

	public String getDocKYC() {
		return docKYC;
	}

	public void setDocKYC(String docKYC) {
		this.docKYC = docKYC;
	}

	
}
