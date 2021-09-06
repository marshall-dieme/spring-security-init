package com.springmvc.service;

import java.util.ArrayList;
import java.util.List;

import com.springmvc.model.Customer;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    private static List<Customer> customers = new ArrayList<>();
    private static int ids = 0;
    Customer c = null;

    static {
        customers.add(new Customer(++ids, "Marshall Dieme", "marshall", "dieme"));
    }

    public List<Customer> findCustomers(){
        return customers;
    }

    public boolean signIn(String username, String password){
        for (Customer customer : customers) {
            if (customer.getUsername().equals(username) && customer.getPassword().equals(password)) {
                c = customer;
                return true;
            }
        }
        return false;
    }

    public Customer getCustomer(){
        return c;
    }

    public void addCustomer(Customer c){
        customers.add(c);
    }

}