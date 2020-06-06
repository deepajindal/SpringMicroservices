package com.example.spring.rest;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.model.Product;
import com.example.spring.service.ProductService;

@RestController
@RequestMapping("/api")
public class ProductController {
	
	ProductService productService;

	public ProductController(ProductService productService) {
		this.productService = productService;
	}
	
	@GetMapping("/products")
	public ResponseEntity<List<Product>> getAllProducts(){
		return ResponseEntity.ok(productService.getProducts());
	}
	
	@PostMapping("/products")
	public ResponseEntity<Product> createProduct(@RequestBody Product product){
		return ResponseEntity.ok(productService.createProduct(product));
	}
	
	@GetMapping("/products/{productId}")
	public ResponseEntity<Product> getProductById(@PathVariable("productId") int id){
		return ResponseEntity.ok(productService.getProductById(id));
	}
	
	@DeleteMapping("/products/{productId}")
	public ResponseEntity<String> removeProduct(@PathVariable("productId") int id){
		productService.removeProduct(id);
		return ResponseEntity.ok("Product removed having Id: "+id);
	}
	
}
