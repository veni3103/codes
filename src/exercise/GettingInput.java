package exercise;
import java.util.Scanner;
public class GettingInput {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("what is your name");
		String name =scanner.nextLine();
		System.out.println("Hello "+name);
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your age");
		int age =scan.nextInt();
		System.out.println("age :" +age);
	}

}
