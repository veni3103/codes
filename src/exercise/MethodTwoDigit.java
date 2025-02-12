package exercise;

public class MethodTwoDigit {
	static void Twodigitnum(int n) {
		if(n>9 && n<=99) {
			System.out.println("true");	
		}
		else {
			System.out.println("false");
		}
		return;
	}
	public static void main(String args[]) {
		int n=-4;
				
		Twodigitnum(n);
	}

}
