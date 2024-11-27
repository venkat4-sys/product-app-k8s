package com.ft.service;

import com.ft.entity.Product;
import com.ft.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements  ProductService {

    @Autowired
    private ProductRepo productRepo;

    @Override
    public String saveProduct(Product product) {
        Product save = productRepo.save(product);
        if(save !=null){
            return "product added";
        }
        return null;
    }

    @Override
    public List<Product> getProducts() {
        List<Product> all = productRepo.findAll();
        return all;
    }
}
