package exercise;



public class MethodSumDigit {
	static int sumdigit(int n) {
		 int sum=0;
		while(n>=1) {
			int s=n%10;
			
			sum=sum+s;
			n=n/10;
		}
		return sum;
	}
	public static void main(String args[]) {
	int value=56489;
	System.out.println(sumdigit(value));
}

}
