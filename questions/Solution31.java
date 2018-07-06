package questions;

import java.util.Stack;

public class Solution31 {
	 public boolean IsPopOrder(int [] pushA,int [] popA) {
		 boolean flag=false;
		 Stack<Integer> stack=new Stack<>();
		 int length=pushA.length;
		 int i=0,j=0;
		 if(pushA!=null&&popA!=null)
		 {
	       while(j<length)
          {
			 while(i<length&&pushA[i]!=popA[j])
			 {
				 stack.push(new Integer(pushA[i]));
				 
				 i++;
			 }
			 i++;
			 j++;
			 while(!stack.empty()&&j<length)
			 {
				 int top=0;
				 if((top=stack.pop())==popA[j])
					 j++;
				 else
				 {
					 stack.push(top);
					 break;
				 }
			 }
			 if(stack.empty()&&j==length)
				 flag=true;
			 
			 
		  } 
	       
		 }
		return flag;
		 
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
