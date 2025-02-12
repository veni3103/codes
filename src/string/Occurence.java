package string;

public class Occurence {
	
	public static void main(String args[]) {
		String s="venisriram";
		char a='i';
		int res=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==a) {
				res=res+1;
			}
			
		}
		System.out.println(res);

	}
}
