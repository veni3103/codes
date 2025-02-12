package second;

import java.util.Scanner;

public class daysif {
	public static void main(String args[]) {
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Enter the number feom 1 to 7");
		 
		
		int number=scanner.nextInt();
		
		if(number== 1){
			
			System.out.println(number +":"+"Monday");
		}
		else if(number==2) {
		
		    System.out.println(number +":"+"Tuesday");}
		
		else if(number==3)
		{
		    System.out.println(number +":"+"wednesday");}
		
		else if(number==4) {
			
		    System.out.println(number +":"+"Thusday");}
		else if(number==5) {
			
		   System.out.println(number +":"+"Friday");}
		else if(number==6) {
			
		   System.out.println(number +":"+"Saturday");}
		
		else if(number==7) {
			
		   System.out.println(number +":"+"Sunday");}
		
		else {
			System.out.println("you are enter the wrong number");}
		}
			
		}


