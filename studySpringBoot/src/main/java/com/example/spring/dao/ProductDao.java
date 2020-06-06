package com.example.spring.dao;

import java.util.List;

import com.example.spring.model.Product;

public interface ProductDao {
	List<Product> getProducts();

	Product createProduct(Product product1);
}
