package com.example.productsale.model;

public class OversizedProduct extends Product {
    private int height;
    private int width;
    private int length;

    // Default constructor
    public OversizedProduct() {
    }

    public OversizedProduct(int identifier, String code, String name, double price, String description, int height, int width, int length) {
        super(identifier, code, name, price, description);
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return super.toString() + ", Dimensions: " + height + "x" + width + "x" + length;
    }
}