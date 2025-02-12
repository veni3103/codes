package exercise;

public class StringPalindrome {
	public static void main(String args[]) {
	 String s1="malayalam";
	//char[]c=new char[s1.length()];
	int reverse=s1.length()-1;
	int j=0;
	for(int i=0;i<s1.length()/2;i++) {
		
		if((s1.charAt(i))==s1.charAt(reverse-i)) {
			j=j+1;
		}
		else {
			System.out.println("it is not palindrome");
			return;
		}
	
	}
	System.out.println("it  is palindrome")	 ;  
	
	}		
}
