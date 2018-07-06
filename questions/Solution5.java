package questions;
 class TreeNode
{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x)
	{
		val =x;
		this.left=null;
		this.right=null;
	}
}

public class Solution5 {
	
	public void preOrder(TreeNode t)
	{  if(t==null)
		return;
	   System.out.print(t.val+",");
	   if(t.left!=null)
		preOrder(t.left);
		if(t.right!=null)
		preOrder(t.right);
	}
	public  void inOrder(TreeNode t)
	{
		if(t==null)
			return;
		if(t.left!=null)
		{inOrder(t.left);} 
		System.out.print(t.val+",");
	    if(t.right!=null)
		{inOrder(t.right);}
	    
	}
   public TreeNode reConstructBinaryTree(int []pre,int[]in)
   {   TreeNode root = new TreeNode(pre[0]);
	   
	   
	   int i=0;
	   int l=in.length;
	   if(l==0)
		   return null;
	   if(l==1)
	   {
		   root.left=null;
		   root.right=null;
		   root.val=pre[0];
	   }
		   
	  
	   for(i =0;i<l;i++)
	   { if(in[i]==pre[0])
		   break;
	   }
	   
	   if(i>0)
	   {
		   int [] leftpre = new int[i];
		   int [] leftin=new int[i];
		   for(int j=0;j<i;j++)
		   {
			   leftpre[j]=pre[j+1];
			   
		   }
		   for(int j=0;j<i;j++)
		   {
			   leftin[j]=in[j];
			   
		   }
		   root.left=reConstructBinaryTree(leftpre,leftin);
	   }else
	   {root.left=null;}
	   if(l-i-1>0)
	   {
		   int [] rightpre = new int[l-i-1];
		   int [] rightin=new int[l-i-1];
		   for(int j=i+1;j<l;j++)
		   {
			   rightpre[j-i-1]=pre[j];
			   rightin[j-i-1]=in[j];
			   
		   }
		   root.right=reConstructBinaryTree(rightpre,rightin);
	   }else
	   {root.right=null;}
	   return root;
   }
   public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Solution5 s5= new Solution5();
	   TreeNode t = new TreeNode(0);
	   
	   int[]pre= {1,2,4,7,3,5,6,8};
	   int[]in= {4,7,2,1,5,3,8,6};
	  t= s5.reConstructBinaryTree(pre,in);
      s5.preOrder(t);
      System.out.println("----------");
      s5.inOrder(t);
      System.out.println("----------");
	}

}
