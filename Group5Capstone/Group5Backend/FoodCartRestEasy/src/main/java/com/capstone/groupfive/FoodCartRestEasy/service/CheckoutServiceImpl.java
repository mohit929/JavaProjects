package com.capstone.groupfive.FoodCartRestEasy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.groupfive.FoodCartRestEasy.dao.AddressRepository;
import com.capstone.groupfive.FoodCartRestEasy.dao.CustomerRepository;
import com.capstone.groupfive.FoodCartRestEasy.dao.OrderRepository;
import com.capstone.groupfive.FoodCartRestEasy.dto.Purchase;
import com.capstone.groupfive.FoodCartRestEasy.entity.Address;
import com.capstone.groupfive.FoodCartRestEasy.entity.Customer;
import com.capstone.groupfive.FoodCartRestEasy.entity.Order;

@Service
public class CheckoutServiceImpl implements CheckoutService{

	@Autowired
	CustomerRepository customerRepository;
	public CheckoutServiceImpl(CustomerRepository customerRepository) {

		this.customerRepository=customerRepository;
	}
    //Saving the order details 
	@Override
	public void saveOrderDetails(Purchase purchase)
	{   //Fetching the order from dto 
		Order order=purchase.getOrder();
		//Fetching the customer from dto 
		Customer customer=purchase.getCustomer();
		//Fetching the address from dto
		Address address=purchase.getAddress();
		//Setting the address inside order for one to one mapping
		order.setAddress(address);
		//Setting the order inside customer for one to many mapping
		customer.add(order);
		//Saving the details using respective repository
		customerRepository.save(customer);

	}}


