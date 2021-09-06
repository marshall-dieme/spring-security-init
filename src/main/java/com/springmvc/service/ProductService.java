package com.springmvc.service;

import java.util.ArrayList;
import java.util.List;

import com.springmvc.model.Product;

import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private static List<Product> products = new ArrayList<>();

    static {
        products.add(new Product(1, "Milk", "milk", 1500, 50));
        products.add(new Product(2, "Sugar", "Sugar", 1500, 50));
        products.add(new Product(3, "Spaghetti", "spaghetti", 1500, 50));
        products.add(new Product(4, "Lakh", "lakh", 1500, 50));
        products.add(new Product(6, "Rice", "thiere", 1500, 50));
        products.add(new Product(7, "Coca-Cola", "coca-cola", 1500, 50));
        products.add(new Product(8, "Pressea", "pressea", 1500, 50));
        products.add(new Product(9, "Pepsi", "pepsi", 1500, 50));
        products.add(new Product(10, "Tomatoes", "tomatoes", 1500, 50));
        products.add(new Product(11, "Potatoes", "potatoes", 1500, 50));
        products.add(new Product(12, "Carrots", "carrots", 1500, 50));
        products.add(new Product(13, "Fish", "fish", 1500, 50));
        products.add(new Product(14, "Meat", "meat", 1500, 50));
    }

    public List<Product> getProducts(){
        return products;
    }

    public Product getProduct(int id){
        Product p = null;
        for (Product product : products) {
            if (product.getId() == id) {
                p = product;
                break;
            }
        }
        return p;
    }
}