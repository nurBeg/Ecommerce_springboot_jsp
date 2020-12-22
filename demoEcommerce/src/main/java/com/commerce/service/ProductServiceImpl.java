package com.commerce.service;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import com.commerce.models.Product;

@Service
public class ProductServiceImpl implements ProductService {

	private List<Product> listOfProducts = Arrays.asList(new Product(1, "Samsung S", "more RAM", 123.30, "Samsung AG"),
														 new Product(2, "LG ", "Display HD", 443.30, "LG AG"),
			                                             new Product(3, "Mercedes Benz", "AMD", 333333.33, "Daimer AG"));

	@Override
	public Product getProductById(Integer productId) {
		
		Predicate<Product> isById = p -> String.valueOf(p.getId()).equals(String.valueOf(productId));
		return filterProducts(isById);
	}

	private Product filterProducts(Predicate<Product> strategy) {
		return getAllProducts().stream()
										.filter(strategy)
										.findFirst()
										.orElse(null);
	}

	@Override
	public List<Product> getAllProducts() {
		return listOfProducts;
	}

}
