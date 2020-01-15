package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.config.AppConfig;

public class AppSpring {
	public static void main(String[] args) {

		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		Customer customer = context.getBean(Customer.class);
		customer.setCustomerId(1);
		customer.setCustomerName("Satya");
		customer.setCustomerAddress("BBSR");
		customer.setBillAmount(1234);

		ContactDetails contactDetails = context.getBean(ContactDetails.class);
		contactDetails.setEmailId("GMAIL");
		contactDetails.setMobileNum("7008");

		System.out.println(customer);

		Customer customer1 = context.getBean(Customer.class);
		System.out.println(customer1);

		context.registerShutdownHook();

	}
}