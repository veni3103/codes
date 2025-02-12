package first;

public class stars {
	public static void main(String args[]) {
		int i;

		for(  i=1; i<=5; i++) {
			for(int k=1;k<=(i-1);k++) {
				System.out.print(" ");
			}
				
			for(int j=5	;j>=i;j--) {
				

				System.out.print("*");
			}
			System.out.print("\n"); 

		}	

	}

}