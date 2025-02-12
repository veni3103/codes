package array;

public class MultiDimentionalArray {
	public static void main(String args[]) {
		int a[][]=new int [3][4];
		a[0][0]=75;
		a[0][1]=85;
		a[0][2]=87;
		a[0][3]=67;
		a[1][0]=58;
		a[1][1]=65;
		a[1][2]=83;
		a[1][3]=92;
		a[2][0]=34;
		a[2][1]=54;
		a[2][2]=54;
		a[2][3]=72;
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
