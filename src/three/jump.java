package three;

import java.util.Scanner;

public class jump {
public static void main( String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		 
		 System.out.println("Enter any number");
		 
		 int n= scanner.nextInt();
		 
		 while(n>=0) {
			 
			 if(n%10==0) {
				 System.out.println(n);
				 break;
			 }
			 
			 n--;
		 }
		 
		 
	}
	
}
	
		