import finance.*;
public class Welcome {
	public static void main(String[] args) {
	System.out.println("Welcome in Core Java");
	C1 c1 = new C1();
	c1.sayWelcome();
	C2 c2 = new C2();
	c2.sayWelcome();
	C3 c3 = new C3();
	c3.sayWelcome();
	C4 c4 = new C4();
	c4.sayWelcome();
	
	Salary salary = new Salary();
	int result = salary.calculateSalary(45000, 5000);
	System.out.println(result);
	
}
}
