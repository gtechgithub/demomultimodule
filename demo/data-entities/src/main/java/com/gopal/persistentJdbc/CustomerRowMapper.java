package com.gopal.persistentJdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CustomerRowMapper implements RowMapper<CustomerEntity> {

	@Override
	public CustomerEntity mapRow(ResultSet rs, int rowNum) throws SQLException {

		CustomerEntity cust = new CustomerEntity();
		cust.setId( Integer.parseInt(rs.getString("id")));
		cust.setCustomerName(rs.getString("customer_name"));
		
		return cust;
	}

}
