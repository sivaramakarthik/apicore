package com.api.reward.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NegativeOrZero;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class APIRequest{

	private Integer id;
	
	@Size(min=2, max=50, message=" First Name should exceed 50 letters") 
	@NotNull(message = "Please provide first Name")
	private String firstName;
	
	@Size(max=50) 
	@NotNull(message = "Please provide Last Name")
	private String lastName;
	
	@Email(message = "Please provide valid email address")
	private String email;
	
	
	@NotNull(message = "Please enter valid amount")
	private Double amount;
	

	private Integer rewards;

	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
	
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Integer getRewards() {
		return rewards;
	}
	public void setRewards(Integer rewards) {
		this.rewards = rewards;
	}
	
	

}
