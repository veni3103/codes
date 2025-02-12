package sort;

import java.util.Arrays;

public class BubbleSort 
{
	public static void main(String[] args) 
	{
		int []a=new int[]{2,5,7,1,4,8,9};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					
					a[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));	
	}
	//System.out.println(array.toString(a));	
}
