package questions;
/* class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}*/

public class Solutiion37 {
	//1��������������˫���������ظ������ͷ�ڵ�(����������ߵĽڵ�)
	//2����λ������������һ���ڵ�(���������ұߵĽڵ�)
	//3���������������Ϊ�գ��򽫵�ǰroot׷�ӵ������������
	//4���������������˫����������������ͷ���(����������ߵĽڵ�)
	//5���������������Ϊ�գ�������������׷�ӵ���ǰroot��
	//6�����������������Ƿ�Ϊ�շ��ص�����˫�������ͷ�ڵ�

	//Convert������һ���������������һ�������˫����������˫�������ͷ��㣬����rootΪ�����������ĸ��ڵ�
	public TreeNode Convert(TreeNode root){
	    if(root==null){//������ڵ�Ϊ�գ����ؿ�
	        return null;
	    }
	    if(root.left==null&&root.right==null){//����ֻ��һ�����ڵ㣬�򷵻ظ��ڵ�
	        return root;
	    }
	    //1���������������˫���������ظ�����ͷ���left
	    TreeNode left=Convert(root.left);

	    //2����λ����������������һ���ڵ㣨���������ұߵĽڵ㣩
	    TreeNode p=left;//����һ����ʱ�ڵ�P,���������ҵ�����������һ���ڵ�(���������ұߵĽڵ�)��p��ʼ��ָ�����������ĸ��ڵ㣬
	    while(p!=null&&p.right!=null){
	        p=p.right;//����pΪ���������ұߵĽڵ�
	    }
	    //3���������������Ϊ�գ�����ǰroot׷�ӵ������������
	    if(left!=null){//����������Ϊ��
	        p.right=root;//��������������һ���ڵ�p�����������ұ߽ڵ㣩����ָ��ָ��ǰroot�ڵ�
	        root.left=p;//��ǰroot�ڵ����ָ��ָ����������������һ���ڵ�p�����������ұ߽ڵ㣩
	    }
	    //4���������������˫���������ظ������ͷ���right
	    TreeNode right=Convert(root.right);

	    //5���������������Ϊ�գ�������������׷�ӵ���ǰroot��
	    if(right!=null){//����������Ϊ��
	        right.left=root;//�����������ͷ���right����ָ��ָ��ǰroot
	        root.right=right;//��ǰroot����ָ��ָ�������������ͷ���right
	    }
	    return left!=null?left:root;//���������������Ƿ�Ϊ�շ�������˫�������ͷָ�롣  
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
