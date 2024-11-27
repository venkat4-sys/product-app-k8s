package com.ft.rest;

import com.ft.entity.Product;
import com.ft.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductRestController {

    @Autowired
    private ProductService productService;

    @PostMapping("/addProduct")
    public ResponseEntity<?> addProduct( @RequestBody Product product){
        String s = productService.saveProduct(product);
        return new ResponseEntity<>(s,HttpStatus.CREATED);
    }

    @GetMapping("/getProducts")
    public ResponseEntity<?> getProducts(Product product){
        List<Product> products = productService.getProducts();
        return new ResponseEntity<>(products,HttpStatus.CREATED);
    }


}
