package four;

public class Fibonacci {
	static int fibo(int a, int b, int n) 
	{
		System.out.println(a);
		if(n <= 1)
		{
			System.out.println(b);
			return (a + b);
		}
		int c = a + b;
		n--;
		return c+fibo(b, c, n);
	}


	public static void main(String args[]) {
		int n=5;
		int a = 0;
		int b = 1;
		System.out.println(fibo(a, b, n));
	}
	
	public int another(int n)
	{
		if(n <= 1)
		{
			return n;
		}
		return another(n - 1) + another (n - 2);
	}
}