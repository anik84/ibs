package com.iiht.training.eloan.dto;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserDto {
	private Long id;
	
	@NotNull(message="First Name can't be null")
	@Size(min=3, max=100, message = "First Name need to be in between 3 to 100 characters.")
	private String firstName;
	
	@NotNull(message="Last Name can't be null")
	@Size(min=3, max=100, message = "Last Name need to be in between 3 to 100 characters.")
	private String lastName;
	
	@NotNull(message="Email address can't be null")
	@Email(message="Please provide a valid email address.")
	@Size(min=3, max=100, message = "Email ID need to be in between 3 to 100 characters.")
	private String email;
	
	@NotNull(message="Mobile number can't be null")
	@Size(min=10, max=10, message = "Mobile Number need to be of 10 digits.")
	//@Digits(integer = 10, fraction = 0)
	private String mobile;
	
	@NotNull(message="Role can't be null")
	@NotBlank(message="Role can't be blank")
	/*@Min(value = 3, message = "Role can't be less than 3 characters.")
	@Max(value = 100, message = "Role can't be more than 100 characters.")*/
	private String role;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
}
