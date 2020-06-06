package com.example.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.spring.dao.ProductDao;
import com.example.spring.model.Product;

@SpringBootApplication
public class StudySpringBootApplication implements CommandLineRunner{
	
	@Autowired
	ProductDao productDao;

	public static void main(String[] args) {
		SpringApplication.run(StudySpringBootApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		Product product1 = new Product("Fan", 10000.0);
		Product product2 = new Product("Book JAVA", 20000.0);
		Product product3 = new Product("Lipstick", 20000.0);
		
		productDao.createProduct(product1);
		productDao.createProduct(product2);
		productDao.createProduct(product3);
	}

}
