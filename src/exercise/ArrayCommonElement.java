package exercise;

public class ArrayCommonElement {
	public static void main(String args[]) {
		int a1[]= {1,2,3,4};
		int a2[]= {3,4,5,6};
		int i,j;
		String c="";
		for(i=0;i<a1.length;i++) {
			for(j=0;j<a2.length;j++) {
				if(a1[i]==a2[j]) {
					//c= c+a1[i]+" ";
					System.out.print(a1[i]+" ");
				}
			}
		}
		//System.out.println(c);
	}

}
