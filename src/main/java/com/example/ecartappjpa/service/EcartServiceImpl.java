package com.example.ecartappjpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ecartappjpa.dao.BrandDao;
import com.example.ecartappjpa.dao.CategoryDao;
import com.example.ecartappjpa.dao.ProductDao;
import com.example.ecartappjpa.model.Brand;
import com.example.ecartappjpa.model.Category;
import com.example.ecartappjpa.model.Product;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class EcartServiceImpl implements EcartService {

	@Autowired
	BrandDao brandDao;

	@Autowired
	CategoryDao categoryDao;

	@Autowired
	ProductDao productDao;

	@Override
	public Brand addNewBrand(Brand brand) {
		String method = "addNewBrand()";
		log.info(method + "called");
		return brandDao.save(brand);
	}

	@Override
	public Category addNewCategory(Category category) {
		String methodName = "addNewCategory()";
		log.info(methodName + "called");
		return categoryDao.save(category);
	}

	@Override
	public Product addNewProduct(Product product) {
		String methodName = "addNewProduct()";
		log.info(methodName + "called");
		return productDao.save(product);
	}

	@Override
	public List<Product> addNewListOfProducts(List<Product> products) {
		String methodName = "addNewProduct()";
		log.info(methodName + "called");
		List<Product> lists = productDao.saveAll(products);
		return lists;
	}

	@Override
	public Product updateProduct(Product product) {
		Product existingProduct = productDao.findById(product.getProductId()).orElse(null);
		existingProduct.setProductId(product.getProductId());
		existingProduct.setProductName(product.getProductName());
		existingProduct.setQuantity(product.getQuantity());
		existingProduct.setPrice(product.getPrice());

		String methodName = "updateProduct()";
		log.info(methodName + "called");
		return productDao.save(product);
	}

	@Override
	public List<Brand> addNewListOfBrands(List<Brand> brands) {
		String method = "addNewListOfBrands()";
		log.info(method + " called");
		return brandDao.saveAll(brands);
	}

	@Override
	public Brand updateBrand(Brand brand) {
		Brand existingBrand = brandDao.findById(brand.getBrandId()).orElse(null);
		existingBrand.setBrandId(brand.getBrandId());
		existingBrand.setBrandName(brand.getBrandName());
		String methodName = "updateBrand()";
		log.info(methodName + "called");
		return brandDao.save(brand);
	}

	@Override
	public void deleteBrand(int brandId) {
		String methodName = "deleteBrand()";
		log.info(methodName + "called");
		brandDao.deleteById(brandId);

	}

	@Override
	public List<Product> filterByCategory(String categoryName) {
		String methodName = "filterByCategory()";
		log.info(methodName + "called");
		return productDao.findByCategoryName(categoryName);
	}

	@Override
	public List<Product> filterByBrand(String brandName) {
		String methodName = "filterByBrand()";
		log.info(methodName + "called");
		return productDao.findByBrandName(brandName);
	}

	@Override
	public List<Product> filterByPriceRange(double minPrice, double maxPrice) {
		String methodName = "filterByBrand()";
		log.info(methodName + "called");
		return productDao.findByminPriceAndmaxPrice(minPrice,maxPrice);
	}

}
