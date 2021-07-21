package com.mohit.graded.Customer.Relationship.Management.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mohit.graded.Customer.Relationship.Management.model.Customer;

public interface CustomerService {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);

	public void deleteCustomer(int theId);
	
}

