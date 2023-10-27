package com.organicproduct.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.organicproduct.exception.InvalidProductException;
import com.organicproduct.model.Product;
import com.organicproduct.service.IProductService;

import jakarta.validation.Valid;

@RestController
public class ProductController {
	
	@Autowired
	private IProductService productService;
	
	@PostMapping("/add")
	public Product addProduct(@RequestBody@Valid  Product product) throws InvalidProductException
	{
		return productService.addProduct(product);
	}
	
	@PutMapping("/updateQuantity/{productId}/{quantity}")
	public Product updateProductQuantity(@PathVariable String productId,@PathVariable int quantity) throws InvalidProductException {
		
		return productService.updateProductQuantity(productId, quantity);
	
	}
	
	@GetMapping("/viewOrganicProduct/{productType}")
	public List<Product> viewOrganicProduct(@PathVariable String productType) {
		return productService.viewOrganicProduct(productType);
	}
	
	@GetMapping("/viewAll")
	public List<Product> viewAllProduct() {
		return productService.viewAllProduct();
	}
}
