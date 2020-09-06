package com.mk.pe.main;

import java.util.ArrayList;
import java.util.List;

import com.mk.pe.config.Configurer;
import com.mk.pe.model.Product;
import com.mk.pe.service.ProductServiceImpl;

public class Test {

	public static void main(String[] args) {
		
		//Configure Product price and promo offers
		Configurer.setPrice();
		Configurer.addPromos();
		
		//Test use case
		int totalA = testUseCaseA();
		System.out.println( "Result of Scenario A == "+totalA);
		
		int totalB = testUseCaseB();
		System.out.println( "Result of Scenario B == "+totalB);
		
		int totalC = testUseCaseC();
		System.out.println( "Result of Scenario C == "+totalC);
	}

	private static int testUseCaseC() {
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
		return total;
	}
	
	private static int testUseCaseB() {
		ProductServiceImpl ps = new ProductServiceImpl();
		List<Product> products = new ArrayList<>();
		Product p1 = new Product("A",50);
		Product p2 = new Product("A",50);
		Product p3 = new Product("A",50);
		Product p4 = new Product("A",50);
		Product p5 = new Product("A",50);
		Product p6 = new Product("B",30);
		Product p7 = new Product("B",30);
		Product p8 = new Product("B",30);
		Product p9 = new Product("B",30);
		Product p10 = new Product("B",30);
		Product p11 = new Product("C",20);
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
		products.add(p11);
		int total = ps.getTotalPrice(products);
		return total;
	}
	
	
	private static int testUseCaseA() {
		ProductServiceImpl ps = new ProductServiceImpl();
		List<Product> products = new ArrayList<>();
		Product p1 = new Product("A",50);
		Product p2 = new Product("B",30);
		Product p3 = new Product("C",20);
		products.add(p1);
		products.add(p2);
		products.add(p3);
		int total = ps.getTotalPrice(products);
		return total;
	}
	

}
