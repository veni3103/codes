package exercise2;
import java.util.Scanner;
public class StringRemoveSpecChar {
	public static void main(String args[]) {
		//Scanner scanner=new Scanner(System.in);
		//System.out.println("enter any name or sentence");
		String s1="java is a good language";
		 // String s1=scanner.nextLine();
		//System.out.println("enter any charecter");
		char c= (' ');
		String s2="";
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)==c) {
				
			}
			else {
				s2 =s2+s1.charAt(i);
			}
		
		}
		System.out.print(s2);
	}
		

}
