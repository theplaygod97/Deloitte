package com;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client {

	public static void main(String args[]) {

		Configuration cfg = new Configuration().configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		try {
		 Employee employee1 = new Employee(1222, "Radha"); session.save(employee1); 
		 session.save(employee1);
			
		 RegularEmployee employee2 = new RegularEmployee(41000,9000);
		 employee2.setEmployeeId(111); employee2.setEmployeeName("Arjun");
		 session.save(employee2);
		
		 ContractEmployee employee3 = new ContractEmployee(30,5000);
		 employee3.setEmployeeId(211); employee3.setEmployeeName("Ram");
		 session.save(employee3);
		 
		 
		tx.commit();
		}catch(Exception e) {
			tx.rollback();
		}
		System.out.println(tx.wasCommitted());
		System.out.println(tx.wasRolledBack());
		session.close();
		System.out.println("Emp details saved!!");
		factory.close();

	}
}