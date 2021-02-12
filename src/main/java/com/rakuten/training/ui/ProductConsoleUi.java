package com.rakuten.training.ui;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rakuten.training.domain.Product;
import com.rakuten.training.service.ProductSerivce;
import com.rakuten.training.service.ProductServiceImpl;

@Component
public class ProductConsoleUi {

	ProductSerivce service; // = new ProductServiceImpl();

	@Autowired
	public void setService(ProductSerivce service) {
		this.service = service;
	}

	public void createProductWithUi() {

		try (Scanner kb = new Scanner(System.in)) {
			System.out.println("Enter a Name: ");
			String name = kb.nextLine();
			System.out.println("Enter a Prise: ");
			float price = Float.parseFloat(kb.nextLine());
			System.out.println("Enter a Qoh: ");
			int qoh = Integer.parseInt(kb.nextLine());

			Product toBeCreated = new Product(name, price, qoh);
			int id = service.createNewProduct(toBeCreated);
			System.out.println("Created Product with ID: " + id);
		}

	}

}
