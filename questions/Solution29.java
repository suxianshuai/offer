package questions;
//����һ�����󣬰��մ���������˳ʱ���˳�����δ�ӡ��ÿһ�����֣����磬����������¾��� 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 �����δ�ӡ������1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
import java.util.ArrayList;

public class Solution29 {

    
    public ArrayList<Integer> add(int [][] matrix,int start) {
      ArrayList<Integer> list = new ArrayList<>();
    int row=matrix.length;
       int col=matrix[0].length;
        int endX=col-1-start;
        int endY=row-1-start;
        //�������Ҵ�ӡһ��
        for(int i=start;i<=endX;i++)
        {
            int num=matrix[start][i];
            list.add(num);
        }
        //���ϵ��´�ӡһ��
        if(start<endY)
        {
            for(int i=start+1;i<=endY;++i)
            {
                int num=matrix[i][endX];
                list.add(num);
            }
        }
        //���ҵ����ӡһ��
        if(start<endX&&start<endY)
        {
            for(int i=endX-1;i>=start;--i)
            { int num=matrix[endY][i];
             list.add(num);
        }
            //���µ��ϴ�ӡһ��
            if(start<endX&&start<endY-1)
            {
                for(int i=endY-1;i>=start+1;--i)
                {
                    int num=matrix[i][start];
                    list.add(num);
                }
            }
          
    }
		return list;
    }
   public ArrayList<Integer> printMatrix(int [][] matrix)
   {  ArrayList<Integer> list1 = new ArrayList<>();
       int row1=matrix.length;
       int col1=matrix[0].length;
      
       if(row1<=0&&col1<=0)
           return null;
       int start = 0;
       while(col1>start*2&&row1>start*2)
       {
           int l=add(matrix,start).size();
           for(int i=0;i<l;i++)
           list1.add(add(matrix,start).get(i));
           ++start;
       }
       return list1;
      
   }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Solution29 s29=new Solution29();
		 int [][]a= {{1},{2}};
		 for(int i=0;i<s29.printMatrix(a).size();i++)
		 System.out.println(s29.printMatrix(a).get(i));

	}

}
