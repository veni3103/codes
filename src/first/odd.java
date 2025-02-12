package first;
import java.util.Scanner;

public class odd {
	public static void main(String args[]) {
		
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int n= scanner.nextInt();
		 
		for(int i=1;i<n*2;i+=2)
		{
			System.out.println(i);
		}

		}

}
