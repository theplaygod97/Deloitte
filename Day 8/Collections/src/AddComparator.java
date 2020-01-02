import java.util.Comparator;

public class AddComparator implements Comparator<Customer>{

	@Override
	public int compare(Customer c1, Customer c2) {
		if((c1.getCustomerAdd().compareTo( c2.getCustomerAdd())>0))
		 return 0;
		else
			return -1;
	}

}
