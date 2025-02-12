package three;

import java.util.Scanner;

public class exercise {
	
public static void main( String args[]) {
		
	double n,sum =0.0;
		Scanner scanner = new Scanner(System.in);
		
		 
		 System.out.println("Enter any number.Enter the negative number to stop;\n ");
		 
		
		 while(true) {
			 
			 n= scanner.nextDouble();
			 
			 if(n<=0.0) {
				 
			 
			 
			 break;
		 }
		 
		 sum +=n;
   }
		 System.out.print(sum);
 

}
}