package com.gopal.persistentJdbc;


public class Customer {

	private int id;
	private String customerName;
	
	Customer(){
		
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
		return "id:"+ id + " customername:" + customerName;
	}
}
