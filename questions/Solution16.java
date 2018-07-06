package questions;

import java.util.Stack;

public class Solution16 {
	public ListNode ReverseList(ListNode head) {
//		if(head ==null)
//			return null;
//		ListNode tail = head;
//		ListNode n= tail;
//		Stack<Integer> stack = new Stack<>();
//		
//		while(head!=null)
//		{
//			stack.push(head.val);
//			head=head.next;
//		}
//		while(!stack.empty())
//		{
//			tail.val=stack.pop();
//			tail=tail.next;
//		}
//    return n;
		
		ListNode pre=head.next;
		ListNode s=head;
		head.next=null;
		head=pre;
		while(head!=null)
		{   pre=head.next;
			head.next=s;
			s=head;
			head=pre;
			
			
		}
		return s;	
					
			
    }

}
