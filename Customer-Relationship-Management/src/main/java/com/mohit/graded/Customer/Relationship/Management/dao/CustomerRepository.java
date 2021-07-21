package com.mohit.graded.Customer.Relationship.Management.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mohit.graded.Customer.Relationship.Management.model.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {

}
