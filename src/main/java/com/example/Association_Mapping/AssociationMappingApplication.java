package com.example.Association_Mapping;

import com.example.Association_Mapping.entity.Item;
import com.example.Association_Mapping.entity.Customer;
import com.example.Association_Mapping.repository.ItemRepository;
import com.example.Association_Mapping.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import  org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AssociationMappingApplication implements CommandLineRunner {
	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private ItemRepository itemRepository;
	public static void main(String[] args) {
		SpringApplication.run(AssociationMappingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{

		//OneToOne
//		Customer customer =new Customer("Tom");
//		Item item1=new Item("Item1");
//		customer.setItem(item1);

		//OneToMany
		Customer customer =new Customer("Tom");
		Item item1=new Item("Item1");
		Item item2=new Item("Item2");
		customer.getItems().add(item1);
		customer.getItems().add(item2);

		item1.setCustomer(customer);
		item2.setCustomer(customer);

//		//ManyToMany
//		Customer customer =new Customer("Tom");
//		Item item1=new Item("Item1");
//		Item item2=new Item("Item2");
//		customer.getItems().add(item1);
//		customer.getItems().add(item2);


		customerRepository.save(customer);

	}
}
