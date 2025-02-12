package JAVA;

public class ArraySmallest {
	public static void main(String args[]) {
		int a1[]= {1,3,5,76,9,3,-1};
		int ans=Integer.MAX_VALUE;
		for(int i=0;i<a1.length-1;i++) {
			if(a1[i]<ans) {
				ans=a1[i];
			}
			
		}
		System.out.println(ans);
	}

}
