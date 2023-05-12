package com.nl.data.entity;

import com.nl.contracts.ProductAddRequest;

import javax.annotation.Generated;
import javax.persistence.*;

@Entity
@Table(name = "products",schema = "ecom")
public class Product {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "price", nullable = false)
    private double price;
    @Column(name = "available", nullable = false)
    private boolean available;
    @Column(name = "category")
    private String category;

    public Product(){};
    public Product(ProductAddRequest pr){
        this.available=pr.isAvailable();
        this.category=pr.getCategory();
        this.description=pr.getDescription();
        this.name=pr.getName();
        this.price=pr.getPrice();
    }

}