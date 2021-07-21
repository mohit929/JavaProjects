package com.capstone.groupfive.FoodCartRestEasy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.groupfive.FoodCartRestEasy.dao.RegisterRepository;
import com.capstone.groupfive.FoodCartRestEasy.entity.User;

@Service
public class RegisterService {
	@Autowired
	private RegisterRepository repo;
    
	//Saving the user registration data in the mapped database
	public User saveUser(User user) {
		return repo.save(user);
	}
    
	//Fetching the user details  from the database by email
	public User fetchUserByEmail(String email) {
		return repo.findByEmail(email);
	}
	
    //Fetching the user details from the database by email and password
	public User fetchUserByEmailAndPassword(String email, String password) {
		return repo.findByEmailAndPassword(email, password);
	}

}

