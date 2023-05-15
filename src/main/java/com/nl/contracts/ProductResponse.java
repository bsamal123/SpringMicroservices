package com.nl.contracts;

import com.nl.data.entity.Product;

public class ProductResponse {
    private long id;
    private String name;
    private String description;

    public ProductResponse(Product p){
        this.id = p.getId();
        this.name = p.getName();
        this.description = p.getDescription();
        this.category = p.getCategory();
        this.price = p.getPrice();
        this.isAvailable = p.isAvailable();
    }
    public ProductResponse(int id, String name, String description, String category, double price, boolean isAvailable) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.category = category;
        this.price = price;
        this.isAvailable = isAvailable;
    }
    public ProductResponse(){

    }

    private String category;

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    private double price;
    private boolean isAvailable;
}
