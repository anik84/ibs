package com.example.batch7.group1.IBS.model;



import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class ServiceProviderModel extends UserModel{  // extends UserModel

	//private Long id;
	
	private Long svcPvdrId;
	
	/*@NotNull(message="Account Number is mandate")
	@NotBlank(message="Account Number is mandate")*/
	private Long accountNumber;
	
	/*@NotNull(message="Name is mandate")
	@NotBlank(message="Name is mandate")
	private String svcPvdrName;*/
	
	@NotNull(message="Email ID mandate")
	@NotBlank(message="Email ID is mandate")
	private String svcPvdrEmail;
	
	@NotNull(message="Phone No is mandate")
	@NotBlank(message="Phone No is mandate")
	private String svcPvdrPhoneNo;
	
	private String role;

	//private String isReqApproved;
	
	private String svcPvdrStatus;
	
	public ServiceProviderModel() {
		super();
		// TODO Auto-generated constructor stub
	}



	public ServiceProviderModel(Long id, Long svcPvdrId, Long accountNumber, 
			String svcPvdrName, String svcPvdrEmail, String svcPvdrPhoneNo) {
		//this.id = id;
		this.svcPvdrId = svcPvdrId;
		this.accountNumber = accountNumber;
		//this.svcPvdrName = svcPvdrName;
		this.svcPvdrEmail = svcPvdrEmail;
		this.svcPvdrPhoneNo = svcPvdrPhoneNo;
	}



	/*public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}
     */


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
	}
       */


	public String getSvcPvdrStatus() {
		return svcPvdrStatus;
	}



	public void setSvcPvdrStatus(String svcPvdrStatus) {
		this.svcPvdrStatus = svcPvdrStatus;
	}

	
	
}
