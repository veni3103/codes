package string;

import java.util.Scanner;

public class Countword {
	public static void main(String args[]) {
		String s="java   is a  very   hgood";
		int word=1;
		for(int i=0;i<s.length();i++) 
		{
			if(s.charAt(i) == ' ')
			{
				word++;
				int j = i + 1;
				while(s.charAt(j) == ' ')
				{
					j++;
					i++;
				}
			}
			
		}
		System.out.println(word);
	}

}





