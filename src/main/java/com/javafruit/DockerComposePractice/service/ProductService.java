package com.javafruit.DockerComposePractice.service;

// ProductService.java
import com.javafruit.DockerComposePractice.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
    Product getProductById(Long id);
    Product createProduct(Product product);
    Product updateProduct(Long id, Product product);
    void deleteProduct(Long id);
}

