package com.tranjt.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tranjt.springdemo.dao.CustomerDAO;
import com.tranjt.springdemo.entity.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	// need to inject the customer DAO
	@Autowired
	private CustomerDAO customerDAO;
	

	@RequestMapping("/list")
	public String listCustomers(Model theModel) {
		
		// get customer from the DAO
		List<Customer> theCustomers = customerDAO.getCustomers();
		
		// add the customers to the model
		theModel.addAttribute("customers", theCustomers);
		
		return "list-customers";
	}
	
}
