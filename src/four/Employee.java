package four;
class Empl{
	 private String name;
	 private double salary;
	Empl(String n,double s){
		name =n;
		salary=s;
	}
	Empl(){
		name=" ";
		salary=0.0;   
	}
	String getName() {
		return name;
	}
	double getsalary() {
		return salary;
	}
	void setName(String n) {
		name=n;
	}
	void setsalary(double s) {
		salary=s;
	}
	void raiseSalary(double percent) {
		salary+=salary*percent/100;
	}
}
class Manager extends Empl{
	double bonus;
	Manager(String n,double s,double b){
		super(n,s);
		bonus=b;
	}
	void setBonus(double b) {
		bonus=b;
	}
	 public double getSalary() {
		 return super.getsalary()+bonus;
	 }
}
public class Employee {
	public static void main(String args[]) {
		Empl e1=new Empl("Ram",35000);
		e1.raiseSalary(10);
		System.out.println(e1.getsalary());
		Manager m1=new Manager("john",65000,0.0);
		m1.setBonus(20000);
		System.out.println(m1.getsalary());
	}
	
}

