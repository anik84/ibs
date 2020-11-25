package com.wellsfargo.fsd.ibs.model;



import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class ServiceProviderModel extends UserModel {
	
	
	private Integer serviceProviderID;
	
	@NotNull(message="Acctnumber is mandate")
	@NotBlank(message="Acctnumber is mandate")
	private Integer accountNumber;
	
	@NotNull(message="Executive Last Name is mandate")
	@NotBlank(message="Executive Last Name is mandate")
	private String executiveLastName;
	
	@NotNull(message="Executive phone no is mandate")
	@NotBlank(message="Executive phone no is mandate")
	private String executivePhoneNo;

	private String tPassword;
	
	@NotNull(message="DocKYC is mandate")
	@NotBlank(message="DocKYC is mandate")
	private String docKYC;
	

	
	public ServiceProviderModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ServiceProviderModel(Integer userId, String userName, String password, String role,Integer serviceProviderID, Integer accountNumber,String executiveLastName, String executivePhoneNo, String tPassword,
			String docKYC) {
		super(userId, userName, password, role);
		this.serviceProviderID=serviceProviderID;
		this.accountNumber = accountNumber;
		this.executiveLastName = executiveLastName;
		this.executivePhoneNo = executivePhoneNo;
		this.tPassword = tPassword;
		this.docKYC = docKYC;
	}

	public Integer getServiceProviderID() {
		return serviceProviderID;
	}

	public void setServiceProviderID(Integer serviceProviderID) {
		this.serviceProviderID = serviceProviderID;
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

	public void settPassword(String tPassword) {
		this.tPassword = tPassword;
	}

	public String getDocKYC() {
		return docKYC;
	}

	public void setDocKYC(String docKYC) {
		this.docKYC = docKYC;
	}

	
}
