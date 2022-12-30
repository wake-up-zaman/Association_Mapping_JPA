package com.example.Association_Mapping.entity;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    public Item(String name) {
        this.name=name;
    }

    public Item() {

    }

    //   Bidirectional OneToOne
    // No need to initialize this code if parent entity declare JoinTable
    @OneToOne(cascade = CascadeType.ALL,mappedBy = "item")
    private Customer customer;


    //   Bidirectional OneToMany
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="customer_id")
    private Customer customer;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }


//       Bidirectional ManyToMany
    @ManyToMany(cascade = CascadeType.ALL,mappedBy = "items")
    private Set<Customer> customer=new HashSet<>();
    public Set<Customer> getCustomer() {
        return customer;
    }

    public void setCustomer(Set<Customer> customer) {
        this.customer = customer;
    }

}
