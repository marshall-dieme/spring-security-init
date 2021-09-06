package com.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import com.springmvc.model.Customer;
import com.springmvc.model.Product;
import com.springmvc.service.OrderService;
import com.springmvc.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("user")
public class OrderController {
    
    @Autowired
    ProductService productService;

    @Autowired
    OrderService orderService;

    List<Product> products = new ArrayList<>();

    @RequestMapping(value = "/my_orders", method = RequestMethod.GET)
    public String list(ModelMap model){
        Customer user = (Customer) model.get("user");
        model.put("orders", user.getOrders());
        return "orders/list";
    }

    @RequestMapping(value = "/new_order", method = RequestMethod.GET)
    public String newOrder(ModelMap model){
        model.put("products", productService.getProducts());
        return "orders/new";
    }

    @RequestMapping(value = "/add_product", method = RequestMethod.POST)
    public String addOrderProduct(@RequestParam int product, @RequestParam int quantity, ModelMap model){
        Product p = productService.getProduct(product);
        if (p != null) {
            p.setCommand(quantity);
            products.add(p);
        }
        model.put("commands", products);
        model.put("products", productService.getProducts());
        return "orders/new";
    }

    @RequestMapping(value = "/save_order", method = RequestMethod.GET)
    public String saveOrder(ModelMap model){
        Customer user = (Customer) model.get("user");
        user.addOrder(orderService.createOrder(products));
        products = new ArrayList<>();
        return "redirect:my_orders";
    }
}