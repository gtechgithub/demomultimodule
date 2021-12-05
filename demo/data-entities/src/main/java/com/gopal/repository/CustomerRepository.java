package com.gopal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gopal.entities.Customer;

@Repository
public interface CustomerRepository  extends JpaRepository<Customer, Integer>{

}
