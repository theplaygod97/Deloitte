import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Set_Wrapper {

	public static void main(String[] args) {
		Set<String> names  = new LinkedHashSet<String>();
		//Iterator<String> i = names.iterator();
		names.add("Jay");
		names.add("Verru");
		names.add("Neha");
		names.add("Spring");
		
		System.out.println(names);
		Iterator<String> i = names.iterator();
		
		while(i.hasNext()) {
			String str = i.next();
			if(str.equals("Neha"))
				continue;
			System.out.println(str);
		}
	}

}
