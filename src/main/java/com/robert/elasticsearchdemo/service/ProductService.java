package com.robert.elasticsearchdemo.service;

import com.robert.elasticsearchdemo.dto.ProductDto;
import com.robert.elasticsearchdemo.entity.Product;
import com.robert.elasticsearchdemo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product addProduct(ProductDto productDto) {
        Product product = new Product(productDto.getId(), productDto.getName(), productDto.getPrice());
        return productRepository.save(product);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}
