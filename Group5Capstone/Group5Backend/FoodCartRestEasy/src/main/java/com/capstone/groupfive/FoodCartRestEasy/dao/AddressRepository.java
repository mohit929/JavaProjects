package com.capstone.groupfive.FoodCartRestEasy.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.capstone.groupfive.FoodCartRestEasy.entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address,Integer> {

}
