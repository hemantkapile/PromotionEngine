package com.mk.pe.model;

public class Product {

	public Product(String id, double price) {
		super();
		this.id = id;
		this.price = price;
	}
	public String id;
    public double price;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
