package com.example.Association_Mapping.repository;


import com.example.Association_Mapping.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Integer> {

}
