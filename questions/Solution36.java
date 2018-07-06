package questions;


class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}

public class Solution36 {
   static void CloneNodes(RandomListNode pHead)
    {   RandomListNode pNode = pHead;
       
        while(pNode!=null)
        {
            RandomListNode pClone = new RandomListNode(0);
            pClone.label =pNode.label;
            pClone.next = pNode.next;
            pNode.next = pClone;
            pNode= pClone.next;
        }
    }
    static void ConnectSiblingNodes(RandomListNode pHead)
    {RandomListNode pNode = pHead;
        while(pNode!=null)
        {
            RandomListNode pClone =pNode.next;
            if(pNode.random!=null)
            {
                pClone.random=pNode.random.next;
            }
            pNode=pClone.next;
            
        }
    }
  public  static RandomListNode ReconnectNodes (RandomListNode pHead)
    {
        RandomListNode pNode=pHead;
        RandomListNode pCloneHead = new RandomListNode(0);
        RandomListNode pCloneNode = new RandomListNode(0);
        if(pNode!=null)
        {
            pCloneHead=pCloneNode = pNode.next;
            pNode.next = pCloneNode.next;
            pNode = pNode.next;
        }
        while(pNode!=null)
        {
            pCloneNode.next=pNode.next;
            pCloneNode=pCloneNode.next;
            pNode.next=pCloneNode.next;
            pNode=pNode.next;
        }
        return pCloneHead;
    }
    public RandomListNode Clone(RandomListNode pHead)
    {CloneNodes(pHead);
    ConnectSiblingNodes(pHead);
     return ReconnectNodes(pHead);
        
        
        
    }
	public static void main(String[] args)
    {
    	RandomListNode r1=new RandomListNode(1);
    	RandomListNode r2=new RandomListNode(2);
    	RandomListNode r3=new RandomListNode(3);
    	r1.next=r2;
    	r2.next=r3;
    	r1.random=r3;
    	Solution36 s36= new Solution36();
    	s36.Clone(r1);
    	while(r1!=null)
    	{
    		System.out.println(r1.label);
    		
    		if(r1.random!=null)
    		{
    			System.out.println("Random:"+r1.random.label);
    		}
    		r1=r1.next;
    	}
    	
    }
}