package questions;
/*1.路径的定义：从树的根结点开始往下一直到叶结点

2.树的遍历

3.路径的保存：每次找到路径之后，应将路径保存到 ArrayList<ArrayList<Integer>> result 中，最终打印全部路径

思路： 
1.判断树是否为null、是否只有根节点 
2.用前序遍历方法，可以首先访问节点，然后将节点入队列（或栈均可），并将数值和之前入队列的总和num相加 ps:个人倾向于栈，但由于在牛客网上刷题，该题返回值为队列，故使用队列，其实都差不多。栈可直接用pop将该最后加入栈的节点弹出，队列则使用move(list.size()-1)将最后入队的节点弹出。 
3.判断当前之和否满足给定值，判断当前节点是否叶节点。 若当前值等于给定值，且当前节点是叶节点，则打印路径信息； 若当前值小于给定值，且当前节点不是叶节点，则递归调用该节点的左右子树； 若当前值大于给定值，无需递归了（在默认节点值为正数的情况下）
*/
import java.util.ArrayList;

public class Solution34 {
	 ArrayList<Integer> li= new ArrayList<>();
	  ArrayList<ArrayList<Integer>> list=new ArrayList<>();
	  int num=0;
	  public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
		  
	        if(root==null||target<root.val)
	            return list;
	        boolean isLeaf=root.left==null&&root.right==null;
	        num+=root.val;
	        li.add(root.val);
	        if(num==target&&isLeaf)
	        {
	        	ArrayList<Integer> path=new ArrayList<>();
	          for(int i=0;i<li.size();i++)
	            path.add(li.get(i));
	          list.add(path);
	           
	        }
	        
	        if(root.left!=null&&num<target) 
	        	FindPath(root.left,target);
	        if(root.right!=null&&num<target)
	        	FindPath(root.right,target);
	        num-=root.val;
	        li.remove(li.size()-1);
	        return list;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  TreeNode root = new TreeNode(8);  
	        root.left = new TreeNode(6);  
	        root.right = new TreeNode(10);  
	        root.left.left = new TreeNode(5);  
	        root.left.right = new TreeNode(7);  
	        root.right.left = new TreeNode(9);  
	        root.right.right = new TreeNode(11);  
	        int target = 27;  
	        Solution34 s = new Solution34();  
	        ArrayList<ArrayList<Integer>> lists = s.FindPath(root, target);  
	  
	        for (int i = 0; i < lists.size(); i++)  
	        {  
	            System.out.println(lists.get(i));  
	        }  
	    }  
	  
	}  

