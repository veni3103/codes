package second;
import java.util.Scanner;

public class switched {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Enter first number");
		
		int a= scanner.nextInt();
		
		System.out.println("Enter second number");
		
		int b= scanner.nextInt();
		
		System.out.println("choose any operator from +, -, *, /, %");
		
		char operator= scanner.next().charAt(0);
		
		switch (operator){
		
		case'+':
			
			System.out.println(a +"+"+ b+ "="+ (a+b));
			return;
		case'-':
			System.out.println(a +"-"+ b+ "="+ (a-b));
			return;
		case'*':
			System.out.println(a +"*"+ b+ "="+ (a*b));
			return;
		case'/':
			System.out.println(a +"/"+ b+ "="+ (a/b));
			return;
		case'%':
			System.out.println(a +"%"+ b+ "="+ (a%b));
			return;
		default:
			System.out.println("you have entered incorrect operator");
			
		}
		
		
	
	}

}
