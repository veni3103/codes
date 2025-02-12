package four;
abstract class Shape{
	 private int area;
	abstract  void area(int h,int b);
	abstract  void area(int a);
}
 class Square extends Shape{
	 int s ;
	 void area(int h,int b) {
		 s=(h*b)/2;
		 System.out.println(s);
	}
	 void area(int a) {}
}
 class Triangle extends Shape{
	 void area(int h,int b) {}
	
	 void area(int a) {
		 a=a*a;
		 System.out.println(a);	
	} 
	 
 }

public class AreaApstract {
	public static void main(String args[]) {
		Square s1=new Square();
		Triangle t1=new Triangle();
		Shape[] p=new Shape[4];
		p[0]=new Square();
		p[1]=new Triangle();
		p[2]=new Triangle();
		p[3]=new Square();
		
		for(Shape p1:p) {
			p1.area(10,5);
			p1.area(4);
			
	}

}
	
}
