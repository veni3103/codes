package exercise;

public class ArraycountEvenOdd {
	public static void main(String args[]) {
		int[]n= {1,2,4,5,6};
		int even=0;
		int odd=0;
		for(int i=0;i<n.length;i++) {
			if(n[i] % 2==0) {
				even=even+1;	
			}
			else {
				odd=odd+1;
			}
		}
		System.out.println(even);
		System.out.println(odd);
	}

}
