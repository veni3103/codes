package exercise;

public class MultiColumAdd {
	public static void main(String args[]) {
		int[][] a= {{1,2,3},{4,5,6},{7,8,9}};
		int i,j;
		int b=0;
		for(i=0;i<
				a.length;i++) {
			b=b+a[i][i-1];
			//System.out.print(b);
		}
		System.out.println(b);
		
	}
	
}
