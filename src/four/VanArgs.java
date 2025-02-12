package four;

public class VanArgs {
	static int minvalue(int...value) {
		int min=Integer.MAX_VALUE;
		for(int k:value) {
			if(k<min)
				min=k;
		}
		return min;
		
	}
	static double minvalue(double...value) {
		double min=Integer.MAX_VALUE;
		for(double k:value) {
			if(k<min)
				min=k;
		}
		return min;
		
	}
	
	public static void main(String args[]) {
		int m=minvalue(5,2,5,7,1);
		System.out.println(m);
		int n=minvalue(-2,0,1,4,-2);
		System.out.println(n);
		double o=minvalue(1.4,5.3,0.2,-1.5);
		System.out.println(o);
	}

}
