package inheritance;
class A{
	String name="class A";
	
}
class B extends A{
	void method() {
		System.out.print(name);
	}
}


public class SingleInheritance {
	public static void main(String args[]) {
		B a1=new B();
		a1.method();
	}
	

}
