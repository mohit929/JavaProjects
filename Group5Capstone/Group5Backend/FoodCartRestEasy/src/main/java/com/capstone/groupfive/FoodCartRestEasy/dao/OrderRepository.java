package com.capstone.groupfive.FoodCartRestEasy.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capstone.groupfive.FoodCartRestEasy.entity.Order;
@Repository
public interface OrderRepository extends JpaRepository<Order,Integer>{

}
