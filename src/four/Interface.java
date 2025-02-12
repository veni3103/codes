package four;
interface Ridable{
	int a=10;
	void ride();
	default void display(){//SAM OR FUNCTIONAL INTERFACE
		System.out.println("hello from ridable interface");
	}
}
class car implements Ridable{
	public void ride() {
		System.out.println("you are riding a car");
		
	}
	public void display(){
		System.out.println("hello from car class");
	}
}
class Bike implements Ridable{
	public void ride() {
		System.out.println("you are riding a bike");
	}
	
}
class mechanic{
	void checks(Ridable r) {
		System.out.println("checking");
	}
	
}

public class Interface {
	public static void main(String args[]) {
		Ridable r=new car();
		mechanic m=new mechanic();
		car c=new car();
		Bike b=new Bike();
		c.display();
		m.checks(c);
		m.checks(b);
		Ridable r2=new Ridable() {
			public void ride() {//anonymous class
				System.out.println("you are riding a vintage car");
				
			}
		};
		r2.ride();
		Ridable r3=()->System.out.println("you are riding a convertible car");//lambdo expression
		r3.ride();
	}

}
