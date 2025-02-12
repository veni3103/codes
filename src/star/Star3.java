package star;

public class Star3 {
	public static void main(String args[]) {
		/*for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {

				System.out.print("4");
			}
			System.out.print("\n");
		}
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.print("\n");
		}
		for(int i=4;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.print("\n");
		}*/
		int n=4;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if((i+j)<n) {
					int s=(i+j)-n;
					System.out.print(s);
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.print("\n");
		}
	}

}
