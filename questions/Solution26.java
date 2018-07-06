package questions;

import java.util.Scanner;

/*С�����ڹ�˾Ҫ�����ս�����С��ǡ�û������߸�������Ҫ�ڹ�˾����ϲ���һ���齱��Ϸ����Ϸ��һ��6*6�������Ͻ��У��������36����ֵ���ȵ����
ÿ��С���������������һ���������Ҫ�����Ͻǿ�ʼ��Ϸ��ÿ��ֻ�����»��������ƶ�һ�����������½�ֹͣ��һ·�ϵĸ����������С�������õ���
�����һ���㷨ʹС���õ���ֵ��ߵ����
����һ��6*6�ľ���board������ÿ��Ԫ��Ϊ��Ӧ���ӵ������ֵ,���Ͻ�Ϊ[0,0],�뷵���ܻ�õ�����ֵ����֤ÿ�������ֵ����100С��1000��*/

public class Solution26 {
	 public static int getMost(int[][] board) {
		 int row = board.length;
		 int col =board[0].length;
		 int [][]most=new int[row][col];
		 most[0][0]=board[0][0];
		 for(int m=1;m<row;m++)
		 {
			 most[0][m]=most[0][m-1]+board[0][m];
			 most[m][0]=most[m-1][0]+board[m][0];
		 }
		 for(int i=1;i<row;i++)
		 { for(int j=1;j<col;j++)
		 {
			 most[i][j]=Math.max(most[i-1][j],most[i][j-1])+board[i][j];
			
		 }
		 }
		return most[row-1 ][col-1];
	        // write code here
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc = new Scanner(System.in);
		int [][]b=new int[6][6];
		int count =1;
		for(int i=0;i<6;i++)
		{ count =1;
		
		 for(int j=0;j<6;j++){ 
		
		     b[i][j]=count++;	 
		    System.out.print( b[i][j]);
		 }
		 System.out.println();
		}
		
		int most =getMost(b);
		System.out.println(most);
	}

}
