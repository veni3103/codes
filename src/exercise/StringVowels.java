package exercise;

public class StringVowels {
	public static void main(String args[]) {
		String s1="venisriram";
		char c[]=new char[s1.length()];
		int vowels=0;
		int consonant=0;
		char v[]= {'a','e','i','o','u'};
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)=='a'|| s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u') {
				vowels=vowels+1;
				}
			else {
				consonant=consonant+1;
			}
				
		}
		System.out.println(vowels);
		System.out.println(consonant);
	}

}
