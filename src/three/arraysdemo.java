package three;


import java.util.Scanner;

public class arraysdemo {
	
	public static void main(String args[]) {
		
		int a[]= new int [7];
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Enter 7 elements of array:");
		
		for(int i=0;i<a.length;i++)
			
			a[i]=scanner.nextInt();
		
		
		for(int i=0;i<a.length;i++)
		
		   System.out.println(a[i]);
		
	}

}
