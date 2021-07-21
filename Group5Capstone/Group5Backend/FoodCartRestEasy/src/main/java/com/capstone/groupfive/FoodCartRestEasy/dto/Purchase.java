package com.capstone.groupfive.FoodCartRestEasy.dto;

import com.capstone.groupfive.FoodCartRestEasy.entity.Address;
import com.capstone.groupfive.FoodCartRestEasy.entity.Customer;
import com.capstone.groupfive.FoodCartRestEasy.entity.Order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*  Data Transfer object class  comprising the object 
  references of entity classes such as 'Order','Customer' and 'Address' */
public class Purchase {
	private Customer customer;
	private Address address;
	private Order order;
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Purchase(Customer customer, Address address, Order order) {
		super();
		this.customer = customer;
		this.address = address;
		this.order = order;
	}
	@Override
	public String toString() {
		return "Purchase [customer=" + customer + ", address=" + address + ", order=" + order + "]";
	}

}
