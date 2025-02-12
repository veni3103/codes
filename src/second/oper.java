package second;

import java.util.Scanner;

public class oper {

	public static void main(String args[]) {
		
		Scanner scanner=new Scanner(System.in);
		 
		System.out.println("Enter your mark");
		
		int mark = scanner.nextInt();
		
		if (mark>=90) {
			
			System.out.print("Grade A");
		}
		else if (mark>=80) {
		
		System.out.print("Grade B");
		}
		
		else if(mark>=70) {
			
			System.out.print("Grade C");
			
		}
		else if(mark>=60) {
			
			System.out.print("Grade D");
			
		}
		else {
			System.out.print("fail");
			
		}

	}

}
  