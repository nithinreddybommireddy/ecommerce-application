package com.stschool.ecommerce.service;

import com.stchool.ecommerce.model.Customer;
import com.stschool.ecommerce.repository.CustomerRepository;

public class CustomerService {
        public Customer handleSignUp(Customer customer){
            System.out.println("Customer Service:" + customer);
            CustomerRepository customerRepository = new CustomerRepository();
            return customerRepository.addNewCustomer(customer);


        }
    public void displayCustomerDetails(Customer customer)
    {
        System.out.println("Customer Details:" + customer);
        System.out.println("Customer FirstName:" + customer.getFirstName());
        System.out.println("Customer lastName:" + customer.getLastName());
        System.out.println("Customer  Email: " + customer.getEmail());


    }

}
