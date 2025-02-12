package exercise2;

public class StringSpaceRemove {
	public static void main(String Args[]) {
		String s1="java is very good language";
		String s2="";
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)!=' ') {
				s2=s2+s1.charAt(i);
				
			}
			
		}
		System.out.println(s2);
	}

}
