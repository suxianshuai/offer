package questions;

public class Solution10 {
	 public int JumpFloor(int target) {
     int n=1;
	  if(target==0)
		  return 1;
	  if(target==1)
		  return 1;
	  if(target==2)
		  return 2;
	  
	  else 
		  for(int i=1;i<target;i++)
			  n=n*2;
		  return n;
	 }
}
