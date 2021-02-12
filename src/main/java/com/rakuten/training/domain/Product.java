package com.rakuten.training.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_id")
	int id;
	@Column(name = "product_name")
	String name;
	@Column(name = "product_price")
	float price;
	@Column(name = "product_qoh")
	int qoh;

	public Product() {

	}

	public Product(String name, float prise, int qoh) {
		super();
		this.name = name;
		this.price = prise;
		this.qoh = qoh;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQoh() {
		return qoh;
	}

	public void setQoh(int qoh) {
		this.qoh = qoh;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrise() {
		return price;
	}

	public void setPrise(float prise) {
		this.price = prise;
	}

}
