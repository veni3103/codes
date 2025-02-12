package exercise;

public class StringUpper {
	public static void main(String args[]) {
		String s1="VENI";
		//char[]c=new char[s1.length()];
		String s2=s1.toLowerCase();
		String s3="";
		//System.out.println(s2);
		int length=s2.length()-1;
		for( int i=0;i<s2.length();i++) {
			s3=s3+s2.charAt(length -i);
		}
		System.out.println(s3);
	}

}
