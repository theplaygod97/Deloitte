import java.io.File;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		File file = new File("D:\\Day 8\\newyear.txt");
		
		if(file.exists()) {
			System.out.println("File hai,khud dekh le");
		}
		else
		file.createNewFile();
		System.out.println("Ban gai File,dekh le");
	
		System.out.println("Ho gaya");
	}

}
