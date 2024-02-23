package com.tutorial.spring.service;

import com.tutorial.spring.model.Products;

import java.util.List;

public interface ProductService {
    Products addProducts (Products product);
    List<Products> getAllProduct ();
}
