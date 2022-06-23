package com.codingdojo.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


//login and registration part
@Entity
@Table(name="users")
public class User {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty(message="Username is required")
	@Size(min=3,max=30,message="Username must be between 3 to 30 characters")
	private String userName;

	@NotEmpty(message="Email is required")
	@Email(message="jfdsa")
	private String email;
	
	@NotEmpty(message="password")
	@Size(min=8,max=128,message="jhfklds")
	private String password;
	
	public List<Project> getCreatedProjects() {
		return createdProjects;
	}

	public void setCreatedProjects(List<Project> createdProjects) {
		this.createdProjects = createdProjects;
	}

	@Transient
	@NotEmpty(message="password")
	@Size(min=8,max=128,message="jhfklds")
	private String confirm;
	
	//one user, many projects
	@OneToMany(mappedBy="teamlead",fetch=FetchType.LAZY)
	private List<Project> createdProjects;
	
	
	public User() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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

	public String getConfirm() {
		return confirm;
	}

	public void setConfirm(String confirm) {
		this.confirm = confirm;
	}








};
