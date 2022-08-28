package com.example.projectecommercecrudservices.repository;

import com.example.projectecommercecrudservices.bean.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository  extends JpaRepository<Product,Integer>{


    Product findByName(String name);
}
