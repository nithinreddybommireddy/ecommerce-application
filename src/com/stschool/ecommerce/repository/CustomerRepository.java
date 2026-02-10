package com.stschool.ecommerce.repository;

import com.stchool.ecommerce.model.Customer;

public class CustomerRepository {
      public Customer addNewCustomer ( Customer customer){
          System.out.println(" Added New Customer :");
          System.out.println("Customer details:" + customer);
          return  customer;

      }
}
