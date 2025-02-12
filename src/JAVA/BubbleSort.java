package JAVA;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String args[]) {
		int a[]= {2,3,5,75,34,72,86};
		int n=a.length;
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
