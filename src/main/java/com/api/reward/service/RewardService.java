package com.api.reward.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.reward.dao.RewardDAO;
import com.api.reward.model.APIRequest;
import com.api.reward.model.Customer;
import com.api.reward.model.Customers;
import com.api.reward.utils.RewardsUtil;

@Service
public class RewardService {

	    @Autowired
	    private RewardDAO rewarddao;
	
	    public Customers getCustDetails()
	    {
	        return rewarddao.getAllCustomers();
	    }
	    
	    public void addCustomer(APIRequest request)
	{
		Map<String, Customer> custDatabase = new HashMap<String, Customer>();
		custDatabase = checkCustomer();
		if (!custDatabase.containsKey(request.getEmail())) {
			request.setRewards(RewardsUtil.calcRewards(request.getAmount()));
		} else {
			Customer cust = custDatabase.get(request.getEmail());
			request.setRewards(cust.getRewards() + RewardsUtil.calcRewards(request.getAmount()));
		}
		
		Integer id = getCustDetails().getCustomerList().size() + 1;
		request.setId(id);
		rewarddao.addCustomer(request);
	}
	    
	    public Map<String, Customer> checkCustomer() {
	    	Map<String, Customer> custDatabase = new HashMap<String, Customer>();
			for(Customer cust: rewarddao.getAllCustomers().getCustomerList()){
				custDatabase.put(cust.getEmail(), cust);
			}
			return custDatabase;
		}
	 
}
