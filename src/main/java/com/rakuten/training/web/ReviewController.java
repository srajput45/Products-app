package com.rakuten.training.web;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rakuten.training.dal.ReviewRepository;
import com.rakuten.training.domain.Product;
import com.rakuten.training.domain.Review;
import com.rakuten.training.service.ProductSerivce;
import com.rakuten.training.service.ReviewService;
@CrossOrigin
@RestController
public class ReviewController {

	@Autowired
	ReviewService reviewService;

	@Autowired
	ProductSerivce productService;

	@Autowired
	ReviewRepository revieweRepo;

	@GetMapping("products/{pid}/reviews")
	public ResponseEntity getAllReviewsForOneProduct(@PathVariable("pid") int productId) {
		Product p = productService.findById(productId);
		if (p == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		List<Review> reviewList = reviewService.findByPoduct_Id(productId);
		return new ResponseEntity<>(reviewList, HttpStatus.OK);
	}


	@PostMapping("/products/{pid}/reviews")
	public ResponseEntity addReviewToProduct(@RequestBody Review r, @PathVariable("pid") int productId) {
		Product p = productService.findById(productId);
		if (p == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		Review added = reviewService.addReviewToProduct(r, productId);
		HttpHeaders header = new HttpHeaders();
		header.setLocation(URI.create("/products/"+productId+"/reviews/"+added.getId()));
		return new ResponseEntity<>(added,header,HttpStatus.OK);
	}

}
