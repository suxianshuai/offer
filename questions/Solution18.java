package questions;

public class Solution18 {
	public int jie(int m)
	{
		int result = 1;
		for(int i=1;i<=m;i++)
		result=result*i;
		return result;
	}
	public int sum(int k,int a,int x,int b,int y)
	{
		int count=0;
		int []t=new int[10];
		int []g=new int[10];
		for(int i=0;i<10;i++)
			{t[i]=-1;
		    g[i]=-1;}
		int o=0;
		int r=0;
		for(int i=0;i<=x;i++)
			{for(int j=0;j<=y;j++)
			    {if(k==i*a+j*b)
					{t[o++]=i;
		            g[r++]=j;
		            break;
		            }
			    }
			}	
		int f=t.length;
//		System.out.print(f);
//		System.out.print("----");
//		            
		for(int i=0;i<=f;i++)
		{     
			if(t[i]>-1)
			  {int e=jie(x)*jie(y);
			  int z =jie(t[i])*jie(g[i])*jie(x-t[i])*jie(y-g[i]);
				count=(e/z+count)%1000000007;
			  }
			else
				break;
		}
		
		return count;
	}

}
