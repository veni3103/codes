package set;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class Treeset {
	public static void main(String args[]) {
		Set<Integer>t=new TreeSet<Integer>();
		 // Elements are added using add() method
        t.add(2);
        t.add(5);
        t.add(1);
        t.add(10);
        t.add(0);
        System.out.println(t);
        int s=t.first();
        System.out.println(s);
        System.out.println(t.last());
        System.out.println(t);
        System.out.println(t.pollFirst());
        System.out.println(t.pollLast());
        System.out.println(t);
        
        
        
        

	}

}
