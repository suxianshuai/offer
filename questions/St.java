package questions;

public class St {
	public static void change(double[][]a)
	{
		 double max=0.0;
		final int i=a.length;
		final int j=a[0].length;

		double [][]s = new double[i][j];
		for(int row=0;row<i;row++)
		{ for(int col=0;col<j;col++)
		  {
			for(int m=0;m<i;m++)
			{
			   for(int n=0;n<i;n++)
			{  
			     s[row][col]+=(a[m][row]-a[n][row])*(a[m][col]-a[n][col]);	
			}
		
		  }
		}
		}
		
			 for(int g=0;g<i;g++)
		        {
				 for(int h=0;h<j;h++)
				 	{
		        	
					 System.out.print(s[g][h]+" ");
				 	}
				 	
				   System.out.println();
		        }
	}

	public static void main(String[] args) {
		double[][] a1={{0,1,0.8333,1,0.4},{0.4167,0.6,1,0,0},{1,0,0,0.5,1},{0.6667,0.4,0.6667,0.5,0.8}};
		change(a1);
	}
}
