package questions;
/*1.·���Ķ��壺�����ĸ���㿪ʼ����һֱ��Ҷ���

2.���ı���

3.·���ı��棺ÿ���ҵ�·��֮��Ӧ��·�����浽 ArrayList<ArrayList<Integer>> result �У����մ�ӡȫ��·��

˼·�� 
1.�ж����Ƿ�Ϊnull���Ƿ�ֻ�и��ڵ� 
2.��ǰ������������������ȷ��ʽڵ㣬Ȼ�󽫽ڵ�����У���ջ���ɣ���������ֵ��֮ǰ����е��ܺ�num��� ps:����������ջ����������ţ������ˢ�⣬���ⷵ��ֵΪ���У���ʹ�ö��У���ʵ����ࡣջ��ֱ����pop����������ջ�Ľڵ㵯����������ʹ��move(list.size()-1)�������ӵĽڵ㵯���� 
3.�жϵ�ǰ֮�ͷ��������ֵ���жϵ�ǰ�ڵ��Ƿ�Ҷ�ڵ㡣 ����ǰֵ���ڸ���ֵ���ҵ�ǰ�ڵ���Ҷ�ڵ㣬���ӡ·����Ϣ�� ����ǰֵС�ڸ���ֵ���ҵ�ǰ�ڵ㲻��Ҷ�ڵ㣬��ݹ���øýڵ������������ ����ǰֵ���ڸ���ֵ������ݹ��ˣ���Ĭ�Ͻڵ�ֵΪ����������£�
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

