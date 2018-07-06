package questions;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class Solution32 {
	public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
	      ArrayDeque<TreeNode> queue =new ArrayDeque<TreeNode>();
	      ArrayList<Integer> list=new ArrayList<>();
	      if(root==null)
	    	  return null;
	      queue.offerFirst(root);
	      while(!queue.isEmpty())
	      {
	    	  
	      if(queue.peekFirst().left!=null)
	    	  queue.add(queue.peekFirst().left);
	      if(queue.peekFirst().right!=null)
	    	  queue.add(queue.peekFirst().right);
	      list.add(queue.pollFirst().val);
	      }
		return list;
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
