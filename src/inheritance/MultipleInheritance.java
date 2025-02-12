package inheritance;

interface Parent
{
	void getName();
}

class Child implements Parent, Parent2
{
	@Override
	void getName()
	{
		
	}
	
	void test()
	{
		
		getName();
	}
}

interface Parent2
{
	void getName();
}

public class MultipleInheritance {
	String s="veni";
	String v="veni";
	System.out.println(s.hashcode());
	System.out.println(v.hashcode());

}
