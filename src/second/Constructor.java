package second;
class library{
	String name;
	int id;
	String dept;
	String Bookname;
	
	 library(String n,int i,String d,String b){
		 name=n;
		 id=i;
		 dept=d;
		 Bookname=b;
		 System.out.println("Name : "+name+", id : "+id+",dept : "+dept+",Bookname : "+Bookname);
		 System.out.println("4 input values");
	}
	 library(String n,int i,String b){
		 name=n;
		 id=i;
		 Bookname=b;
		 System.out.println("Name : "+name+", id : "+id+",Bookname : "+Bookname);
		 System.out.println("3 input values");
	}
	 library(String n,int i){
		 name=n;
		 id=i;
		 System.out.println("Name : "+name+", id : "+id);
		 System.out.println("2 input values");
	}
	 
	 
	
}

public class Constructor {
	public static void main(String args[]) {
		library l=new library("veni", 36, "BE", "tamil");
		library l1=new library("sri", 33, "BE");
		library l2=new library("veni", 36);
		
		
		
	} 

}
