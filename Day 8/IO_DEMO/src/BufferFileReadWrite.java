import java.io.*; 
public class BufferFileReadWrite
{ 
  public static void main(String[] args) throws Exception 
  { 
    // pass the path to the file as a parameter 
   BufferedReader bufferReader = 
		   new BufferedReader(new FileReader("D:\\github.txt")); 
   BufferedWriter bufferWriter =
		   new BufferedWriter(new FileWriter("D:\\git-copy.txt"));
    int i; 
    while ((i=bufferReader.read()) != -1) 
      bufferWriter.write((char) i); 
    
    
    bufferWriter.close();
    bufferReader.close();
  } 
} 