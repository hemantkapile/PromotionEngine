package com.mk.pe.service;

import java.util.List;

import com.mk.pe.config.Configurer;
import com.mk.pe.interfaces.ProductService;
import com.mk.pe.model.Product;
import com.mk.pe.model.PromoConfig;

public class ProductServiceImpl implements ProductService {

	@Override
	public void getPriceByType(Product product) {
		switch (product.id)
	    {
	        case "A":
	            product.price = 50;

	            break;
	        case "B":
	            product.price = 30;

	            break;
	        case "C":
	            product.price = 20;

	            break;
	        case "D":
	            product.price = 15;
	            break;
	    }
		
	}

	@Override
	public int getTotalPrice(List<Product> products) {
		int counterOfA = 0;
	    int priceOfA = Configurer.priceValueMap.get("A");
	    int counterOfB = 0;
	    int priceOfB = Configurer.priceValueMap.get("B");
	    int counterOfC = 0;
	    int priceOfC = Configurer.priceValueMap.get("C");
	    int counterOfD = 0;
	    int priceOfD = Configurer.priceValueMap.get("D");

	    for (Product pr : products)
	    {
	        switch (pr.id)
	        {
	            case "A":
	            case "a":
	                counterOfA += 1;
	                break;
	            case "B":
	            case "b":
	                counterOfB += 1;
	                break;
	            case "C":
	            case "c":
	                counterOfC += 1;
	                break;
	            case "D":
	            case "d":
	                counterOfD += 1;
	                break;
	        }
	    }
	    PromoConfig pcA = Configurer.configMap.get("A");
	    PromoConfig pcB = Configurer.configMap.get("B");
	    PromoConfig pcCD = Configurer.configMap.get("CD");
	    
	    int totalPriceOfA = (counterOfA / pcA.getQty()) * pcA.getOfferPrice() + (counterOfA % pcA.getQty() * priceOfA);
	    int totalPriceOfB = (counterOfB / pcB.getQty()) * pcB.getOfferPrice() + (counterOfB % pcB.getQty() * priceOfB);
	    int totalPriceOfC = 0;
	    int totalPriceOfD = 0;
	    if(counterOfC == counterOfD) {
	    	 totalPriceOfC = (counterOfC *pcCD.getOfferPrice());
	    	 totalPriceOfD = 0;
	    	
	    }else {
	    	 totalPriceOfC = (counterOfC * priceOfC);
		     totalPriceOfD = (counterOfD * priceOfD);
	    }
	    return totalPriceOfA + totalPriceOfB + totalPriceOfC + totalPriceOfD;
	
	}

}
