package com.example.ecartappjpa.service;

import java.util.List;

import com.example.ecartappjpa.model.Brand;
import com.example.ecartappjpa.model.Category;
import com.example.ecartappjpa.model.Product;

public interface EcartService {

	Brand addNewBrand(Brand brand);
	
	List<Brand> addNewListOfBrands(List<Brand> brands);
	
	Brand updateBrand(Brand brand);
	
	void deleteBrand(int brandId);
	
	Category addNewCategory(Category category);
	
	Product addNewProduct(Product product);
	
	List<Product> addNewListOfProducts(List<Product> products);
	
	Product updateProduct(Product product);
	
	List<Product> filterByCategory(String categoryName);
	
	List<Product> filterByBrand(String brandName);
	
	List<Product> filterByPriceRange(double minPrice,double maxPrice);
	
}
