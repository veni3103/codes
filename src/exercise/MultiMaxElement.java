package exercise;

public class MultiMaxElement {
	public static void main(String args[]) {
		int a[][]= {{1,2,3},{4,5,6},{7,8,9},{6,9,11}};

		int b=0;
		int i,j;
		for(i=0;i<a.length;i++) {
			for(j=0;j<a.length;j++) {
				if(b<a[i][j]) {
					b=a[i][j];
				}
				
			}	
			//System.out.println(b);
		}
		System.out.println(b);
	
	}


}
