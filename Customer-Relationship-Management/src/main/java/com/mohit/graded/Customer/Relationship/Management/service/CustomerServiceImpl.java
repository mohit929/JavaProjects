package com.mohit.graded.Customer.Relationship.Management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mohit.graded.Customer.Relationship.Management.dao.CustomerRepository;
import com.mohit.graded.Customer.Relationship.Management.model.Customer;
@Service
public class CustomerServiceImpl implements CustomerService{
    @Autowired
    CustomerRepository repository;
    public CustomerServiceImpl(CustomerRepository repository) {
		// TODO Auto-generated constructor stub
    	this.repository=repository;
	}
	@Override
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public void saveCustomer(Customer theCustomer) {
		// TODO Auto-generated method stub
		repository.save(theCustomer);
		
	}

	@Override
	public Customer getCustomer(int theId) {
		// TODO Auto-generated method stub
		return repository.getOne(theId);
	}

	@Override
	public void deleteCustomer(int theId) {
		// TODO Auto-generated method stub
		repository.deleteById(theId);
		
	}

}
