
package inheritance;
class Parent{
	String name = "one";
	
}
class Child extends Parent{
	String name = "two";
	void method(int a,int b) {
		System.out.println(a+b);
	}
}
class Grandchild extends Child{
	void baby() {
		System.out.println(name);
	}
	void method() {
		System.out.println("veni");
	}
}

public class MultiLevelInheritance {
	
	void temp()
	{
		System.out.println("sri");
	}
	
	public static void main(String[] args) 
	{
		Grandchild c = new Grandchild();
		Child c1=new Child();
		MultiLevelInheritance m=new MultiLevelInheritance();
		parent p=new parent();
		System.out.println(c.name);
		c.baby();
		c.method();
		c1.method(10,5);
		//m.temp();
		//System.out.println(p.name);
	
	}
}
