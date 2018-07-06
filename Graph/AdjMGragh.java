package Graph;

import java.util.ArrayList;

public class AdjMGragh {
	
	static final int maxWeight =10000;
	private ArrayList vertices;
	private int [][]edge;
	private int numOfEdges;
	public AdjMGragh(int maxV)
	{
		vertices = new ArrayList(maxV);
		edge = new int [maxV][maxV];
		for (int i=0;i<maxV;i++)
		{
			for(int j=0;j<maxV;j++)
			{
				if(i==j)
					edge[i][j]=0;
				else
					edge[i][j]=maxWeight;
			}
			
		}
		numOfEdges=0;
		
	}
	public int getNumOfVertices() {
		return vertices.size();
	}
	public Object getValue(int v) throws  Exception{
		// TODO Auto-generated method stub
		return vertices.get(v);
	}
	public Object getWeight(int v1,int v2) throws  Exception{
		// TODO Auto-generated method stub
	if(v1<0||v1>=vertices.size()||v2<0||v2>=vertices.size())
			
			throw new Exception("参数v1或v2越界错误！");
	return edge[v1][v2];
	}
	public void insertVetex(Object vertex)
	{
		vertices.add(vertex);
	}
	public void insertEnge(int v1,int v2,int weight) throws Exception
	{
		if(v1<0||v1>=vertices.size()||v2<0||v2>=vertices.size())
		
			throw new Exception("参数v1或v2越界错误！");
		edge[v1][v2]=weight;
		numOfEdges++;
	}
	public void deleteEnge(int v1,int v2) throws Exception
	{
		if(v1<0||v1>=vertices.size()||v2<0||v2>=vertices.size())
		
			throw new Exception("参数v1或v2越界错误！");
		if(edge[v1][v2]==maxWeight||v1==v2)
			throw new Exception("改边不存在");
		edge[v1][v2]=maxWeight;
			
		numOfEdges--;
	}
	
	private void depthFirstSearch (int v ,boolean[] visited,Visit vs) throws Exception
	{
		vs.print(getValue(v));
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
