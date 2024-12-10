package com.example.productsale.model;

public class PerishableProduct extends Product {
    private int maxStorageTime;

    // Default constructor
    public PerishableProduct() {
    }

    public PerishableProduct(int identifier, String code, String name, double price, String description, int maxStorageTime) {
        super(identifier, code, name, price, description);
        this.maxStorageTime = maxStorageTime;
    }

    public int getMaxStorageTime() {
        return maxStorageTime;
    }

    @Override
    public String toString() {
        return super.toString() + ", Max Storage Time: " + maxStorageTime + " days";
    }
}