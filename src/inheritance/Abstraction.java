package inheritance;
abstract class Tv{
	abstract void turnOn();
	abstract void turnOff();
	
}
 class Remote extends Tv{
	void turnOn(){
		System.out.println("TV is turned on");
	}
	void turnOff(){
		System.out.println("TV is turned off");
	}
	
}

public class Abstraction {
	public static void main(String args[]) {
		Remote R=new Remote();
	
		R.turnOn();
		R.turnOff();
	}

}
