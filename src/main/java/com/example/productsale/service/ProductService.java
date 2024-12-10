package com.example.productsale.service;

import com.example.productsale.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> products;

    public ProductService() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        product.setIdentifier(products.size() + 1);
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    public Product getProductById(int id) {
        return products.stream()
                .filter(product -> product.getIdentifier() == id)
                .findFirst()
                .orElse(null);
    }

    public void updateProduct(int id, Product updatedProduct) {
        Product product = getProductById(id);
        if (product != null) {
            product.setCode(updatedProduct.getCode());
            product.setName(updatedProduct.getName());
            product.setPrice(updatedProduct.getPrice());
            product.setDescription(updatedProduct.getDescription());
        }
    }

    public void deleteProduct(int id) {
        products.removeIf(product -> product.getIdentifier() == id);
    }
}
