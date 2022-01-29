package com.example.ecartappjpa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.ecartappjpa.model.Category;
import com.example.ecartappjpa.model.Product;
@Repository
public interface CategoryDao extends JpaRepository<Category,Integer> {

//	@Query(value="select * from products p inner join brands b on p.brand_brand_id=b.brand_id inner join categories c on p.category_category_id=c.category_id where c.category_name=?",nativeQuery=true)
//	List<Product> findByCategoryName(String categoryName);

}
