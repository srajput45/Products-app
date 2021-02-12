package com.rakuten.training.dal;

import java.util.List;

import com.rakuten.training.domain.Review;

public interface ReviewDAO {

	Review save(Review r);

	Review findByPoduct(int i);

	List<Review> findByPoduct_Id(int pid);

}