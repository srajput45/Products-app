package com.rakuten.training.service;

import java.util.List;

import com.rakuten.training.domain.Review;

public interface ReviewService {

	Review addReviewToProduct(Review r, int productId);

	Review findByPoduct(int i);

	List<Review> findByPoduct_Id(int pid);

}