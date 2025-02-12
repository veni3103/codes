package exercise;

public class ArrayCountOccur {
	public static void main(String args[]) {
		
		int marks[]= {1,4,5,1,8,98,56,1,23,88};
		 int n=4;
		  int count=0;
		for(int i=0;i<marks.length;i++) {
			if( marks[i]==n) {
				count=count+1;
			}
		}
		System.out.println(count);

}
}