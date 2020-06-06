package com.example.spring.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.spring.model.Product;

@Repository("productDao")
@EnableAutoConfiguration
@EnableTransactionManagement
public class ProductDaoImpl implements ProductDao {

	private EntityManager entityManager;

	@Autowired
	public ProductDaoImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	@Transactional
	public List<Product> getProducts() {
		Session session = entityManager.unwrap(Session.class);
		TypedQuery<Product> query = session.createQuery("From Product", Product.class);
		return query.getResultList();
	}

	@Override
	@Transactional
	public Product createProduct(Product product) {
		
		Session session = entityManager.unwrap(Session.class);
		session.save(product);
		return product;
	}

}
