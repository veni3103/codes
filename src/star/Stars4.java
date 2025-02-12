package star;

public class Stars4 {
	public static void main(String args[]) {
		int n=4;
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=7;j++) {
				if(i+j==5 && j<=4) {
					System.out.print(i);
				}
				if(i+j==6 && j<=4) {
					System.out.print(i+1);
				}
				if(i+j==7 && j<=4) {
					System.out.print(i+2);
				}
				if(i+j==8 && j<=4) {
					System.out.print(i+3);
				}
				else {
					System.out.print(" ");
				}
				//System.out.print("*");
			}
			System.out.print("\n");
		}
		//System.out.print("\n");
	}

}
