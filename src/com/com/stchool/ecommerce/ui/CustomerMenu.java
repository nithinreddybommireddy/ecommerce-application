package com.com.stchool.ecommerce.ui;

import com.stchool.ecommerce.model.Customer;

import java.util.Scanner;

public class CustomerMenu {
    public Customer inputCustomerSignupDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID:");
        String id = sc.next();
        System.out.println("Enter First Name:");
        String firstName = sc.next();
        System.out.println("Enter Last Name:");
        String lastName = sc.next();
        System.out.println("Enter Email:");
        String email = sc.next();
        Customer customer = new Customer();
        customer.setId(id);
        customer.setFirstName(firstName);
        customer.setLastName(lastName);
        customer.setEmail(email);
        sc.close();
        return customer;
    }
}