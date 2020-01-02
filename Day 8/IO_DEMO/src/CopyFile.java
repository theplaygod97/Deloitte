import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CopyFile {

	public static void main(String[] args) throws IOException {
		Scanner SC = new Scanner(System.in);
		System.out.println("Enter which file to copy :");
		
		String RF = SC.next();
		try {
		FileReader fileReader = 
			      	new FileReader(RF); 
		File F = new File(RF);
	    if(F.exists()) {
			System.out.println("File present");
		
		System.out.println("Enter where you want to copy your file :");
		String WF = SC.next();
		FileWriter fileWriter = 
					new FileWriter(WF);	  
			    int i; 
			    
			    while ((i=fileReader.read()) != -1) {
			    	
			    	//System.out.print(" "+(char) i+" "); 
			    	//System.out.println("Copying Contents");
			    	fileWriter.write((char)i);
			    }
			    fileReader.close();
			    fileWriter.close();
			    System.out.println("Success!Copied "+RF+" in "+WF);
			    
	    }
	    else {
		System.out.println("No File named "+RF+" Found");
	    	}
		}
		catch(Exception e) {
			System.out.println("Exception : No File Found");	
		}
	}
	
}
