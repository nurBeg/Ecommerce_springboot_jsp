package com.commerce.service;

import java.util.List;

import com.commerce.models.Product;

public interface ProductService {
	Product getProductById(Integer productId);
	List<Product> getAllProducts();
	
}
