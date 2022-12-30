package com.example.Association_Mapping.query_practice.Dto;


import com.example.Association_Mapping.query_practice.Entity.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderRequest {

    private Customer customer;
}

