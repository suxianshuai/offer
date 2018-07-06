package questions;
import java.util.Stack;
public class Solution38 {
	
	public TreeNode ConvertBSTToBiList(TreeNode root){
	    if(root==null){
	        return null;
	    }
	    Stack<TreeNode> stack=new Stack<TreeNode>();
	    TreeNode p=root;//pΪ��ʱ�ڵ������������Ľڵ㣬��ʼֵΪ���ڵ�root
	    TreeNode rootList=null;//���ڼ�¼˫�������ͷ���
	    TreeNode pre=null;//���ڱ�������������е���һ���ڵ㣬��p����һ���ڵ�
	    boolean isFirst=true;//�ж��Ƿ�Ϊ����������ĵ�һ���ڵ�
	    while(p!=null||!stack.isEmpty()){
	        while(p!=null){
	            stack.push(p);
	            p=p.left;
	        }
	        p=stack.pop();//��ʱ��pΪ����������ߵĽڵ㣬
	        if(isFirst){//����������������ĵ�һ���ڵ�
	            rootList=p;//��p��ֵ��root�ڵ�
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
