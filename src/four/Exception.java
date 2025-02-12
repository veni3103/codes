package four;

import org.w3c.dom.events.EventException;

public class Exception {
	public static void main(String args[]) {
		int a=10;
		int b=0;
		int c=0;
		try {
			int arr[]=null;
			c=a/b;
			System.out.println("try block");
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmatic exception has occured");
		}
		catch(NullPointerException e) {
			System.out.println("Null exception has occured");
		}
		catch(EventException e) {
			System.out.println(" Error occured");
		}
		System.out.println(c);
	}

}
