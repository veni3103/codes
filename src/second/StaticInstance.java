package second;
class mobile{
	static String name;
	int version;
	int price;
	
	 static void getname(mobile m) {
		System.out.println(name);
	}
	 void details() {
		 System.out.println(name+ ":" + version+":"+price);
	 }
}

public class StaticInstance {
	public static void main(String args[]) {
	
		mobile m1 =new mobile();
		mobile m2=new mobile();
		m1.version=1;
		m1.price=1000;
		m1.name= "realme" ;
		mobile.getname(m1);
		m1.details();
		m2.version=2;
		m2.price=1500;
		mobile.getname(m2);
		m2.details();
		
	}

}
