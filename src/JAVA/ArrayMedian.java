package JAVA;

public class ArrayMedian {
	public static void main(String args[] ) {
		int a[]= {1,8,3,5,8,7,83,62};
		double median=0;
		
		if(a.length%2!=0) {
			median=a[a.length/2];
		}
		else {
			double d=a[(a.length/2)-1];
			double e=a[a.length/2];
			median=(d+e)/2;
			System.out.println(d);
			System.out.println(e);
			
		}
		
		System.out.print(median);
	

}
}