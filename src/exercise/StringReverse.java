package exercise;

public class StringReverse {
	public static void main(String args[]) {
		String s1="hello veni";
		char[]reverse=new char[s1.length()];
		int length=s1.length()-1;
		for(int i=0;i<s1.length();i++) {
			reverse[i]=s1.charAt(length-i);
		}
		System.out.println(String.valueOf(reverse));
	}

}
