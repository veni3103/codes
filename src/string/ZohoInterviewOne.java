package string;

public class ZohoInterviewOne 
{

	public static void main(String[] args) 
	{
		String s = "a10b8";
		for(int i = 0; i < s.length(); i++)
		{
			char c = s.charAt(i);
			int value = Integer.parseInt(s.charAt(i+1) + "");
			for(int j = 0; j < value; j++)
			{
				System.out.print(c);
			}
		}
	}
	
	public static boolean isNumeric(char c)
	{
		if((int)c >= 48 && (int)c < 57)
		{
			return true;
		}
		return false;
	}
}
