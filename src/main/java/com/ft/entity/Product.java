package com.ft.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="product_tbl")
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productId;
    private String productName;
    private String productPrice;
}
