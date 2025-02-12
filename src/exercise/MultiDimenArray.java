package exercise;

public class MultiDimenArray {
	public static void main(String args[]) {
		/*int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int i,j;
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				System.out.print(a[i][j]+" ");
				
			}
			System.out.println();
		}*/
		int a[][]= {{1,2,3},{4,5,6}};
		int b[][]= {{2,3,4},{5,6,7}};
		int c[][]=new int[2][3];
		int i,j;
		for(i=0;i<2;i++) {
			for(j=0;j<3;j++) {
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
				
			}
			System.out.println();
		}
	}

}
