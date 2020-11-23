package com.wellsfargo.batch7.group1.entities;

import java.awt.Image;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Serviceprovider")

public class Serviceprovider {
	
	@Id
	@Column(name="accountID")
	private Integer accountID;
	@Column(name="executiveLastName")
	private String executiveLastName;
	@Column(name="executivePhoneNo")
	private String executivePhoneNo;
	@Column(name="password")
	private String password;
	@Column(name="docKYC")
	private byte[] docKYC;
	
	public Serviceprovider() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Serviceprovider(Integer accountID, String executiveLastName, String executivePhoneNo, String password,
			byte[] docKYC) {
		super();
		this.accountID = accountID;
		this.executiveLastName = executiveLastName;
		this.executivePhoneNo = executivePhoneNo;
		this.password = password;
		this.docKYC = docKYC;
	}

	public Integer getAccountID() {
		return accountID;
	}

	public void setAccountID(Integer accountID) {
		this.accountID = accountID;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public byte[] getDocKYC() {
		return docKYC;
	}

	public void setDocKYC(byte[] docKYC) {
		this.docKYC = docKYC;
	}

	
}
