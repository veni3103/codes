package JAVA;

public class ArrayReverse {
	public static void main(String args[]) {
		int a1[]= {1,2,43,4,5,6,7,8,9};
		int a2[]=new int[10];
		for(int i=a1.length-1;i>=0;i--) {
			a2[i]=a1[i];
			System.out.print(a2[i]+",");
		}
	}

}
