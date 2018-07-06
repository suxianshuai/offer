package questions;

public class Solution17 {
	public int[] toCompleteparallelogram(int rows,int cols,int[][] posionsInPark,
	           int euclidX,int euclidY,int monteX,int monteY)
{
int[][]a= posionsInPark;
int m =posionsInPark.length;//row
int n =posionsInPark[0].length;//col
int[]b = {0,0};

int k=0;
int []countX =new int[m];
int []countY =new int[m];
for(int i=0;i<m;i++)
	countX[i]=0;
for(int j=0;j<n;j++)
	countY[j]=0;
for(int i=0;i<m;i++)
	 
	for(int j=0;j<n;j++)
		{if(a[i][j]==1)
			countX[i]+=1;
				
		}
for(int j=0;j<n;j++)
	 
	for(int i=0;i<n;i++)
		{if(a[i][j]==1)
			countY[i]+=1;
				
		}
int midx =0;		
int midy =0;
int MaxX = countX[0];
int MaxY =countX[0];
for(int i=0;i<m;i++)
	if(countX[i]>MaxX)
		{MaxX=countX[i];
          midx=i;}
for(int i=0;i<n;i++)
	if(countY[i]>MaxY)
		{MaxY=countX[i];
          midy=i;}
                


	b[0]=midx+1;
	b[1]=midy+1;
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
