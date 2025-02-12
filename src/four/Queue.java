package four;
import java.util.*;
public class Queue {
	public static void main(String args[])
	{
		
		java.util.Queue<Integer> q = new LinkedList<>();
		q.add(3);
		q.add(12);
		q.add(43);
		System.out.println("head is"+q.peek());
		System.out.println("removed"+q.remove());
		System.out.println("head is"+q.peek());

		
	}

}
