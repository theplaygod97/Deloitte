
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
public class SerializationDemo {

	public static void main(String[] args) throws Exception, IOException {
		Customer customer =new Customer();
		customer.accept();
		
		ObjectOutputStream stream = 
				new ObjectOutputStream(new BufferedOutputStream(
				new FileOutputStream(new File("delu.txt"))));
		stream.writeObject(customer);
		stream.close();
		System.out.println("Data Stored");
		
		
	}

}
