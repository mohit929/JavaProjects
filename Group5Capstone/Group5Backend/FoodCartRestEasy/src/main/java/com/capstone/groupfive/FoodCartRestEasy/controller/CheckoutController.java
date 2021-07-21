package com.capstone.groupfive.FoodCartRestEasy.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.annotations.Check;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.groupfive.FoodCartRestEasy.dto.Purchase;
import com.capstone.groupfive.FoodCartRestEasy.entity.Address;
import com.capstone.groupfive.FoodCartRestEasy.entity.Customer;
import com.capstone.groupfive.FoodCartRestEasy.entity.Order;
import com.capstone.groupfive.FoodCartRestEasy.service.CheckoutServiceImpl;

@RestController
@Transactional
public class CheckoutController {
	@Autowired
	CheckoutServiceImpl checkoutServiceImpl;
    
	//Saving the order details
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/checkout")
	public void saveOrderDetails(@RequestBody Purchase purchase)
	{   
	 checkoutServiceImpl.saveOrderDetails(purchase);	
	}
}


