package com.four.service;

import java.util.List;

import com.four.entity.Product;


public interface ProductServiceInterface {
	
	public Product save(Product product);

	public List<Product> reterive();

}

