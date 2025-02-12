package second;
import java.util.Scanner;

public class time {
	public static void main(String args[]) {
		Scanner scanner =new Scanner(System.in);
		
		System.out.print("Enter the value ");
		
		 int minutes = scanner.nextInt();
		 
		 
			 
			 System.out.print( minutes/60 +"hours"+":"+minutes%60 +"minutes");	 
		
	}
	

}
