package questions;


class Hashtem
{
	int data;//����Ԫ��
	int info;//��־
	Hashtem next =null;
	Hashtem(int i)
	{
		info = i;
		next =null;
	}
	Hashtem(int d,int i)
	{
		info = i;
		data = d;
		next =null;
	}
	Hashtem(int d,int i,Hashtem y)
	{
		info = i;
		data = d;
		next = y;
	}
}

public class Hashmap {
	private Hashtem[] ht;//��ϣ������
	private int tableSize;
	private int currentSize;
	Hashmap (int m)//���캯��
	{
		tableSize = m;
		ht = new Hashtem[tableSize];
		currentSize = 0;
		
	}
	public boolean isin(int x)
	{
		int i =find(x);
		if(i>=0)return true;
		else return false;
	}
	public int find(int x)
	{
		int i = x %tableSize;
		int j =i;
		Hashtem t=ht[i];
		if(ht[j]==null) ht[j] =new Hashtem(0);
		while(ht[j].info==1&&ht[j]!=null)
		{   if(ht[j].data==x)
			  return j;
		    
		   else
			ht[j]=ht[j].next;//�������²���
		}
		ht[j]=t;
		return -j;//���ظ�����Ԫ�ع�ϣ��ַ������
		
	}
	
	public void insert(int x)throws Exception
	{
		int i =find(x);
		
		if(i>0)
		{   Hashtem t=ht[i];
			ht[i]=new Hashtem(x,1,null);
			ht[i].next=t;
		     currentSize ++;//��ǰԪ�صĸ�����һ
			 ht[i]=t;
		}
		else
		{   
			 ht[-i]=new Hashtem(x,1,null);
		}
		
		
		
	}
	public void delete(int x)throws Exception
	{
	
		int i = find(x);
		Hashtem t=ht[i];
		while(ht[i].data!=x)
			ht[i]=ht[i].next;
			
		if(i>=0)
		{
			if(ht[i].next==null)
			{
				ht[i]=null;
				ht[i].info =0;
				currentSize--;
			}
			else
			{
				ht[i]=ht[i].next;
				
				ht[i]=t;
				
			}
				
			
		}
		else {
			throw new Exception("�����ݲ�����");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashmap myHashTable = new Hashmap(13);
		int []a= {180,13,600,26,541,900,460};
		int i,j = 0,n=7,item = 0;
		try
		{
			for(i=0;i<n;i++)
			{
				myHashTable.insert(a[i]);
			}
//			for(i=0;i<n;i++)
//			{   j=myHashTable.find(a[i]);
//			    if(j>0)
//			    while(myHashTable.ht[j]!=null)
//				{
//			    	item=myHashTable.ht[j].data;
//			    	System.out.println("Key:"+j+" "+"Value:"+item);
//			    	myHashTable.ht[j]=myHashTable.ht[j].next;
//				}
//			    
//			}
			//myHashTable.delete();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
