package four;
class department{
	int deptId;
	String name; 
    void Department(int id,String n){
		deptId=id;
		name=n;
	}
}
class student implements cloneable{
	int id;
	String name;
	Department dept;
	   student(int i,String n,Department d){
		id=i;
		name=n;
		dept=d;
	}

}
public class ObjectCloning {
	public static void main(String args[]) {
		Department dept=new department();
		student s1=new student(1,"hari","physics");
		student s2=(student)s1.clone();
	}

}
