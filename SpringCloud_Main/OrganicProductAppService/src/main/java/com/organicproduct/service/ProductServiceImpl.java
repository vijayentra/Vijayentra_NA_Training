package com.organicproduct.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.organicproduct.exception.InvalidProductException;
import com.organicproduct.model.Product;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ProductServiceImpl implements IProductService{
	
private static List<Product> productList=new ArrayList<Product>();	  
	
	public static List<Product> getProductList() {
		return productList;
	}

	public static void setProductList(List<Product> productList) {
		ProductServiceImpl.productList = productList;
	}

	@Override
	public Product addProduct(Product product) throws InvalidProductException {
		for(Product p : productList) {
			if(p.getProductId().equals(product.getProductId())) {
				log.error("Product ID already exists!");
				throw new InvalidProductException("Product ID already exists!");
			}
		}
		productList.add(product);
		log.info("Product with Product Id "+product.getProductId()+" added successfully");
		return product;
	}
	
	public Product getProduct(Product b1) {
		
		for(Product p : productList) {
			if(p.getProductId().equals(b1.getProductId())) {
				return p;
			}
		}
		return null;
	}
	
	@Override
	public Product updateProductQuantity(String productId, int quantity) throws InvalidProductException {
		for(Product p : productList) {
			if(p.getProductId().equals(productId)) {
				p.setQuantity(quantity);
				return p;
			}
		}
		log.error("Invalid Product Id");
		throw new InvalidProductException("Invalid Product Id");
	}

	@Override
	public List<Product> viewOrganicProduct(String productType) {
		List<Product> list = new ArrayList<>();
		for(Product p : productList) {
			if(p.getProductType().equals(productType)) {
				list.add(p);
			}
		}
		return list;
	}

	@Override
	public List<Product> viewAllProduct() {
		return productList;
	}
	
	public ProductServiceImpl() {
		populateProducts();
	}
	public void populateProducts() {
		
		//If needed, you can uncomment the below lines and use the objects to check your application
		
		
//		productList.add(new Product("AP101","OrganicManure",125,50,"Organic"));
//		productList.add(new Product("AP102","DAP",75,35,"NonOrganic"));
//		productList.add(new Product("AP103","Seaweed",50,35,"Organic"));
//		productList.add(new Product("AP104","AmoniumSulphate",100,35,"NonOrganic"));
//		productList.add(new Product("AP105","Urea",50,25,"NonOrganic"));
//		productList.add(new Product("AP106","Biovita",45,50,"Organic"));
//		productList.add(new Product("AP107","NitroPhosphate",50,55,"NonOrganic"));
//		productList.add(new Product("AP108","Maxicrop",45,45,"Organic"));
//		productList.add(new Product("AP109","DiammoniumPhosphate",125,25,"NonOrganic"));

	}

}
