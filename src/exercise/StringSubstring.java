package exercise;

public class StringSubstring {
	public static void main(String args[]) {
		String s1="datassome";
		String s2="some";
		char c=s2.charAt(0);
		//char c[]=new char[s1.length()];
		//char d[]=new char[s2.length()];
        int  start=0; 
        int i,j; 
		//System.out.println(s1.indexOf(s2));
		for(i=0;i<s1.length()-1;i++) {
			if(s1.charAt(i)==c) {
				for(j=1;j<s2.length();j++) {
					if(s1.charAt(i+j)==s2.charAt(j)) {
						if(j==s2.length()-1) {
							System.out.println(i);
							return;
						}
					
					}
					else {
						break;
					}
				}
			}
			
		}
		
		
	}

	

}
