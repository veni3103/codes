package exercise;

public class Array {
	public static void main(String args[]) {
		//int marks[]=new int[10];
		int marks[]= {10,4,5,7,8,98,56,34,23,88};
		 /*int highest=0;
		 for(int i=0;i<marks.length;i++) {
			 if(marks[i]>highest) {
				 highest=marks[i];
			 }
			 
		 }
		System.out.println(highest);
		for( int i=marks.length-1;i>=0;i--) {
			System.out.println(marks[i]);
		}*/
		int add=0;
		for(int i=0;i<marks.length;i++) {
			add=add+marks[i];
		}
		System.out.println(add);
	}

}
