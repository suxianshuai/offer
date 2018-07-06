package questions;
import java.util.Stack;
public class Solution38 {
	
	public TreeNode ConvertBSTToBiList(TreeNode root){
	    if(root==null){
	        return null;
	    }
	    Stack<TreeNode> stack=new Stack<TreeNode>();
	    TreeNode p=root;//p为临时节点用来遍历树的节点，初始值为根节点root
	    TreeNode rootList=null;//用于记录双向链表的头结点
	    TreeNode pre=null;//用于保存中序遍历序列的上一个节点，即p的上一个节点
	    boolean isFirst=true;//判断是否为左子树链表的第一个节点
	    while(p!=null||!stack.isEmpty()){
	        while(p!=null){
	            stack.push(p);
	            p=p.left;
	        }
	        p=stack.pop();//此时的p为左子树最左边的节点，
	        if(isFirst){//假如是左子树链表的第一个节点
	            rootList=p;//将p赋值给root节点
	            pre=rootList;
	            isFirst=false;
	        }else{
	            pre.right=p;
	            p.left=pre;
	            pre=p;
	        }
	        p=p.right;
	    }
	    return rootList;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
