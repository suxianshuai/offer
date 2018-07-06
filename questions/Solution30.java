package questions;

import java.util.Stack;

public class Solution30 {
	 Stack<Integer> data =new Stack<>();
	   Stack<Integer> min =new Stack<>();
	    public void push(int node) {
	        data.push(node);
	        if(min.size()==0||node<min.peek())
	            min.push(node);
	        else min.push(min.peek());
	    }
	    
	    public void pop() {
	        if(min.size()>0&&data.size()>0)
	        {
	            data.pop();
	            min.pop();
	        }
	        
	    }
	    
	    public int top() {
	    	int a=min.peek();
	        return a;
	        
	    }
	    
	    public int min() {
	    	 int c = 0;
	        if(min.size()>0&&data.size()>0)
	        	{ c=min.peek();
			}
	       
			return c;
	    }
	    

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
