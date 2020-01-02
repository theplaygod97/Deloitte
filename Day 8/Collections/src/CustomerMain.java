import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class CustomerMain {

	public static void main(String[] args) {
		List<Customer>allCustomers = new ArrayList<Customer>();
		Customer customer1 = new Customer(101, "Pooja", "Pune", 98000); 
		allCustomers.add(customer1);
		allCustomers.add(new Customer(102, "Jay", "Delhi", 56000));
		allCustomers.add(new Customer(103, "Tarun", "Mumbai", 12000));
		allCustomers.add(new Customer(104, "Harish", "Jaipur", 3000));
		allCustomers.add(new Customer(105, "Ahmed", "Bangalore", 20000));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter how u want to sort ?"
							+ "\n1.Bill"
							+ "\n2.Name"
							+ "\n3.Address");
		int choice = sc.nextInt();
		
		if(choice == 1) {
		System.out.println("Sorting based on Bill");
		Collections.sort(allCustomers);
		System.out.println(allCustomers);
		}
		
		else if(choice == 2) {
		System.out.println("Sorting based on Name");
		Collections.sort(allCustomers,new NameComparator());
		System.out.println(allCustomers);
		}
		
		else {
		
		Collections.sort(allCustomers,new AddComparator());
		System.out.println("Sorting based on Address");
		System.out.println(allCustomers);
		}
		
		//System.out.println(allCustomers);
	}

	

}
