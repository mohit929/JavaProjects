package com.capstone.groupfive.FoodCartRestEasy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.groupfive.FoodCartRestEasy.entity.User;
import com.capstone.groupfive.FoodCartRestEasy.service.RegisterService;

@RestController
public class RegisterController {
	@Autowired
	private RegisterService service;
    
	//Used for registration purpose
	@PostMapping("/registeruser")
	@CrossOrigin(origins = "http://localhost:4200")
	public User registerUser(@RequestBody User user) throws Exception {

		String tempEmail = user.getEmail();
		if (tempEmail != null && "".equals(tempEmail)) {
			User userobj = service.fetchUserByEmail(tempEmail);
			if (userobj != null) {
				throw new Exception("user with " + tempEmail + "is already exist");
			}
		}
		User userObj = null;
		userObj = service.saveUser(user);
		return userObj;

	}

    //Used for login purpose
	@PostMapping("/login")
	@CrossOrigin
	public User loginUser(@RequestBody User user) throws Exception {
		// checking email is present in database or not
		// if not exception wrong credentials
		String tempEmail = user.getEmail();
		String tempPass = user.getPassword();
		User userObj = null;
		if (tempEmail != null && tempPass != null) {
			userObj = service.fetchUserByEmailAndPassword(tempEmail, tempPass);
		}
		if (userObj == null) {
			throw new Exception("bad credentials");
		}
		return userObj;
	}

}
