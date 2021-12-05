package com.gopal.persistentJdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CustomerRowMapper implements RowMapper<Customer> {

	@Override
	public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {

		Customer cust = new Customer();
		cust.setId( Integer.parseInt(rs.getString("id")));
		cust.setCustomerName(rs.getString("customer_name"));
		
		return cust;
	}

}
