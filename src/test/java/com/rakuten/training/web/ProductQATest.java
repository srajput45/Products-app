package com.rakuten.training.web;

import org.springframework.web.client.RestTemplate;

import com.rakuten.training.domain.Product;

public class ProductQATest {

	public static void main(String[] args) {
		RestTemplate template = new RestTemplate();
		template.getForObject("http://localhost:8080/products/8", Product.class);
	}
}
