import java.util.*;
public class Swap {
	public void swap(int x,int y) {
		x = x + y; 
        y = x - y; 
        x = x - y;
        System.out.println("Swapped x: "+x);
        System.out.println("Swapped y: "+y);
    
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter x = ");
        int x = sc.nextInt();
        System.out.println("Enter y = ");
        int y = sc.nextInt();
        Swap s= new Swap();
        s.swap(x, y);
        
	}

}
