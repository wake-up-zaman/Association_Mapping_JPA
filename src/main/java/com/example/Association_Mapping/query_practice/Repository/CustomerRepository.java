package com.example.Association_Mapping.query_practice.Repository;

import com.example.Association_Mapping.query_practice.Dto.OrderResponse;
import com.example.Association_Mapping.query_practice.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {

    @Query("SELECT new com.example.Association_Mapping.query_practice.Dto.OrderResponse(c.name , p.productName) FROM Customer c JOIN Product p")
    public List<OrderResponse> getJoinInformation();
}
