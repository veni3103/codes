package three;
import java.util.Scanner;
public class Arithmatic {
	public static  void main(String args[]) { 
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 1st values");
		int num1= scanner.nextInt();
		System.out.println("Enter the 2nd value");
		int num2=scanner.nextInt();
		int a=sub(num1,num2);
	
		System.out.println(a);
	}
    public static int add(int num1, int num2) {
    	int add = num1+num2;
    	return add;		
    }
    public static int sub(int num1,int num2) {
    	int sub=num1-num2;
    	return sub;
    }
    public static int mal(int num1, int num2) {
    	int mal=num1*num2;
    	return mal;
    }
    public static int div(int num1,int num2) {
    	int div=num1/num2;
    	return div;    }
}
