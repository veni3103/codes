package exercise;
import java.util.Scanner;
public class Arithmatic {
	public static void main(String args[]) { 
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter first value");
		int a=scanner.nextInt();
		System.out.println("Enter second value");
		int b=scanner.nextInt();
		System.out.println("Enter third value");
		int c=scanner.nextInt();
		
		/*System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b); Arithmatic*/
		a+=3;
		b-=5;
		c*=3;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(a<b);//relational operator(>,>=,<,<=,==,!=)
		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(a^b);
		System.out.println(~a);//bitwise operator(<< left shift,>> right shift,>>>right shift with zero fill) 
	}

}
