package com.robert.elasticsearchdemo.controller;

import com.robert.elasticsearchdemo.dto.ProductDto;
import com.robert.elasticsearchdemo.entity.Product;
import com.robert.elasticsearchdemo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("add")
    public ResponseEntity<Product> addProduct(@RequestBody ProductDto productDto) {
        Product product = productService.addProduct(productDto);
       return ResponseEntity.ok(new Product(productDto.getId(), productDto.getName(), productDto.getPrice()));
    }

    @GetMapping("all")
    public ResponseEntity<List<Product>> getAllProducts() {
        return ResponseEntity.ok(productService.getAllProducts());
    }
}

