package com.cms.deloitte.client;

import java.util.Scanner;

import com.cms.deloitte.dao.impl.CustomerDAOImpl;
import com.cms.deloitte.model.Customer;

public class LaunchCustomerApplication {
	
	public static void startCustomerApp() {
		System.out.println("#####WELCOME TO CUSTOMER APP#####");
		System.out.println("1.Add Customer");
		System.out.println("2.Update Customer");
		System.out.println("3.Delete Customer");
		System.out.println("4.Exit");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your choice [1-4]");
		int Choice = scanner.nextInt();
		switch(Choice) {
		case 1:
			Customer customer = new Customer();
			customer.acceptCustomerDetails();
			CustomerDAOImpl impl= new CustomerDAOImpl();
			boolean result = impl.addCustomer(customer);
			System.out.println(result);
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			System.out.println("Thank you,exiting");
			System.exit(0);
			break;
		default:
			System.out.println("Please enter correct Input");
			break;
		}
		
	}
}
