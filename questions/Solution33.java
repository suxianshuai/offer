package questions;

import java.util.Arrays;

public class Solution33 {
	 public boolean VerifySquenceOfBST(int [] sequence) {
		
		 if(sequence==null||sequence.length==0)
			 {return false;}
		 int l=sequence.length;
		 int root=sequence[l-1];

		 int i=0;
		 for(;i<l-1;i++)
		 {
			 if(sequence[i]>root)
			      { break;}
		 }
		
		 for(int j=i;j<l-1;j++)
		 {
			 if(sequence[j]<root)
			 {
				 return false;
			 }
		 }
		 boolean left=true;
	     boolean right=true;
		 if(i>0)
		 {
		 left=VerifySquenceOfBST(Arrays.copyOfRange(sequence, 0, i));
		 }
		 if(i<l-1)
		 {
		 right=VerifySquenceOfBST(Arrays.copyOfRange(sequence, i, l-1));
		 }
		 return left&&right;
		 
		 
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution33 s33=new Solution33();
		int arr[]= {5,7,9,11,10,8};
		boolean b=s33.VerifySquenceOfBST(arr);
		System.out.println(b);
	

	}

}
