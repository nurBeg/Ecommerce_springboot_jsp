package com.commerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.commerce.models.Product;
import com.commerce.service.ProductService;

@Controller
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping("/all")
	public String getProducts(Model model) {
		
		List<Product> listOfProducts = productService.getAllProducts();
		model.addAttribute("products", listOfProducts);
		return "product_all";
	}
	
	@GetMapping("/{productId}")
	public String getProductById(Model model, @PathVariable("productId") Integer productId) {
		
		Product productById = productService.getProductById(productId);
		model.addAttribute("product", productById );
		return "product";
	}

}
