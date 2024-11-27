package com.ft.service;

import com.ft.entity.Product;
import org.apache.catalina.LifecycleState;

import java.util.List;

public interface ProductService {
    public String saveProduct(Product product);

    public List<Product> getProducts();
}
