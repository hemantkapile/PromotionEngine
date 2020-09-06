package com.mk.pe.config;

import com.mk.pe.model.PromoConfig;
import java.util.HashMap;
import java.util.Map;

public class Configurer {
	
	public static Map<String,Integer> priceValueMap = new HashMap<>();
	public static Map<String,PromoConfig> configMap = new HashMap<>();
	
	public  static void setPrice() {
		priceValueMap.put("A", 50);
		priceValueMap.put("B", 30);
		priceValueMap.put("C", 20);
		priceValueMap.put("D", 15);
		
	}
	
	public  static void clearAllPromos() {
		configMap.clear();
	}

	public  static void addPromos() {
		//clear old promos
		clearAllPromos();
		//Config new promos
		configMap.put("A",new PromoConfig("A", 3, 130));
		configMap.put("B",new PromoConfig("B", 2, 45));
		configMap.put("CD",new PromoConfig("CD", 2, 30));
	}
}
