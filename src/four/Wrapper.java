package four;

public class Wrapper {
	public static void main(String args[]) {
		int i=10;
		float f;
		
		Integer i2=Integer.valueOf(i);
		int j=i2.intValue();
		Integer i3=20;
		int k=i2;
		String s="123";
		int i4= Integer.parseInt(s);
		System.out.println(i2);
		System.out.println(j);
		System.out.println(i3);
		System.out.println(k);
		System.out.println(i4);
		
		
		
	}

}
