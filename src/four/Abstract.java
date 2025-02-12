package four;
abstract class member{
	private String name;
	abstract void welcomeMessage();
}
class Student extends member{
	void welcomeMessage() {
		System.out.println("Hello student...");
	}
}
class Teacher extends member{
	void welcomeMessage() {
		System.out.println("Hello Teacher...");
	}	
}

public class Abstract {
	public static void main(String args[]) {
		Student s1=new Student();
		Teacher t1=new Teacher();
		member[] m=new member[4];
		m[0]=new Student();
		m[1]=new Student();
		m[2]=new Teacher();
		m[3]=new Teacher();
		
		for(member m1:m) {
			m1.welcomeMessage()
			
		}
		
		
	}

}
