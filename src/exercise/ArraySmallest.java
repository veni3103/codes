package exercise;

public class ArraySmallest {
	public static void main(String args[]) {
	int a[]= {110,20,30,40,50,60,70,80};
	int num=Integer.MAX_VALUE;
	for( int i=0;i<a.length;i++) {
		if(a[i]<num) {
			num=a[i];}
		
		}
		System.out.println(num);
	}
}

