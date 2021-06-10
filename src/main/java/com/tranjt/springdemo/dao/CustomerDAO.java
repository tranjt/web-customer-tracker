package com.tranjt.springdemo.dao;

import java.util.List;

import com.tranjt.springdemo.entity.Customer;

public interface CustomerDAO {
	
	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);
}
