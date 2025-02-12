package exercise2;

public class StringNonRepeatChar {
	public static void main(String args[]) {
		String s1="aa is a good language";
		String s=" ";
		for(int i=0;i<s1.length();i++) {
			for(int j=i+1;j<s1.length();j++) {
				if(s1.charAt(i)==s1.charAt(j)) {
					break;}
				else {
					  s = s+(s1.charAt(j));
					return;

				}
			}


		}
		System.out.println(s);

	}
}


