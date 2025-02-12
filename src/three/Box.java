package three;

public class Box 
{
	public int length;
	public int breadth;
	
	public Box(int len, int br)
	{
		length = len;
		breadth = br;
	}
	
	public int area()
	{
		return length * breadth;
	
	}
	public int circumference()
	{
		int answer= (2*length) + (2*breadth);
		return answer;
	}
	
}

