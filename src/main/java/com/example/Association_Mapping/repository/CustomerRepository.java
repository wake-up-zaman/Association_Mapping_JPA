package com.example.Association_Mapping.repository;


import com.example.Association_Mapping.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
