package com.example.spring.service;

import java.util.List;

import com.example.spring.model.Product;

public interface ProductService {
	public List<Product> getProducts();
	public Product createProduct(Product product);
}
