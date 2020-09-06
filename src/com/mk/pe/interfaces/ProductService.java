package com.mk.pe.interfaces;

import java.util.List;

import com.mk.pe.model.Product;

public interface ProductService {

    void getPriceByType(Product product);
    int getTotalPrice(List<Product> products);
}
