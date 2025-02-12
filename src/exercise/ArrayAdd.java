package exercise;

public class ArrayAdd {
	public static void main(String args[]) {
	
		int marks[]= {10,4,5,7,8,98,56,34,23,88};
		int add=0;
		for(int i=0;i<marks.length;i++) {
			add=add+marks[i];
		}
		System.out.println(add);
	}

}


