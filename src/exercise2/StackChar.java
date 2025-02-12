package exercise2;

public class StackChar {
	
	public static void main(String args[]) {
		StackCharDemo s1=new StackCharDemo();
		s1.push('A');
		s1.push('B');
		s1.push('C');
		s1.push('D');
		s1.push('E');
		
		System.out.println(s1.pop());
	}

}
