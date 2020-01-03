import java.io.Serializable;
import java.util.Scanner;

public class Customer implements Serializable,Comparable<Customer>{
private int CustomerId;
private String CustomerName;
private String CustomerAdd;
private transient int billAmount;   //Rejects user IP and stores default value only


public Customer(int customerId, String customerName, String customerAdd, int billAmount) {
	super();
	CustomerId = customerId;
	CustomerName = customerName;
	CustomerAdd = customerAdd;
	this.billAmount = billAmount;
}

public Customer() {
	
}

public void accept() {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter customer id : "); CustomerId = scanner.nextInt();
	System.out.println("Enter customer name : "); CustomerName = scanner.next();
	System.out.println("Enter customer address : "); CustomerAdd = scanner.next();
	System.out.println("Enter bill amount : "); billAmount = scanner.nextInt();
}
public int getCustomerId() {
	return CustomerId;
}
public void setCustomerId(int customerId) {
	CustomerId = customerId;
}
public String getCustomerName() {
	return CustomerName;
}
public void setCustomerName(String customerName) {
	CustomerName = customerName;
}
public String getCustomerAdd() {
	return CustomerAdd;
}
public void setCustomerAdd(String customerAdd) {
	CustomerAdd = customerAdd;
}
public int getBillAmount() {
	return billAmount;
}
public void setBillAmount(int billAmount) {
	this.billAmount = billAmount;
}

@Override
public String toString() {
	return "[CustomerId : "+CustomerId+",CustomerName : "+CustomerName+",CustomerAdd : "+CustomerAdd+",Bill Amount : "+billAmount+"]";
}
	public static void main(String[] args) {
		Customer customer = new Customer(007,"James Bond","UK",97000);
		System.out.println(customer);
		customer.setBillAmount(50000);
		System.out.println(customer);
	}

	@Override
	public int compareTo(Customer arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

}
