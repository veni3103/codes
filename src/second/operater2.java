package second;
import java.util.Scanner;

public class operater {

	public static void main(String[] args) {
		
		Scanner Scanner =new Scanner(System.in);
		
		System.out.println("Enter one value for a ");
		
		String a = Scanner.nextLine();
		
		System.out.println("Enter one value for b");
		
		float b= Scanner.nextInt();
		
		
		

     System.out.println(a+b);
     System.out.println(a-b);
     System.out.println(a*b);
     System.out.println(a/b);
     System.out.println(a%b);
     System.out.println(++a);
     System.out.println(a);
     System.out.println(a++);
     System.out.println(a--);
     System.out.println(--a);
    
 

}
}