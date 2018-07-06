package questions;
//class ListNode{
//    int val;
//    ListNode next =null;
//    ListNode(int x)
//    {
//    	this.val=x;
//    	
//    }
//}

public class Solution15 {
	public ListNode FindKthToTail(ListNode head,int k)
	{    ListNode headk=head;
	   if(k==0)
		   return null;
        if(head==null)
		   return null;
		for(int i=1;i<=k-1;i++)
		{	headk=headk.next;
		  if(headk==null)
	       return null;}
        headk=headk.next;
		while(headk!=null)
		{
			head=head.next;
			headk=headk.next;
		}
	   return head;  
	}

}
