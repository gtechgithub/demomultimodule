package com.gopal.persistentJdbc;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class JDBCTemplateRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	
	public String getAllRecords() {
		 List<Customer> custList =  jdbcTemplate.query("select * from customer", new CustomerRowMapper());
		 return custList.get(0).toString();
	}
	
}

