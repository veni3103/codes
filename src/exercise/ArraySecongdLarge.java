package exercise;

public class ArraySecongdLarge {
	public static void main(String args[]) {
	
		int marks[]= {10,4,5,7,8,981,901,34,23,88};
		 int highest=0;
		 int secondHighest=0;
		 for(int i=0;i<marks.length;i++) {
			 if(marks[i]>highest) {
				 highest=marks[i];
				
			 }
		 }
		 for(int j=0;j<marks.length;j++) {
			 if(marks[j]>secondHighest && marks[j]!=highest) {
				 secondHighest=marks[j];
			 }
		 }
		 System.out.println(highest);
		 
		 System.out.println(secondHighest);
}

}


