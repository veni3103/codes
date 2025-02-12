package exercise;

public class ArrayPalindrome {
	public static void main(String args[]) {
		int a[]= {1,2,3,5,3,2,1};
		boolean b;
		int j=0;
		int c=a.length-1;
		for( int i=0;i<c;i++) {

			if(a[i]==a[c]) {
				c--;
				j=j+1;
			}
		}
		if(j>=a.length/2) {
			System.out.println("it is palindrome");
		}
		else {
			System.out.println("it is not palindrome");
		}
	}


}

	


