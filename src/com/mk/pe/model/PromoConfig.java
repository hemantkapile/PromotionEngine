package com.mk.pe.model;

public class PromoConfig {

	private String productName;
	private int qty;
	private int offerPrice;
	
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getOfferPrice() {
		return offerPrice;
	}

	public void setOfferPrice(int offerPrice) {
		this.offerPrice = offerPrice;
	}

	public PromoConfig(String productName, int qty, int offerPrice) {
		super();
		this.productName = productName;
		this.qty = qty;
		this.offerPrice = offerPrice;
	}
}
