package second;
import java.util.Scanner;

public class vowels {
	public  static void main(String args[]){
		 Scanner scanner= new Scanner(System.in);
		 
		 System.out.println("Enter your charecter");
		 
		 String word=scanner.nextLine();
		 
		 int length = word.length();
		 if(length>1) {
			 System.out.println("Enter one charecter only");
		 }
		 else {
		 word = word.toUpperCase();
		 switch (word){
		 case("A"):
		 case("E"):
		 case("I"):
		 case("O"):
		 case("U"):
			 System.out.println(word+" It is a vowel");
		 break;
		 default:
			 System.out.print(word+" It is a consonant");
		 }
		 }
	}

}
