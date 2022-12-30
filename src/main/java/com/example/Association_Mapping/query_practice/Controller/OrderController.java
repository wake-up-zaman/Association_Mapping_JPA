package com.example.Association_Mapping.query_practice.Controller;

import com.example.Association_Mapping.query_practice.Dto.OrderRequest;
import com.example.Association_Mapping.query_practice.Dto.OrderResponse;
import com.example.Association_Mapping.query_practice.Entity.Customer;
import com.example.Association_Mapping.query_practice.Repository.CustomerRepository;
import com.example.Association_Mapping.query_practice.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController
public class OrderController {
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/placeOrder")
    public Customer placeOrder(@RequestBody OrderRequest request){
        return customerRepository.save(request.getCustomer());
    }

    @GetMapping("/findAllOrders")
    public List<Customer> findAllOrders(){
        return customerRepository.findAll();
    }

    @GetMapping("/getInfo")
    public List<OrderResponse> getJoinInformation(){
        return customerRepository.getJoinInformation();
    }
}
