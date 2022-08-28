package com.example.projectecommercecrudservices.controller;

import com.example.projectecommercecrudservices.bean.Product;
import com.example.projectecommercecrudservices.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductServices productServices;

    @PostMapping("/addproduct")
    public Product addProduct(@RequestBody Product product)
    {
        return  productServices.saveProduct(product);
    }
    @PostMapping("/addproducts")
    public List<Product> addProducts(@RequestBody List<Product> products)
    {
        return productServices.saveProducts(products);
    }

    @GetMapping("/products")
    public List<Product> findAllProducts()
    {
        return productServices.getProducts();
    }
    @GetMapping("/productbyid/{id}")
    public Product findProductById(@PathVariable int id)
    {
        return productServices.getProductById(id);
    }

    @GetMapping("/productbyname/{name}")
    public Product findProductByName(String name)
    {
        return  productServices.getProductByName(name);
    }


    @PostMapping("/updateProducts")
    public Product updateProduct(@RequestBody Product product)
    {
        return productServices.updateProduct(product);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id)
    {
        return productServices.deleteProduct(id);
    }

}
