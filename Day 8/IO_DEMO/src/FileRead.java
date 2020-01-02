import java.io.*; 
public class FileRead
{ 
  public static void main(String[] args) throws Exception 
  { 
    // pass the path to the file as a parameter 
    FileReader fileReader = 
      new FileReader("D:\\github.txt"); 
  
    int i; 
    while ((i=fileReader.read()) != -1) 
      System.out.print((char) i); 
    
    fileReader.close();
  } 
} 