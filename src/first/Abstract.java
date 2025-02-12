package first;
 class Shape{
	 int diameter;
	 
	 //abstract void area();
 }
 
 class Triangle extends Shape{
	 int hight;
	 int breath;
	 Triangle(int h,int b){
		 hight=h;
		 breath=b;
		 
	 }
	 int area(int b,int h) {
		int  a=1/2*(b*h);
		 return a;
	 }
 }
 class Square extends Shape{
	 int side;
	 Square(int s){
		 side=s;
	 }
	int area(int s) {
		 int a=s*s;
		return a;
	}
}
	 
 

public class Abstract {
	Triangle t1= new Triangle(10,5);
	Square s1= new Square(23);
	
	Square c1= new Square(23);
	
	Shape []c=new Shape[5]
	
	c[0]=new triangle(10,8);
	c[1]=new triagle(23,6);
	c[2]=t1;
	c[3]=s1;
	c[4]=c1;
	for(Shape w:c) {
		System.out.println(w.area());
	}
	

}
