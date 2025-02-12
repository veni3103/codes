package set;

import java.util.HashSet;

public class Hashset {
	public static void main(String args[]) {
		HashSet<String>s=new HashSet<String>();
		s.add("veni");
		s.add("hi");
		s.add("hello");
		s.add("Hello");
		s.add("hifi");
		System.out.println(s.add("hi"));
		System.out.println(s);
		System.out.println(s.size());
		System.out.println(s.contains("hi"));
		System.out.println(s.contains("hey"));
		System.out.println(s.remove("hifi"));
		System.out.println(s);
		System.out.println(s.iterator());
		System.out.println(s.isEmpty());
		System.out.println(s.clone());
		//System.out.println(s.clear());
		System.out.println(s.isEmpty());
		
		
		
		
		
		
		
		
		
		
	}

}
