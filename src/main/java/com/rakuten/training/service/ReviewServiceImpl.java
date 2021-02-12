package com.rakuten.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rakuten.training.dal.ProductDAO;
import com.rakuten.training.dal.ReviewDAO;
import com.rakuten.training.domain.Product;
import com.rakuten.training.domain.Review;

@Service
@Transactional
public class ReviewServiceImpl implements ReviewService {

	@Autowired
	ReviewDAO reviewDAO;

	@Autowired
	ProductDAO productDAO;

	@Override
	public Review addReviewToProduct(Review r, int productId) {
//		To set the foreign key correctly to the review.
		Product p = productDAO.findById(productId);
//		if (p != null) {
//			r.setProduct(p);
//			return reviewDAO.save(r);
//		} else {
//			// if the product is not in the table it will create the product and add the
//			// review in review table. Use cascade in ManyToOne 
//			Product newProduct = new Product("temp", 10000, 10);
//			// productDAO.save(newProduct);
//			r.setProduct(newProduct);
//			return reviewDAO.save(r);
//		}
		
		r.setProduct(p);
		return reviewDAO.save(r);

	}

	@Override
	public Review findByPoduct(int i) {
		return reviewDAO.findByPoduct(i);
	}

	@Override
	public List<Review> findByPoduct_Id(int pid) {
		return reviewDAO.findByPoduct_Id(pid);
	}

}
