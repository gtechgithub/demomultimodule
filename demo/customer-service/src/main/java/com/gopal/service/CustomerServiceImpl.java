package com.gopal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gopal.entities.Customer;
import com.gopal.repository.CustomerRepository;

@Service
public class CustomerServiceImpl {
	
	@Autowired
	private CustomerRepository customerRepo;
	
	public Customer show() {
		
		return customerRepo.findAll().get(0);
	}

}
