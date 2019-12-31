
public class Demo2ChckExc {
	public void display1() throws Exception{
		System.out.println("Welcome in display");
		Thread.sleep(1000);
		System.out.println("Bye");
	}
	public void display2() throws InterruptedException{
		System.out.println("Welcome in display");
		Thread.sleep(1000);
		System.out.println("Bye");
	}
	
	
	public static void main(String[] args) throws Exception{
		System.out.println("MAIN STARTED");
		Demo2ChckExc d=new Demo2ChckExc();
		d.display1();
		d.display2();
		System.out.println("MAIN ENDED");
	}

}
