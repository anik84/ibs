package com.iiht.training.eloan.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class LoanOutputDto {
	private Long customerId;
	private Long loanAppId;
	private UserDto userDto;
	private LoanDto loanDto;
	private ProcessingDto processingDto;
	private SanctionOutputDto sanctionOutputDto;
	private int status;
	private String remark;
	
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public Long getLoanAppId() {
		return loanAppId;
	}
	public void setLoanAppId(Long loanAppId) {
		this.loanAppId = loanAppId;
	}
	public UserDto getUserDto() {
		return userDto;
	}
	public void setUserDto(UserDto userDto) {
		this.userDto = userDto;
	}
	public LoanDto getLoanDto() {
		return loanDto;
	}
	public void setLoanDto(LoanDto loanDto) {
		this.loanDto = loanDto;
	}
	public ProcessingDto getProcessingDto() {
		return processingDto;
	}
	public void setProcessingDto(ProcessingDto processingDto) {
		this.processingDto = processingDto;
	}
	public SanctionOutputDto getSanctionOutputDto() {
		return sanctionOutputDto;
	}
	public void setSanctionOutputDto(SanctionOutputDto sanctionOutputDto) {
		this.sanctionOutputDto = sanctionOutputDto;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}
