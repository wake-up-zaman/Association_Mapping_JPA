package com.example.Association_Mapping.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    public Customer(String name){
        this.name=name;
    }
    public Customer() {

    }

//    parent table created foreign key of child table
//    UniDirectional/BiDirectional OneToOne
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="fk_item")
    private Item item;

    public Item getItem() {
    return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }


//  UniDirectional OneToOne with new Table
    @OneToOne(cascade = CascadeType.ALL)
    @JoinTable(name="customer_item",
    joinColumns = {@JoinColumn(name="customer_id")},
    inverseJoinColumns = {@JoinColumn(name="item_id")}
    )
    private Item item;
    public Item getItem() {
    return item;
}

    public void setItem(Item item) {
        this.item = item;
    }

//  UniDirectional OneToMany
//  To create OneToMany relationship and create foreign key in child table
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="customer_id")
    private List<Item> items=new ArrayList<>();

    public List<Item> getItems() {
    return items;
    }

    public void setItems() {
        this.items = items;
    }

//  UniDirectional OneToMany  with new Table
//  To create OneToMany relationship and create another new table
    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name="customer_item",
    joinColumns = {@JoinColumn(name="customer_id")},
    inverseJoinColumns = {@JoinColumn(name="item_id")}
    )
    private List<Item> items=new ArrayList<>();

    public List<Item> getItems() {
        return items;
    }

    public void setItems() {
        this.items = items;
    }

    //Bidirectional OneToMany
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "customer")
    private List<Item> items=new ArrayList<>();

    public List<Item> getItems() {
    return items;
    }
    public void setItems() {
        this.items = items;
    }


    //UniDirectional ManyToMany
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Item> items=new HashSet<>();
    public Set<Item> getItems() {
        return items;
    }

    public void setItems(Set<Item> items) {
        this.items = items;
    }

    //UniDirectional ManyToMany with create new Table
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name="customer_item",
    joinColumns = {@JoinColumn(name="customer_fk")},
    inverseJoinColumns = {@JoinColumn(name="item_fk")}
    )
    private Set<Item> items=new HashSet<>();
    public Set<Item> getItems() {
        return items;
    }

    public void setItems(Set<Item> items) {
        this.items = items;
    }


    //BiDirectional ManyToMany
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Item> items=new HashSet<>();
    public Set<Item> getItems() {
        return items;
    }

    public void setItems(Set<Item> items) {
        this.items = items;
    }

}







