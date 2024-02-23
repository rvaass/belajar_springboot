package com.tutorial.spring.controller;

import com.tutorial.spring.model.Products;
import com.tutorial.spring.repository.ProductRepository;
import com.tutorial.spring.service.ProductImpl;
import com.tutorial.spring.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")

public class ProductsController {

    @Autowired
    private ProductService productService;

//    @Autowired
//    private ProductRepository productRepository;
//    @Autowired
//    private ProductImpl productImpl;
//
//    @GetMapping
//    public List<Products> getAllProduct (){
//        return productImpl.getAllProduct();
//    }
//
//    @GetMapping("/helloworld")
//    public String helloWorld() {
//        return "Hello World";
//    }

//    @PostMapping
    public Products createProduct(@RequestBody Products product) {
        return productService.addProducts(product);
    }
}

