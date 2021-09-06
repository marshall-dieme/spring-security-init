package com.springmvc.service;

import java.util.Date;
import java.util.List;

import com.springmvc.model.Customer;
import com.springmvc.model.Order;
import com.springmvc.model.Product;

import org.springframework.stereotype.Service;

@Service
public class OrderService {
    
    private static int id = 0;

    public void addOrder(Customer customer, Order o){
        customer.addOrder(o);
    }

    public Order createOrder(List<Product> products){
        Order order = new Order();
        order.setId(++id);
        order.setOrderDate(new Date());
        order.setProducts(products);
        int total = 0;
        for (Product product : products) {
            total += product.getPrice() * product.getCommand();
        }
        order.setTotalCost(total);

        return order;
    }
}