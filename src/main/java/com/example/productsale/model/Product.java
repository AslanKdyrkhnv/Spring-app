package com.example.productsale.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

public class Product {
    private int identifier;

    @NotBlank(message = "Code is mandatory")
    private String code;

    @NotBlank(message = "Name is mandatory")
    private String name;

    @Positive(message = "Price must be greater than zero")
    private double price;

    @NotBlank(message = "Description is mandatory")
    private String description;

    // Default constructor
    public Product() {
    }

    public Product(int identifier, String code, String name, double price, String description) {
        this.identifier = identifier;
        this.code = code;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public int getIdentifier() {
        return identifier;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ID: " + identifier + ", Code: " + code + ", Name: " + name + ", Price: $" + price + ", Description: " + description;
    }
}