package com.four.Dao;

import java.util.List;

import com.four.entity.Product;


public interface ProductDaoInterface {
	
	public boolean create(Product product);
	public List<Product> reterive();
	

}