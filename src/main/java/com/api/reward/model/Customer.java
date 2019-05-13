package com.api.reward.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Customer implements Serializable{

	private Integer id;
	private String firstName;
	private String lastName;
	private String email;
	private Double amount;
	private Integer rewards;
	

	public Customer(Integer id, String firstName, String lastName, String email, Double amount, Integer rewards){
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.amount = amount;
		this.rewards = rewards;
	}
	
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

	@Override
	public String toString(){
		return "Customer [id="+id+ ", firstName="+ firstName + ", lastname="+lastName+", email ="+email+"]";
		
	}
	
}
