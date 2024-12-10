package com.example.productsale.model;

public class FragileProduct extends Product {
    private double fragilityCoefficient;

    // Default constructor
    public FragileProduct() {
    }

    public FragileProduct(int identifier, String code, String name, double price, String description, double fragilityCoefficient) {
        super(identifier, code, name, price, description);
        this.fragilityCoefficient = fragilityCoefficient;
    }

    public double getFragilityCoefficient() {
        return fragilityCoefficient;
    }

    @Override
    public String toString() {
        return super.toString() + ", Fragility Coefficient: " + fragilityCoefficient;
    }
}