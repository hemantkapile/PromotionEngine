package com.mk.pe.main;

import java.util.ArrayList;
import java.util.List;

import com.mk.pe.model.Product;
import com.mk.pe.service.ProductServiceImpl;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductServiceImpl ps = new ProductServiceImpl();
		List<Product> products = new ArrayList<>();
		Product p1 = new Product("A",50);
		Product p2 = new Product("A",50);
		Product p3 = new Product("A",50);
		Product p4 = new Product("B",50);
		Product p5 = new Product("B",50);
		Product p6 = new Product("B",30);
		Product p7 = new Product("B",30);
		Product p8 = new Product("B",30);
		Product p9 = new Product("C",15);
		Product p10 = new Product("D",20);
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		products.add(p5);
		products.add(p6);
		products.add(p7);
		products.add(p8);
		products.add(p9);
		products.add(p10);
		
		
		int total = ps.getTotalPrice(products);
		System.out.println(total);
	}

}
