package com.capstone.groupfive.FoodCartRestEasy.service;

import org.springframework.stereotype.Service;

import com.capstone.groupfive.FoodCartRestEasy.dto.Purchase;
import com.capstone.groupfive.FoodCartRestEasy.entity.Address;
import com.capstone.groupfive.FoodCartRestEasy.entity.Customer;
import com.capstone.groupfive.FoodCartRestEasy.entity.Order;

@Service
public interface CheckoutService {
public void saveOrderDetails(Purchase purchase);
}
