package com.capstone.groupfive.FoodCartRestEasy.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="order_details")
public class Order {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO,generator="native")
	@GenericGenerator(name = "native",strategy = "native")
	private int order_id;
	@Column(name="total_quantity")
	private int total_quantity;
	@Column(name="total_price")
	private double total_price;
	@OneToOne(cascade = CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="address_id")
	private Address address;
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "customer_id")
	private Customer customer;

	
	public Order(int total_quantity, double total_price, Address address, Customer customer) {
		super();
		this.total_quantity = total_quantity;
		this.total_price = total_price;
		this.address = address;
		this.customer = customer;
	}


	public int getTotal_quantity() {
		return total_quantity;
	}


	public void setTotal_quantity(int total_quantity) {
		this.total_quantity = total_quantity;
	}


	public double getTotal_price() {
		return total_price;
	}


	public void setTotal_price(double total_price) {
		this.total_price = total_price;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	@Override
	public String toString() {
		return "Order [total_quantity=" + total_quantity + ", total_price=" + total_price + ", address=" + address
				+ ", customer=" + customer + "]";
	}


	
	
	


}
