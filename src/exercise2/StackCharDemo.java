package exercise2;

public class StackCharDemo{
	char a[]=new char[5];
	int tos=-1;
	/*StackCharDemo() {
		tos=-1;
	}*/
	void push(char n){
		if(tos==a.length) {
			System.out.println("Stsck is full");
		}
		else {
			a[++tos]=n;
	}
		
	}
	int pop() {
		if(tos>=0) {
			 return a[tos--];
		}
		else {
			System.out.println("Stack is empty");
			return -1; 
		}
	}

}
   