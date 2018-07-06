package questions;

public class Solution4 {
	public int[] toCompleteparallelogram(int rows,int cols,char[][] posionsInPark,
	           int euclidX,int euclidY,int monteX,int monteY)
{
char[][]a= posionsInPark;
int m =posionsInPark.length;//row
int n =posionsInPark[0].length;//col
int[]b = {0,0};
int paX = 0;
int paY = 0;
int k=0;
for(int i=0;i<m;i++)
	for(int j=0;j<m;j++)
		{if(a[i][j]=='+'&&i!=monteX&&i!=monteX)
			{paX=i+1;
         paY=j+1;}}
int midx =(monteX+euclidX)/2;		
int midy =(monteY+euclidY)/2;
if(midx<paX)
	b[0]=paX-Math.abs(monteX-euclidX);
else
	b[0]=paX+Math.abs(monteX-euclidX);
if(midy<paY)
	b[1]=paY-Math.abs(monteY-euclidY);
else
	b[1]=paY+Math.abs(monteY-euclidY);
return b;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution4 s4 = new Solution4();
		char[][]a = {{'-','-','-','-','-','-','-','-'},{'-','+','-','-','-','-','-','-'},{'-','-','-','-','-','-','-','-'},{'-','+','-','-','-','-','+','-'}};
		int[]m=s4.toCompleteparallelogram(4,8,a,
		           2,2,4,7);
		System.out.println(m[0]);
		System.out.println(m[1]);
		

	}

}
