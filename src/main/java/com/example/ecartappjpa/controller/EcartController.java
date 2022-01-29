package com.example.ecartappjpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ecartappjpa.model.Brand;
import com.example.ecartappjpa.model.Category;
import com.example.ecartappjpa.model.Product;
import com.example.ecartappjpa.service.EcartService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/ecart")
@Slf4j
public class EcartController {

	@Autowired
	EcartService ecartService;
	
	@PostMapping("/addNewBrand")
	Brand addNewBrand(@RequestBody Brand brand) {
		String method="addNewBrand ()";
		log.info(method+"called");
		return ecartService.addNewBrand(brand);
	}
	
	@PostMapping("/addNewListOfBrands")
	public List<Brand> addNewListOfBrands(@RequestBody List<Brand> brands) {
		String method="addNewListOfBrands ()";
		log.info(method+"called");
		return ecartService.addNewListOfBrands(brands);
	}
	
	@PutMapping("/updateBrand")
	public Brand updateBrand(@RequestBody Brand brand) {
		String method="updateBrand ()";
		log.info(method+"called");
		return ecartService.updateBrand(brand);
	}

	@DeleteMapping("/deleteBrand/{brandId}")
	public void deleteBrand(@PathVariable int brandId) {
		String method="deleteBrand ()";
		log.info(method+"called");
		ecartService.deleteBrand(brandId);
	}
	
	@PostMapping("/addNewCategory")
	Category addNewCategory( @RequestBody Category category) {
		String method="addNewCategory ()";
		log.info(method+"called");
		return ecartService.addNewCategory(category);
	}
	
	@PostMapping("/addNewProduct")
	Product addNewProduct(@RequestBody Product product) {
		String method="addNewCategory ()";
		log.info(method+"called");
		return ecartService.addNewProduct(product);
	}
	
	@PostMapping("/addNewListOfProducts")
	List<Product> addNewListOfProducts(@RequestBody List<Product> products){
		String method="addNewCategory ()";
		log.info(method+"called");
		return ecartService.addNewListOfProducts(products);
	}
	
	@PutMapping("/updateProduct")
	public Product updateProduct(@RequestBody Product product) {
		String method="updateProduct ()";
		log.info(method+"called");
		return ecartService.updateProduct(product);
	}
	
	@GetMapping("/filterByCategory/{categoryName}")
	List<Product> filterByCategory(@PathVariable String categoryName){
		String method="filterByCategory ()";
		log.info(method+" called");
		return ecartService.filterByCategory(categoryName);
	}
	
	@GetMapping("/filterByBrand/{brandName}")
	public List<Product> filterByBrand(@PathVariable String brandName) {
		String method="filterByCategory ()";
		log.info(method+" called");
		return ecartService.filterByBrand(brandName);
	}
	
	@GetMapping("/filterByPriceRange/{minPrice}/{maxPrice}")
	List<Product> filterByPriceRange(@PathVariable double minPrice,@PathVariable double maxPrice){
		String method="filterByCategory ()";
		log.info(method+" called");
		return ecartService.filterByPriceRange(minPrice, maxPrice);
	}
}
