package com.springmvc.controller;

import com.springmvc.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@SessionAttributes("user")
public class UserController {
    @Autowired
    CustomerService customerService;

    

    // @RequestMapping(value = "/login", method = RequestMethod.POST)
    // public String login(@RequestParam String username, @RequestParam String password, ModelMap model) {
    //     if (customerService.signIn(username, password)) {
    //         model.put("user", customerService.getCustomer());
    //         return "redirect:home"; 
    //     }
    
    //     return "/";
    // }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home(ModelMap model){
        return "home";
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(SessionStatus status){
        status.setComplete();
        return "redirect:/";
    }

}