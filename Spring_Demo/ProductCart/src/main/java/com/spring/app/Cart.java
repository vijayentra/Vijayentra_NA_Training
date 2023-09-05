package com.spring.app;

import java.util.ArrayList;

public class Cart {

	// fill the code
	private ArrayList<Product> productList;
	
	public void setProductList(ArrayList<Product> productList) {
		this.productList=productList;
	}
	public ArrayList<Product> getProductList(){
		return productList;
	}
}
