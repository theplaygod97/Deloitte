
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
public class TreeSetDemo {

	public static void main(String[] args) {
		//TreeSet names = new TreeSet();
		//names.add("Sumeet");
		//names.add("Zeeshan");
		//names.add("Abhishek");
		
		//System.out.println(names);
		
		
		
		List names1 = new ArrayList();
		names1.add("Sumeet");
		names1.add("Zeeshan");
		names1.add("Abhishek");
		System.out.println(names1);
		names1.add(2,"Berlin");
		System.out.println(names1);
		names1.remove("Sumeet");
		System.out.println(names1);
		System.out.println(names1.isEmpty());
		System.out.println(names1.size());
		
		Set names2 = new HashSet(); 
		names2.add("Sumeet");
		names2.add("Zeeshan");
		names2.add("Abhishek");
		System.out.println(names2);
		names2.remove("Sumeet");
		System.out.println(names2);
		
		
	}

}
