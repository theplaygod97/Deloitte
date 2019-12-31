import java.util.Scanner;

class InvalidAgeException extends Exception {
public InvalidAgeException() {
	
}	
public InvalidAgeException(String msg) {
	super(msg);
}
}

class NewYearParty{
	int eligibleage =16;
	Scanner sc = new Scanner(System.in);
	int age;
	public void enterClub() throws InvalidAgeException{
		System.out.println("Please enter your age :");
		age = sc.nextInt();
		if(age < eligibleage) {
			throw new InvalidAgeException("Underage");
		}
		else {
			System.out.println("Welcome");
	}
}
}

public class UserdfExcpDemo1 {
public static void main(String[] args) {
	NewYearParty party = new NewYearParty();
	try {
		party.enterClub();
	}
	catch(InvalidAgeException e) {
		System.out.println(e.getMessage());
	}
	
}
}

