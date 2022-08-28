package com.example.projectecommercecrudservices.bean;


import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product {
    public Product() {

    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String categories;
    private double price;
    private String descriptions;
    private int ratings;

    public Product(int id, String name, String categories, double price, String descriptions, int ratings) {
        this.id = id;
        this.name = name;
        this.categories = categories;
        this.price = price;
        this.descriptions = descriptions;
        this.ratings = ratings;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public int getRatings() {
        return ratings;
    }

    public void setRatings(int ratings) {
        this.ratings = ratings;
    }
}
