package zoho;

public class MissingNum {
	public static void main(String args[]) {
		int[]a= {1,2,3,5};
		int n=a.length+1;
		int res=n*(n+1)/2;
		for(int ans :a) {
			 res-=ans;
		}
		System.out.println(res);
		
	}

}
