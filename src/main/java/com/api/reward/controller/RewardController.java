package com.api.reward.controller;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.reward.model.APIRequest;
import com.api.reward.model.APIResponse;
import com.api.reward.model.Customer;
import com.api.reward.model.Customers;
import com.api.reward.service.RewardService;

@RestController
@RequestMapping("/reward")
public class RewardController {
	
		@Autowired
	    private RewardService rewardservice;
		
	    @GetMapping(path="/getCustomerDetails", produces = "application/json")
	    public Customers getCustomers()
	    { 
	        return rewardservice.getCustDetails();
	    }
	    
	    @RequestMapping(value="/addUser",consumes="application/json",method=RequestMethod.POST)
	
	    @ResponseBody APIResponse addCustomer(@Valid @RequestBody APIRequest request) throws Exception{
	    	 APIResponse response =  new APIResponse();
		  	 rewardservice.addCustomer(request);
		   	 response.setMessage("User added Successfully");
	    	 response.setStatusCode(200);
	    	 return response;
	    }
	 
}
