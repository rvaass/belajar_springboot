package com.tutorial.spring.service;
import com.tutorial.spring.model.Products;
import com.tutorial.spring.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Products addProducts (Products product){
        return productRepository.save(product);
    }

    @Override
    public List<Products> getAllProduct () {
        return productRepository.findAll();
    }

}
