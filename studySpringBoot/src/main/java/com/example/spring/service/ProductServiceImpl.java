package com.example.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring.dao.ProductDao;
import com.example.spring.model.Product;

@Service
public class ProductServiceImpl implements ProductService {

	private ProductDao productDao;

	@Autowired
	public ProductServiceImpl(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	@Override
	public List<Product> getProducts() {
		return productDao.getProducts();
	}

	@Override
	public Product createProduct(Product product) {
		productDao.createProduct(product);
		return product;
	}

}
