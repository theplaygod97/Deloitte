import java.util.Hashtable;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		Map<Integer,String> allData = new Hashtable<Integer,String>();
		allData.put(100,"Police");
		allData.put(101,"Fire");
		allData.put(102,"Ambulance");
		
		System.out.println(allData);
		
		
	}

}
