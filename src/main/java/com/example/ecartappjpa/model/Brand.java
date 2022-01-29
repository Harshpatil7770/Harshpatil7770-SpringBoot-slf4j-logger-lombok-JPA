package com.example.ecartappjpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="brands")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Brand {

	@Id
	//@Column(name="brand_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int brandId;
	
	@Column(name="brand_name")
	private String brandName;
	
	
}
