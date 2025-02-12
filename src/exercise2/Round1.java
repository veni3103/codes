package exercise2;

public class Round1 {
	public static void main(String args[]) {
		String s="a1b10";
		//int c=1 to 99;
		for(int i=0;i<s.length();i++) {
			if(Character.isDigit(s.charAt(i))==true)
			{
				if(Character.isDigit(s.charAt(i+1))==true)
				{
					System.out.println(s.charAt(i-1)*parseInt(i));
					i++;
				
				}
				else {
					System.out.println(s.charAt(i-1)*parseInt(i));
				}
			
					System.out.println(6);
				

			}


			System.out.println(s.charAt(i));

		}
	}

	private static char parseInt(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

}
