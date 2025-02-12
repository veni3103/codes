package exercise2;

public class StringSpecificChar {
	public static void main (String args[]) {
		String s1="sriram";
		char c='r';
		int f=0;
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)==c) {
				 f=f+1;
			}
		}
		System.out.print(f);
	}

}
