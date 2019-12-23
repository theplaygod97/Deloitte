import java.util.*;
public class LEAP {
	public void CheckLeapYear(int year) {
		int y=year;
		if (( year%400 == 0)|| (( year%4 == 0 ) && ( year%100 != 0))) {
			year = y;
		}
		else {
			year = 1;
		}
		
		if(year == 1) {
			System.out.format("\n %d is NOT a Leap Year. \n", y);
		}
		else {
			System.out.format("\n %d is a Leap Year. \n", y);
		}
	}
	public static void main(String[] args) {
		int year, leap;
		Scanner sc = new Scanner(System.in);
		System.out.println(" Please Enter any year you wish: ");
		year = sc.nextInt();
		
		LEAP ly = new LEAP();
		ly.CheckLeapYear(year);
		
		
	}
}
