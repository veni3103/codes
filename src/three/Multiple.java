package three;

import first.Black;

public class Multiple {
	
		int length;
		int breadth;
		int height;
		 int volume(){
			return length*breadth*height;
		}
		public static void main(String args[]) {
			Multiple blackbox= new Multiple();
			blackbox.length=10;
			blackbox.height=25;
			blackbox.breadth=15;
			
			 System.out.println("vol of blackbox is "+ blackbox.volume());
			Multiple woodbox =new Multiple();
			 woodbox.length=13;
			 woodbox.height=7;
			 woodbox.breadth=9;
			 
			 System.out.println("vol of woodbox is "+ woodbox.volume());
			
			
		}

	}


