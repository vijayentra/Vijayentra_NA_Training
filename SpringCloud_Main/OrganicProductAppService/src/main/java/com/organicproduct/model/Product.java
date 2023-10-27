package com.organicproduct.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
	
	@NotNull(message = "Provide value for product Id")
	private String productId; 
	@NotNull(message = "Provide value for product name")
	private String productName;
	@Min(value = 1, message = "Provide value greater than zero")
	private int quantity;
	private double costPerKg;
	@NotNull(message = "Provide value for product type")
	private String productType;
	

	
	
}
