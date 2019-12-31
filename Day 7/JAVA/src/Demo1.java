import java.util.InputMismatchException;
import java.util.Scanner;
public class Demo1{
 
	public static void main(String arg[])
    {  
		try
		{
			// declare and initialize here.
			int a,b,c;
			Scanner KB=new Scanner(System.in);
			
			// input numbers here.
			System.out.print("Enter first number : ");
			a=KB.nextInt();
       
			System.out.print("Enter second number : ");
			b=KB.nextInt();
       
			//throw to catch
			c=a/b;
			System.out.println("Result:"+c);
		}
		catch(InputMismatchException e)
		{
			System.out.println("Error:"+e.getMessage());
			System.out.println("Dont be smart,Don't enter Char");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Error:"+e.getMessage());
			System.out.println("NOOB don't enter 0");
		}
		// here program ends.
		System.out.println("End of Program...");
	}
}

