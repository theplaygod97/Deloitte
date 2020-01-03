import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomDemo {

	public static void main(String[] args) throws IOException {
		RandomAccessFile file = new RandomAccessFile("Raf.txt", "rw");
		//file.writeUTF("Today is friday");
		//System.out.println(file.getFilePointer());
		//file.seek(0);
		System.out.println(file.getFilePointer());
		
		file.seek(file.length());     //set pointer location
		file.writeUTF("Myself Satya");
		file.seek(30);
		String str = file.readLine(); //readUTF for specific portion
									//readLine for reading whole file
		
		file.close();
		
		System.out.println("File content is : ");
		System.out.println(str);

	}

}
