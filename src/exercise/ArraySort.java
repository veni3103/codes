package exercise;

public class ArraySort {
	public static void main(String args[]) {
	
		int marks[]= {10,4,5,7,8,98,56,34,23,88};
		 int line=0;
		 for( int i=0;i<marks.length;i++) {
			 for(int j=i+1;j<marks.length;j++) {
				 int temp=0;
				 if(marks[i]>marks[j]) {
					 temp=marks[i];
					 marks[i]=marks[j];
					 marks[j]=temp;
					 
				 } 
			 }
		 }
		 for( int i=0;i<marks.length;i++) {
		 System.out.print(marks[i]+",");}
}
}