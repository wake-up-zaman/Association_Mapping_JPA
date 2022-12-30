package com.example.Association_Mapping.query_practice.Repository;

import com.example.Association_Mapping.query_practice.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
