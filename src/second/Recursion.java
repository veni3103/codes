package second;

public class Recursion {
	 /*static int fact(int n) {
		 if(n==0) {
			 return 1;
		 } 
		 else {
			 return n*fact(n-1);
			 
		 }
		
	}*/
	/* static void show(int num){
		 //int num=1;
		 if(num>0) {
			 System.out.println("hi "+num);
			 show(num+1);
		 }
	
		 System.out.println("hello ");
		
		
	}*/
	static void num(int n) {
		if(n==10) {
			System.out.println(10);
			
		}
		else {
			System.out.print(n+",");
			num(n+1);
		}
	}
	public  static  void main(String args[]) {
		int n=5;
		//System.out.println(fact(n));
			num(1); 
			 
		 
	}
	

}
