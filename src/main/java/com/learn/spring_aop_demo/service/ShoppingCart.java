package com.learn.spring_aop_demo.service;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
    public void checkout(String status){
        //Logging
        //Authentication & Authorization
        //Sanitize the data
        System.out.println("checkout method of shopping cart called");
    }

    public int quantity(){
        return 2;
    }
}
