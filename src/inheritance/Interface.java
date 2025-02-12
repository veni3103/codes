package inheritance;
interface Rideable{
	void ride();
	default void animal() {
		System.out.println("hi animal");
	}
}
class Cat implements Rideable{
	public void ride() {
		System.out.println("Hi from class Cat");
	}
	void sound() {
		System.out.println("heavy");
	}
	public void animal() {
 		System.out.println("hi");
 	}
}
class Dog implements Rideable{
	public void ride() {
		System.out.println("Hi from class Dog");
	}
}
class Eagle implements Rideable{
	public void ride() {
	     System.out.println("Hi from class Eagle");
	
	}
	
}

public class Interface {
	public static void main(String args[]) {
		Cat c1=new Cat();
		Dog b1=new Dog();
		Eagle e1=new Eagle();
		Rideable r=new Cat();
		c1.ride();
		b1.ride();
		e1.ride();
		r.ride();
		r.animal();
		c1.animal();
		b1.animal();
		c1.sound();
	}


}
