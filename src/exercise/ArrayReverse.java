package exercise;

public class ArrayReverse {
	public static void main(String args[]) {
		//int marks[]=new int[10];
		int marks[]= {10,4,5,7,8,98,56,34,23,88};
		int m[]=new int[10];
		for( int i=marks.length-1;i>=0;i--) {
			m[i]=marks[i];
			System.out.print(m[i]+",");
		}
	}

}
