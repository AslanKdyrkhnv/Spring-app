// package com.example.productsale.service;

// import com.example.productsale.model.Product;
// import org.springframework.stereotype.Service;

// import java.util.ArrayList;
// import java.util.List;

// @Service
// public class ProductService {
//     private List<Product> products;

//     public ProductService() {
//         products = new ArrayList<>();
//     }

//     public void addProduct(Product product) {
//         product.setIdentifier(products.size() + 1);
//         products.add(product);
//     }

//     public List<Product> getProducts() {
//         return products;
//     }

//     public Product getProductById(int id) {
//         return products.stream()
//                 .filter(product -> product.getIdentifier() == id)
//                 .findFirst()
//                 .orElse(null);
//     }

//     public void updateProduct(int id, Product updatedProduct) {
//         Product product = getProductById(id);
//         if (product != null) {
//             product.setCode(updatedProduct.getCode());
//             product.setName(updatedProduct.getName());
//             product.setPrice(updatedProduct.getPrice());
//             product.setDescription(updatedProduct.getDescription());
//         }
//     }

//     public void deleteProduct(int id) {
//         products.removeIf(product -> product.getIdentifier() == id);
//     }
// }


package com.example.productsale.service;

import com.example.productsale.model.Product;
import com.example.productsale.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    // Add a new product
    public void addProduct(Product product) {
        productRepository.save(product); // Save the product to the database
    }

    // Get all products
    public List<Product> getProducts() {
        return productRepository.findAll(); // Retrieve all products from the database
    }

    // Get a product by ID
    public Product getProductById(int id) {
        return productRepository.findById(id).orElse(null); // Find product by ID or return null
    }

    // Update an existing product
    public void updateProduct(int id, Product updatedProduct) {
        Product existingProduct = getProductById(id);
        if (existingProduct != null) {
            existingProduct.setCode(updatedProduct.getCode());
            existingProduct.setName(updatedProduct.getName());
            existingProduct.setPrice(updatedProduct.getPrice());
            existingProduct.setDescription(updatedProduct.getDescription());
            productRepository.save(existingProduct); // Save the updated product to the database
        }
    }

    // Delete a product by ID
    public void deleteProduct(int id) {
        productRepository.deleteById(id); // Delete the product by ID from the database
    }
}
