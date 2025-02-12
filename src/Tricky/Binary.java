package Tricky;

public class Binary {
		 public static int binary(int []a,int target) {
			 int  start=0;
			 int end=a.length-1;
			 while(start<end) {
				  int mid=(start+end)/2;
				  if(target>a[mid]) {
					  start=mid+1;
				  }
				  else if(target<a[mid]) {
					  end=mid-1;
				  }
				  else
					  return mid;
			 }
			 return -1;
		 }
		
	

}
