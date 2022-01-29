package com.example.ecartappjpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ecartappjpa.model.Brand;

@Repository
public interface BrandDao extends JpaRepository<Brand,Integer>{

}
