package exercise2;

public class StringWhiteSpace {
	public static void main(String args[]) {
	String s1="java is very good language";
	char[]c =new char[s1.length()];
	int length=s1.length()-1;
	for(int i=0;i<s1.length();i++) {
		if(s1.charAt(i)==' ') {
			append(' ');
			
		}
	}

}
}