import java.io.FileWriter;
import java.io.IOException;

public class WriteFile{
public static void main (String[]args) throws IOException 
{
    String fileContent = "HappyNewYEAR 2020";
     
    FileWriter fileWriter = new FileWriter("D:\\HNY.txt");
    fileWriter.write(fileContent);
    fileWriter.close();
    System.out.println("Done");
}}