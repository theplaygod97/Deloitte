package com.cms.deloitte.model;

import java.io.Serializable;
import java.util.Scanner;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="hr.customer500")
public class Customer implements Serializable{
		@Id
 		private int customerId;
	
		@Column(name = "CName")
		private String customerName;
 

		@Column(name = "CAdd")
		private String customerAddress;
		
		@Column(name = "Bill")
		private int billAmount;
		
		public void acceptCustomerDetails(int ID) {
			Scanner scanner = new Scanner(System.in);
			customerId = ID;
			System.out.println("Enter customer name : "); customerName = scanner.next();
			System.out.println("Enter customer address : "); customerAddress = scanner.next();
			System.out.println("Enter bill amount : "); billAmount = scanner.nextInt();
		}
		
		public void updateCustomerDetails(int ID) {
			Scanner scanner = new Scanner(System.in);
			customerId = ID;
			System.out.println("Enter new customer name : "); customerName = scanner.next();
			System.out.println("Enter new customer address : "); customerAddress = scanner.next();
			System.out.println("Enter new bill amount : "); billAmount = scanner.nextInt();
		}
		
		public void deleteCustomerDetailsID(int ID) {
			customerId = ID;
		}
		
		public void fetchCustomer(int ID) {
			customerId = ID;
		}
		
		public Customer(int customerId, String customerName, String customerAddress, int billAmount) {
			super();
			this.customerId = customerId;
			this.customerName = customerName;
			this.customerAddress = customerAddress;
			this.billAmount = billAmount;
		}
		
		public Customer() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		public int getCustomerId() {
			return customerId;
		}
		public void setCustomerId(int customerId) {
			this.customerId = customerId;
		}
		public String getCustomerName() {
			return customerName;
		}
		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}
		public String getCustomerAddress() {
			return customerAddress;
		}
		public void setCustomerAddress(String customerAddress) {
			this.customerAddress = customerAddress;
		}
		public int getBillAmount() {
			return billAmount;
		}
		public void setBillAmount(int billAmount) {
			this.billAmount = billAmount;
		}
		
		
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + billAmount;
			result = prime * result + ((customerAddress == null) ? 0 : customerAddress.hashCode());
			result = prime * result + customerId;
			result = prime * result + ((customerName == null) ? 0 : customerName.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Customer other = (Customer) obj;
			if (billAmount != other.billAmount)
				return false;
			if (customerAddress == null) {
				if (other.customerAddress != null)
					return false;
			} else if (!customerAddress.equals(other.customerAddress))
				return false;
			if (customerId != other.customerId)
				return false;
			if (customerName == null) {
				if (other.customerName != null)
					return false;
			} else if (!customerName.equals(other.customerName))
				return false;
			return true;
		}

		
		@Override
		public String toString() {
			return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerAddress="
					+ customerAddress + ", billAmount=" + billAmount + "]";
		}
	

	

}
