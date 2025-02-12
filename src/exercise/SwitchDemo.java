package exercise;
import java.util.Scanner;
public class SwitchDemo {
	public static void main(String args[]) {
		
		int a=10,b=5;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter any operator in +,-,/,*,%");
	    char n= scanner.next().charAt(0);
		switch (n) {
		case '+':
			System.out.println(a+b);
			break;
		case'-':
			System.out.println(a-b);
			break;
		case '*':
			System.out.println(a*b);
			break;
		case '/':
			System.out.println(a/b);
			break;
		case '%':
			System.out.println(a%b);
			break;
			
		default:
			System.out.println("enter correct value");}
	}

}
