package com.example.productsale;

import com.example.productsale.model.FragileProduct;
import com.example.productsale.model.PerishableProduct;
import com.example.productsale.model.OversizedProduct;
import com.example.productsale.service.ProductService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
public class ProductSaleApplication implements CommandLineRunner {

    @Autowired
    private ProductService productService;

    public static void main(String[] args) {
        SpringApplication.run(ProductSaleApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        FragileProduct product1 = new FragileProduct(1, "FP001", "Glass Vase", 20.0, "Delicate glass vase", 0.9);
        PerishableProduct product2 = new PerishableProduct(2, "PP001", "Milk", 1.5, "1-liter milk carton", 7);
        OversizedProduct product3 = new OversizedProduct(3, "OP001", "Wardrobe", 150.0, "Wooden wardrobe", 200, 100, 50);

        productService.addProduct(product1);
        productService.addProduct(product2);
        productService.addProduct(product3);
    }
}