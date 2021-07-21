package com.capstone.groupfive.FoodCartRestEasy;

import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.swing.text.DefaultEditorKit.CutAction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.capstone.groupfive.FoodCartRestEasy.dao.AddressRepository;
import com.capstone.groupfive.FoodCartRestEasy.dao.CustomerRepository;
import com.capstone.groupfive.FoodCartRestEasy.dao.OrderRepository;
import com.capstone.groupfive.FoodCartRestEasy.entity.Address;
import com.capstone.groupfive.FoodCartRestEasy.entity.Customer;
import com.capstone.groupfive.FoodCartRestEasy.entity.Order;
import com.capstone.groupfive.FoodCartRestEasy.service.CheckoutService;
import com.capstone.groupfive.FoodCartRestEasy.service.CheckoutServiceImpl;

@SpringBootApplication
public class FoodCartRestEasyApplication {



	public static void main(String[] args) {
		SpringApplication.run(FoodCartRestEasyApplication.class, args);

	}



}
