package zoho;

public class Alphabet {
	public static void main(String args[]) {
		int n=52;
		if(n>=1 && n<=26) {
	        int r=n+64;
		    System.out.println((char)r);
		}
		
		else if(n<=675)  {
			if(n%26==0) {
				int l=(n/26)+64;
				System.out.print((char)l);
				System.out.println((char)90);
				
			}
			else {
			int l=(n/26)+64;
			int s=(n%26)+64;
			
			System.out.print((char)l);
			System.out.println((char)s);}
		}
		/*else {
			int l=(n/26)+64;
			int s=(n%26)+64;
			
		}*/
	}

}.

