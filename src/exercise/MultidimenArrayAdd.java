package exercise;

public class MultidimenArrayAdd {
	public static void main(String args[]) {
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};

		int b=0;
		int i,j;
		for(i=0;i<a.length;i++) {
			for(j=0;j<a.length;j++) {
				b= b+ a[i][j];
			}	
		}
		System.out.println(b);
	
	}

}
