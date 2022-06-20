package com.codingdojo.models;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



//to make the safetravels table in mysql
@Entity //convert into mysql code
public class SafeTravels {
	

	public SafeTravels() {
		
	}

	// "create table if not exists" + Movie + " ";
	@Id //primary key
	@GeneratedValue(strategy=GenerationType.IDENTITY) //auto-incrementing on database
	private Long id;
	
	@NotNull(message="Must fill out expense")
	@Size(min=1,max=255,message="Must be between 1 to 255 characters.")
	private String expense;
		
	@NotNull(message="Must fill out vendor")
	@Size(min=1,max=255,message="Must be between 1 to 255 characters.")
	private String vendor;
		
	@NotNull(message="Must fill out amount")
	@Min(value=1,message="Must be more than a dollar.")
	private Double amount;
	
	@NotNull(message="Must fill out description")
	@Size(min=1,max=255,message="Must be between 1 to 255 characters.")
	private String description;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getExpense() {
		return expense;
	}

	public void setExpense(String expense) {
		this.expense = expense;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
	
};
