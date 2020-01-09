package com.cms.deloitte.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

import com.cms.deloitte.dao.CustomerDAO;
import com.cms.deloitte.dao.impl.CustomerDAOImpl;
import com.cms.deloitte.model.Customer;

public class LaunchCustomerApplication {

	public static void startCustomerApp()
	{
		
while(true)
{
		System.out.println("####  welcome to customer App#####");
		System.out.println("####1 ) Add customer App     #####");
		System.out.println("####2 ) update customer      #####");
		System.out.println("####4 ) Delete customer      #####");
		System.out.println("####5 ) Fetch all customer   #####");
		System.out.println("####6 ) Exit                 #####");
	
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your choice(1-6)");
	int choice=scanner.nextInt();

	CustomerDAO customerDAO=new CustomerDAOImpl();
	if(choice==1)
	{
	
		Customer customer = new Customer();
		customer.acceptCustomerDetails();
		boolean result=false;
		if (customerDAO.isCustomerExists(customer.getCustomerId())) {
			
			System.out.println(customer.getCustomerId()+ "already exists");
			//result = customerDAO.addCustomer(customer);
		}
		else
		{
			result=customerDAO.addCustomer(customer);

			System.out.println(customer.getCustomerId()+ "added successfuly");
			
		}
		}
	
	if(choice==2)
	{
		System.out.println("please enter mew details");
		Customer customer = new Customer();
		customer.acceptCustomerDetails();
		
		if(customerDAO.isCustomerExists(customer.getCustomerId()))
				{
			
			customerDAO.updateCustomer(customer);
			System.out.println(customer.getCustomerName()+ " updated successfully");
				}
		else
		{
			System.out.println(customer.getCustomerId() +"Does not Exists");
		}
		
		}
	if(choice==3)
	{
		System.out.println("please enter customer ID to delete");
	
	int customerId= scanner.nextInt();
	if(customerDAO.isCustomerExists(customerId))
	{
		customerDAO.deleteCustomer(customerId);
		System.out.println(customerId+"deleted successfully!!");
		
		
	}
	else
	{
		System.out.println(customerId + "does not exists");
	}
	}
	
	if(choice==4)
	{
		
		System.out.println("please enter customer ID to delete");
		
		int customerId= scanner.nextInt();
		if(customerDAO.isCustomerExists(customerId))
		{
			Customer customer = customerDAO.findCustomer(customerId)
		;	System.out.println(customer);
			
			
		}
		else
		{
			System.out.println(customerId + "does not exists");
		}
	}
	if(choice==5)
	{
		List<Customer> allCustomers = new ArrayList<Customer>();
		allCustomers=customerDAO.listCustomers();
		System.out.println("list of all customer");
		System.out.println(allCustomers);
	}
	if(choice==6)
	{
	System.out.println("thank you for using");
	System.exit(0);
		
	}
	}
	
}

}

