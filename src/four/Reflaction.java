package four;
import java.lang.reflect.*;

public class Reflaction {
	public static void main(String args[]) {
		Empl e1=new Empl("Ram",35000);
		Class cls= e1.getClass();
		System.out.println("class name is "+cls.getName());
		Method[]methods=cls.getMethods();
		for(Method m:methods) {
			System.out.println(getName());
		}
	}

	private static char[] getName() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
