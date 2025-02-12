package three;


public class MultipleBox {
	int length;
	int breadth;
	int height;
	 int volume(){
		return length*breadth*height;
	}
	public static void main() {
		MultipleBox blackbox= new MultipleBox();
		blackbox.length=10;
		blackbox.height=25;
		blackbox.breadth=15;
		
		 System.out.println("vol of blackbox is"+ blackbox.volume());
		
		
	}

}
