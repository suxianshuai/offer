package questions;

import java.util.Scanner;

/*小东所在公司要发年终奖，而小东恰好获得了最高福利，他要在公司年会上参与一个抽奖游戏，游戏在一个6*6的棋盘上进行，上面放着36个价值不等的礼物，
每个小的棋盘上面放置着一个礼物，他需要从左上角开始游戏，每次只能向下或者向右移动一步，到达右下角停止，一路上的格子里的礼物小东都能拿到，
请设计一个算法使小东拿到价值最高的礼物。
给定一个6*6的矩阵board，其中每个元素为对应格子的礼物价值,左上角为[0,0],请返回能获得的最大价值，保证每个礼物价值大于100小于1000。*/

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
