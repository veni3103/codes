package zoho;

import java.util.Arrays;

public class SubArraySum {
	public  static void main(String args[]) {
		int []a= {5,3,7,8,9,10};
		int target=15;
		int res=0;
		int []b= {-1};
		for(int i=0;i<a.length;i++) {
			boolean br = false;
			for(int j=i;j<a.length;j++) 
			{
				if(res==target) 
				{
					b = new int[]{i + 1, j + 1};
					br = true;
					break;
				}
				if(res>target) 
				{
					break;
				}
				res+=a[j];

			}
			if(br)
			{
				break;
			}
		}
		System.out.println(Arrays.toString(b));

	}

}
