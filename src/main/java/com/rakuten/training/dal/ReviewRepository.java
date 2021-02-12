package com.rakuten.training.dal;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.rakuten.training.domain.Review;

public interface ReviewRepository extends CrudRepository<Review, Integer> {

	List<Review> findAllById(int id);

}
