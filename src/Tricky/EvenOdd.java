package Tricky;//without using%
import java.util.Scanner;

public class EvenOdd {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		 if(num-(num/2)*2==0) {
			 System.out.println(num+" is even");
		 }
		 else
			 System.out.print(num+" is odd");
	}

}
