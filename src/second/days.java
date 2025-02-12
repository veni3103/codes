package second;
import java.util.Scanner;

public class days {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Enter the number feom 1 to 7");
		
		String res =  scanner.nextLine();
		

		switch (res) {
			
		
		case"1":
			System.out.println(1+":"+ "Monday");
			break;
		case"2":
			System.out.println(2+":"+ "Tuesday");
			break;
		case"3":
			System.out.println(3+":"+ "Wednesday");
			break;
		case"4":
			System.out.println(4+":"+ "Thusday");
			break;
		case"5":
			System.out.println(5+":"+ "Friday");
			break;
		case"6":
			System.out.println(6+":"+ "Saturday");
			break;
		case"7":
			System.out.println(7+":"+ "Sunday");
			break;
			
		}
			
			

	}
		

}
