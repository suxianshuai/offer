package questions;

public class Solution14 {
	 public void reOrderArray(int [] array) {
	        int j=0;
	        int []b = new int[array.length];
	        for(int m=0;m<array.length;m++)
	            b[m]=array[m];
	        for(int i=0;i<b.length;i++)
	            if(b[i]%2==1)
	               array[j++]=b[i];
	        for(int i=0;i<b.length;i++)
	            if(b[i]%2==0)
	                array[j++]=b[i];
	        
	    }

}
