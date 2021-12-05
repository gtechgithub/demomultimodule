package com.gopal.persistentJdbc;


public class CustomerEntity {

	private int id;
	private String customerName;
	
	CustomerEntity(){
		
	}
	
	public String getCustomerName() {
		return customerName;
	}



	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}

	
	@Override
	public String toString() {
		return "Values of CustomerEntity id:"+ id + " customername:" + customerName;
	}
}
