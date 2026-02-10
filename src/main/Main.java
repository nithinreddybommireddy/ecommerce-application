package main;

import com.com.stchool.ecommerce.ui.CustomerMenu;
import com.stchool.ecommerce.model.Customer;
import com.stschool.ecommerce.controller.CustomerController;
import com.stschool.ecommerce.service.CustomerService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Sign Up");
        System.out.println("Enter Choice");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                CustomerMenu customerMenu = new CustomerMenu();
                Customer customer = customerMenu.inputCustomerSignupDetails();
                CustomerController customerController = new CustomerController();
                Customer newCustomer = customerController.handleSignUp(customer);

                CustomerService customerService = new CustomerService();
                customerService.displayCustomerDetails(newCustomer);
                break;

        }

    }
}
