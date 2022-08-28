package com.example.projectecommercecrudservices.services;


import com.example.projectecommercecrudservices.bean.Product;
import com.example.projectecommercecrudservices.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServices {

    @Autowired
    public ProductRepository repository;

    public Product saveProduct(Product product)
    {
      return   repository.save(product);
    }

    public List<Product> saveProducts(List<Product> products)
    {
        return repository.saveAll(products);
    }

    public List<Product> getProducts()
    {
        return repository.findAll();
    }


    public Product getProductById(int id)
    {
        return  repository.findById(id).orElse(null);


    }
    public Product getProductByName(String name)
    {
        return  repository.findByName(name);
    }

    public  String deleteProduct(int id)
    {
        repository.deleteById(id);
        return  "product removed !! " + id;
    }
     public Product updateProduct(Product product)
     {
         Product existingProduct = repository.findById(product.getId()).orElse(null);
         existingProduct.setName(product.getName());
         existingProduct.setCategories(product.getCategories());
         existingProduct.setPrice(product.getPrice());
         existingProduct.setDescriptions(product.getDescriptions());
         existingProduct.setRatings(product.getRatings());


         return repository.save(existingProduct);
     }




}