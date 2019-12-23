//local and instance variables
//i instance,j local

package VARPACK;

public class Demo {
int i;
int num=10;
public void display() {
	int j;
	if(num == 10) {
		j=20;
	}
	else j =20;
//without else compile time error-j not initialized
	System.out.println((i+num)-j);
	
}

public static void main(String[] args) {
	Demo d = new Demo();
	d.display();
}
}
