package exercise;

public class ArrayMerge {
	public static void main(String args[]) {
		//int marks[]=new int[10];
		int m1[]= {10,4,5,7,8,9,15,24,3,18};
		int m2[]= {1,3,11,12,16,19,56,97,75,81}; 
		int result=new int(m1+m2);
		int i=0,j=0,k=0;
		for(i=0;i<m1.length;i++) {
			for(j=0;j<m2.length;j++) {
				if(i>j) {
					k=j;
				}
			}
			
		}

}
}