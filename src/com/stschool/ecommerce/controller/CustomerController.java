package com.stschool.ecommerce.controller;

import com.stchool.ecommerce.model.Customer;
import com.stschool.ecommerce.service.CustomerService;

public class CustomerController {
     public Customer handleSignUp(Customer customer)
     {
         System.out.println("Sign up Successful" +customer);
           CustomerService customerService = new CustomerService();
          return customerService.handleSignUp(customer);



     }
}
