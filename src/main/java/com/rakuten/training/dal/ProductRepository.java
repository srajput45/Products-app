package com.rakuten.training.dal;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.rakuten.training.domain.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

	public List<Product> findByPrice(float p);

	public List<Product> findByNameLike(String s);

	public List<Product> findByPriceLessThan(float p);

	@Query("select p from Product p where p.qoh = :q")
	public List<Product> myComplexQuery(@Param("q") int i);
}
