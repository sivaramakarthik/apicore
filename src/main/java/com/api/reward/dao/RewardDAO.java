package com.api.reward.dao;

import org.springframework.stereotype.Repository;

import com.api.reward.model.APIRequest;
import com.api.reward.model.Customer;
import com.api.reward.model.Customers;
@Repository
public class RewardDAO {

private static Customers list = new Customers();
	
	static
	{
		list.getCustomerList().add(new Customer(1, "Mike", "john", "Mike.john@gmail.com", 45.00, 0));
        list.getCustomerList().add(new Customer(2, "Lisa", "Ka", "Lisa.ka@gmail.com", 60.00, 10));
        list.getCustomerList().add(new Customer(3, "David", "Kameron", "Kameron@gmail.com", 100.00, 100));
	}
	
	public Customers getAllCustomers(){
		
		return list;
	}
	
	public void addCustomer(APIRequest request){
		list.getCustomerList().add(new Customer(request.getId(), request.getFirstName(), request.getLastName(), request.getEmail(),request.getAmount(), request.getRewards()));
		
	}
}
