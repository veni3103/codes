package exercise;

public class ArrayLarge {
		public static void main(String args[]) {
			//int marks[]=new int[10];
			int marks[]= {10,4,5,7,8,98,56,34,23,88};
			 int highest=0;
			 for(int i=0;i<marks.length;i++) {
				 if(marks[i]>highest) {
					 highest=marks[i];
				 }
			 }
				 System.out.println(highest);
			 
	}

}
