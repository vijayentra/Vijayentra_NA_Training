package com.organicproduct.service;

import java.util.List;

import com.organicproduct.exception.InvalidProductException;
import com.organicproduct.model.Product;

public interface IProductService {
	
	public Product addProduct(Product product)  throws InvalidProductException;
	public Product updateProductQuantity(String productId,int quantity)  throws InvalidProductException;
	public List<Product> viewOrganicProduct(String productType) ;
	public List<Product> viewAllProduct() ;

}
