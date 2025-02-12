package exercise2;
class user{
	String studentname;
	int Bookcheckout;
	int age;
}
class Book{
	String bookname;
	String authour;
	int bookQuantity;
}
class card{
	String studentname;
	int id;
	int age;
	int standard;

}


public class ObjectClass {
	public static void main(String args[]) {
		user s1=new user();
		s1.studentname="veni";
		s1.Bookcheckout=5;
		s1.age=25;
		Book b1=new Book();
		b1.bookname="tirukural";
		b1.authour="tiruvalluvar";
		b1.bookQuantity=158;
		card c1=new card();
		c1.studentname="sriram";
		c1.id=13446;
		c1.age=25;
		c1.standard=12;
		
		System.out.println(s1.studentname);
		System.out.println(s1.age);
		System.out.println(b1.authour);
		System.out.println(b1.bookname);
		System.out.println(c1.studentname);
		
		
		
		
	}

}
