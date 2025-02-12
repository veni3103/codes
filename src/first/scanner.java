package first;
import java.util.Scanner;

public class scanner {
	public static void main(String args[]) {
		Scanner Scanner= new Scanner(System.in);
		
		
		System.out.println("what is your name?");
		
		String name =Scanner.nextLine();
		
		System.out.println("Hello " + name);

		
		System.out.println("what is your rating from 1 to 5");
		
		
		int rating= Scanner.nextInt();
		if(rating > 5)
		{
			System.out.println("Rating exceed limit");
			return;
		}
		else if(rating <= 0)
		{
			System.out.println("Rating lower than limit");
			return;
		}
		 
		System.out.println("Rating : "+rating);
		
		System.out.print("your age");
		
		int age = Scanner.nextInt();
		
		System.out.print("age :"+age);
		
	
		
	}
	

}
