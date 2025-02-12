package first;

public class Queue {
	int [] queue = new int[11];
	int index = 0;
	
	void enqueue(int item) 
	{
		if(index > 11)
		{
			System.out.println("Queue is full");
		}
		else
		{
			queue[index] = item;
			index++;
		}
	}
	
	int dequeue() 
	{
		if(index < 0)
		{
			System.out.println("Queue is empty");
		}
		else
		{
			
		}
	}

}
