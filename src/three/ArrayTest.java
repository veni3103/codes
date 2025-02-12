package three;
import java.util.Scanner;

public class ArrayTest {
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		
		while (true) {
			System.out.println("Enter the value for doller");
			float f =scanner. nextFloat();

			if(f>0) 
			{
				System.out.println("value is :"+(f*83.44));
				break;
				}
			
			else {
				System.out.print("Enter the  positive number ");
				}
		
		    }

	}

}


