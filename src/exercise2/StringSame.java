package exercise2;

public class StringSame {
	public static void main(String args[]) {
		String s1="dioota";
		String s2="data";
		if(s1.length()==s2.length()){

			for(int i=0;i<s1.length()-1;i++) {

				if(s1.charAt(i)!=s2.charAt(i)) {
					System.out.println("it is not same");
					return;

				}
			}
		}
		else {
			System.out.println("it is not same");
			return;

		}
		System.out.println("it is same");
	}
}