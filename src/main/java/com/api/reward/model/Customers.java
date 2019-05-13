package com.api.reward.model;

import java.util.ArrayList;
import java.util.List;

public class Customers {
	
	private List<Customer> customerList;
	
	public List<Customer> getCustomerList(){
		if(customerList == null) {
			customerList = new ArrayList<>();
        }
        return customerList;
		
	}

	public void setCustomerList(List<Customer> customerList) {
		this.customerList = customerList;
	}

	
}
