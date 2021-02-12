package com.rakuten.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rakuten.training.dal.ProductDAO;
import com.rakuten.training.dal.ProductDAOInMemImpl;
import com.rakuten.training.domain.Product;

@Service
@Transactional
public class ProductServiceImpl implements ProductSerivce {

	// ProductDAO dao = new ProductDAOInMemImpl();

	ProductDAO dao;

	@Autowired
	public void setDao(ProductDAO dao) {
		this.dao = dao;
	}

	@Override
	public int createNewProduct(Product toBeCreated) {
		if (toBeCreated.getPrise() * toBeCreated.getQoh() >= 10000) {
			Product created = dao.save(toBeCreated);
			return created.getId();
		} else {
			throw new IllegalArgumentException("The Product is less than 10k");
		}
	}

	@Override
	public void removeExisting(int id) {
		Product existing = dao.findById(id);
		if (existing == null) {
			throw new IllegalArgumentException("Product doesnot Exist");
		}
		if (existing.getPrise() * existing.getQoh() >= 100000) {
			throw new IllegalStateException("Can't delete Product with value greater than 10k");
		}
		dao.deleteById(id);

	}
	
//	public void changePrice(Product id) {
//		
//	}
	
	
	@Override
	public List<Product> findAll() {

		return dao.findAll();

	}

	@Override
	public Product findById(int id) {

		return dao.findById(id);
	}

}
