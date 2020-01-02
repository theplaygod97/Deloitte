import java.io.File;
import java.io.IOException;
public class Batchmates {
	

		public static void main(String[] args) throws IOException {
			boolean dirFlag = false;
			File file = new File("D:\\Day 8\\IO\\Batch\\BatchMates.txt");
			File stockDir = new File("D:\\Day 8\\IO\\Batch");
				
			if(file.exists()) {
				System.out.println("File hai,khud dekh le");
			}
			else {
			
			
				try {
				   dirFlag = stockDir.mkdirs();
				   file.createNewFile();
				   System.out.println("Baan gai File,dekh le");
				} catch (SecurityException Se) {
				System.out.println("Error while creating directory in Java:" + Se);
				}

				if (dirFlag)
				   System.out.println("Directory created successfully");
				else
				   System.out.println("Directory was not created successfully");
								
				System.out.println("Ho gaya");		
		}
									 
		      File[] paths;
		  
		      try {      
		         
		         // array of files and directory
		         paths = stockDir.listFiles();
		         
		         // for each name in the path array
		         for(File path : paths) {
		        	
		            // prints filename and directory name
		        	if(path.isFile())
		            System.out.println(path.getName()+" - is a File");
		        	else
		        	 System.out.println(path.getName()+" - is a Folder");	         
		         			}
		         	}
		      catch (Exception e) {
		         // if any error occurs
		         e.printStackTrace();
		      		}

		}	
	}


