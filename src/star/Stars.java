package star;

public class Stars {
	public static void main(String args[]) {
		int n=4;
		int i,j;
		for(i=1;i<=n;i++) {
			for(j=1;j<=n;j++) {
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
