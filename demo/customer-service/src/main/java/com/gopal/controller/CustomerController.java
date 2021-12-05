package com.gopal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.gopal.persistentJdbc.JDBCTemplateRepository;
import com.gopal.service.CustomerServiceImpl;



@RestController
@RequestMapping("/api")
public class CustomerController {
	
	
	@Autowired
	private CustomerServiceImpl customerService;
	
	
	@GetMapping("show")
	public @ResponseBody String show() {
		
		return customerService.show().toString();
	}
	
	
	@Autowired
	private JDBCTemplateRepository jdbcTemplateRepo;
	

	
	@GetMapping("showJdbc")
	public @ResponseBody String showJdbc() {
		return jdbcTemplateRepo.getAllRecords();
	}
	
}
