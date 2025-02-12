package Tricky;//without using %;
import java.util.Scanner;
public class Leapyear {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);
		
		int year=scanner.nextInt();
		
		if(year-(year/4)*4==0) {
			
			System.out.print(year+" it is leapyaer");
		}
		else {
			System.out.println(year+" it is not a leapyaer");
		}
	}

}
