package exercise;

public class ArrayDuplicate {
	public static void main(String args[]) {
		int[]n= {4,2,7,4,7};
		String c="";
		for(int i=0;i<n.length;i++) {
			for(int j=i+1;j<n.length;j++) {
				if(n[i]==n[j]) {
					//c = c+" "+ n[i];
					System.out.print(n[i]+",");
				}
			}
		}
		//System.out.println(c);
	}

}
