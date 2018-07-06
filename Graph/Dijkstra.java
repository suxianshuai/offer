package Graph;

public class Dijkstra {
	static final int maxWeight=9999;
	public static void dijkstra(AdjMGragh g,int v0,int [] distance,int []path) throws Exception
	{
		int n=g.getNumOfVertices();
		int []s =new int [n];
		int minDis,u=0;
		for(int i=0;i<n;i++)
		{
			
			distance[i]=(int) g.getWeight(v0, i);
			s[i]=0;
			if(i!=v0&&distance[i]<maxWeight)
				path[i]=v0;
			else 
				path[i]=1;
		}
		s[v0]=1;
		for(int i=1;i<n;i++)
		{
			minDis = maxWeight;
			for(int j=0;j<n;j++)
			{
				if(s[j]==0&&distance[j]<minDis)
				{
					u=j;
					minDis=distance[j];
				}
				if(minDis==maxWeight)
					return;
				s[u]=1;
				for(int j1=0;j1<n;j1++)
				{
					if(s[j1]==0&&(int)g.getWeight(u, j1)<maxWeight&&distance[u]+(int)g.getWeight(u, j1)<distance[j1])
					{
						distance[j1]=distance[u]+(int)g.getWeight(u, j1);
						path[j]=u;
					}
				}
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}
