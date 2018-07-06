package questions;

public class Solution12 {
	public int NumberOf1(int n) {
		int count =0;
		
		
//		int b=1;
//		for(int i=0;i<32;i++)
//		{  if((n&b)!=0)
//		     count++;
//		 
//		b=b<<1;
//			
//		
//		}
		while(n!=0)
		{
			count++;
			n=n&n-1;
		}
   return count;
    }

}
