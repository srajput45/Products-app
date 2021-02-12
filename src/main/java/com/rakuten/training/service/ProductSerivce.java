package com.rakuten.training.service;

import java.util.List;

import com.rakuten.training.domain.Product;

public interface ProductSerivce {

	public int createNewProduct(Product toBeCreated);

	public void removeExisting(int id);

	public List<Product> findAll();

	public Product findById(int id);

}
