package JAVA;

public class ArraySum {
	public static void main(String args[] ) {
		int a[]= {1,8,3,5,6,7,83,62,67};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.print(sum);
	}

}
