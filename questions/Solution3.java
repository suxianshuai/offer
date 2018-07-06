package questions;

 
import java.util.ArrayList;
import java.util.Stack;
 class ListNode
{
	int val;
	ListNode next = null;
	ListNode(int val)
	{
		this.val=val;
	}
	
}
public class Solution3{
	ArrayList<Integer> nl = new ArrayList<>();
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
//		
//		 if(listNode!=null)
//		 {   
//			this.printListFromTailToHead(listNode.next);
//			nl.add(listNode.val);
//     		System.out.println(listNode.val); 
//		 } 
		 Stack<Integer> stack = new Stack<>();
		 while(listNode!=null)
		 { stack.push(listNode.val);
		      listNode=listNode.next;
		  }
		 while(!stack.isEmpty())
			 nl.add(stack.pop());
		return nl;

    }
}