package collections;

import java.util.ArrayList;
import java.util.List;

public class ListInterface {
	public static void main(String args[]) {
		List<String>s1=new ArrayList<>();
		s1.add("hi");
		s1.add("hello");
		s1.add("veni");
		s1.add("welcome");
		s1.add("veni");
		for(String d:s1) {
			System.out.println(d);
		}
		s1.set(0, null);
		System.out.println(s1);
		int s=s1.indexOf("veni");
		System.out.println(s);
		int a=s1.lastIndexOf("veni");
		System.out.println(a);
		//System.out.println(s);
		s1.remove(null);
		System.out.println(s1);
		s1.remove(3);
		System.out.println(s1);
		String v=s1.get(1);
		System.out.println(v);
		boolean b=s1.contains("hello");
		System.out.println(b);
;
}
}