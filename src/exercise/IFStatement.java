package exercise;

public class IFStatement {
	public static void main(String args[]) {
		int a=10,b=16;
		 int max=a>b?a:b;
		if(a>b) {
			System.out.println("a is bigger value");}
			
		else if(a==b) {
			System.out.println("equal values");}
		else
			System.out.println("b is bigger value");
	}
	//System.out.println(max);//conditional operator

}
