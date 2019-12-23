package OOPS;
import java.util.*;
public class Employee {
	public int employeeId;
	public String employeeName;
	public String employeeAddress;
	public int salary;

	public void takeSalary() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter employeeID = ");
	employeeId = sc.nextInt();
	System.out.println("Enter employeeName = ");
	employeeName = sc.next();
	System.out.println("Enter employeeAddress = ");
	employeeAddress = sc.next();
	System.out.println("Enter Salary = ");
	salary = sc.nextInt();
	}
	
	public void printEmployeeDetails() {
		System.out.println("Employee ID = "+employeeId);
		System.out.println("Employee Name = "+employeeName);
		System.out.println("Employee Address = "+employeeAddress);
		System.out.println("Employee Salary (in $) = "+salary);
	}
}
