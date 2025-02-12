package exercise2;

public class StringAnagram {
	public static void main(String Args[]) {
		String s1="data";
		String s2="taaa";
		if(s1.length()==s2.length()) {
			for(int i=0;i<s1.length();i++) {
				for(int j=0;j<s1.length();j++) {
					if(s1.charAt(i)==s2.charAt(j)) {
						if(j==s2.length()-1) {
							System.out.println("it is anagram");
							return;	
						}
					}


				}
			}

		}
		System.out.println("it is not a anagaram");
	}

}
