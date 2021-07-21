package com.capstone.groupfive.FoodCartRestEasy.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capstone.groupfive.FoodCartRestEasy.entity.User;
@Repository
public interface RegisterRepository extends JpaRepository<User,Integer> {
	public User findByEmail(String email);

	public User findByEmailAndPassword(String email, String password);

}
