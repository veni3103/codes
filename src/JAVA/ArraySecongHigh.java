package JAVA;

public class ArraySecongHigh {
	public static void main (String args[]) {
		int a[]= {1,2,3,4,112,32,54,76,98};
		int high=Integer.MIN_VALUE;
		int secondhigh=Integer.MIN_VALUE;
		int low=Integer.MAX_VALUE;
		int secondlow=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]>high) {
				high=a[i];
			}
		}
		for(int j=0;j<a.length;j++) {
			if(a[j] >secondhigh && a[j] !=high ) {
				secondhigh=a[j];
				
			}
			
		}
		for(int k=0;k<a.length;k++) {
			if(a[k]<low){
				low=a[k];
				
			}
		}
		for(int l=0;l<a.length;l++) {
			if(a[l]<secondlow && a[l] !=low) {
				secondlow=a[l];
				
			}
		}
		System.out.println( "HIGH : "+high);
		System.out.println("secondhigh:"+secondhigh);
		System.out.println("low : "+low);
		System.out.println("secondlow : "+secondlow);
					
	}

}
