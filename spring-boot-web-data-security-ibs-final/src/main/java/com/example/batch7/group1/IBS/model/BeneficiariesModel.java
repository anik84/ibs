package com.example.batch7.group1.IBS.model;


import java.util.List;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;



public class BeneficiariesModel {

	
	private Integer benefId;
	private Long benefUci;
	private Long benefAcctNo;
	private String benefName;
	private String benefType;
	private List<BeneficiariesModel> benefModel;
	
	private String acctType;
	
	
	public Long getBenefUci() {
		return benefUci;
	}
	public List<BeneficiariesModel> getBenefModel() {
		return benefModel;
	}
	public void setBenefModel(List<BeneficiariesModel> benefModel) {
		this.benefModel = benefModel;
	}
	public void setBenefUci(Long benefUci) {
		this.benefUci = benefUci;
	}
	public Integer getBenefId() {
		return benefId;
	}
	public void setBenefId(Integer benefId) {
		this.benefId = benefId;
	}
	public Long getBenefAcctNo() {
		return benefAcctNo;
	}
	public void setBenefAcctNo(Long benefAcctNo) {
		this.benefAcctNo = benefAcctNo;
	}
	public String getBenefName() {
		return benefName;
	}
	public void setBenefName(String benefName) {
		this.benefName = benefName;
	}
	public String getBenefType() {
		return benefType;
	}
	public void setBenefType(String benefType) {
		this.benefType = benefType;
	}
	public String getAcctType() {
		return acctType;
	}
	public void setAcctType(String acctType) {
		this.acctType = acctType;
	}
	

}
