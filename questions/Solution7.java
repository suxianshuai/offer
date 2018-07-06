package questions;

public class Solution7 {
	

	public int minNumberInRotateArray(int [] array) {
		int l = array.length;
		int []b= new int[l];
		int min=0;
		if(l==0)
			return 0;
		if(l>0)
		 min=array[0];
		int i=0;
		int n=0;
		for( i=0;i<l;i++)
		{
			if(array[i]<min)
				{min=array[i];
				 n=i;
				}
		}
		
		for(int j=n;j<=l-1;j++)
		{
			b[j-n]=array[j];
		}
		for(int m=0;m<=n-1;m++)
			{b[l-n+m]=array[m];
			
			}
	
		
		
		
		
		return array[n];
		
		
	    
    }

}
