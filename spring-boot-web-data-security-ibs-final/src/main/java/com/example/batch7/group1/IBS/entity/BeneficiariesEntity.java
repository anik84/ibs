package com.example.batch7.group1.IBS.entity;                 

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Beneficiaries")

public class BeneficiariesEntity {
	
	
	@Id
	@Column(name="benef_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer benefId;
	@Column(name="benef_uci")
	private Long benefUci;
	@Column(name="benef_acct_no")
	private Long benefAcctNo;
	@Column(name="benef_name")
	private String benefName;
	@Column(name="benef_type")
	private String benefType;
	@Column(name="acct_type")
	private String acctType;
	
	/*
	 * @Column(name="benef_credit_acct_no") private Long benefCreditAcctNo;
	 * 
	 * @Column(name="benef_credit_name") private String benefCreditName;
	 */
	
	
	public BeneficiariesEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Long getBenefUci() {
		return benefUci;
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
