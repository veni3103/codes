package inheritance;
class parent{
	String name="veni";
	String genter;
	void yearofborn(int n) {
		System.out.println(n);
	}
}
class daughter extends parent{
	 String name="Daughter";
	 String genter="female";
	
}
class son extends parent{
	 String name="son";
	 String genter="male";
		
	
}

public class Hierachical {
	public static void main(String args[]) {
		daughter d=new daughter();
		son s=new son();
		parent p=new parent();
		d.yearofborn(2000);
		s.yearofborn(1999);
		p.yearofborn(2020);
		System.out.println(s.name);
		System.out.println(d.name);
		System.out.println(p.name);
	}

}
