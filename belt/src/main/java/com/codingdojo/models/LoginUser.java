package com.codingdojo.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

//loginandregistration part
public class LoginUser {

	@NotEmpty(message="Email is required")
	@Email(message="jfdsa")
	private String email;
	
	@NotEmpty(message="password")
	@Size(min=8,max=128,message="jhfklds")
	private String password;
	
	public LoginUser() {
		
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
};
