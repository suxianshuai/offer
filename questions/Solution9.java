package questions;

public class Solution9 {
	  public int JumpFloor(int target) {
		  if(target==0)
			  return 1;
		  if(target==1)
			  return 1;
		  if(target==2)
			  return 2;
//		  else 
//			  return JumpFloor( target-1)+JumpFloor( target-2);
		  int one = 1;
		  int two =1;
		  int N = 0;
		  for(int i=2;i<=target;i++)
		  {
			  N=one + two;
			 one =two;
			  two=N;
		  }
		  return N;

	    }

}
