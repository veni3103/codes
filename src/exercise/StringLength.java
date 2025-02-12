package exercise;

public class StringLength {
	public static void main(String args[]) {
		String s1="helloveni";
		int value=0;
		for(int i=0;i<s1.length()-1;i++) {
			if(i<s1.length()) {
				value=value+1;
			}
			
		}
		System.out.println(s1.length());
	}

}
