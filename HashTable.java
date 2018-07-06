
class HashItem
{
	int data;//数据元素
	int info;//标志
	HashItem next =null;
	HashItem(int i)
	{
		info = i;
	}
	HashItem(int d,int i)
	{
		info = i;
		data = d;
	}
}

public class HashTable {
	private HashItem[] ht;//哈希表数组
	private int tableSize;
	private int currentSize;
	HashTable (int m)//构造函数
	{
		tableSize = m;
		ht = new HashItem[tableSize];
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
		if(ht[j]==null) ht[j] =new HashItem(0);
		while(ht[j].info==1&&ht[j].data!=x)
		{
			j=(j+1)% tableSize;
			if(j==i) return -tableSize;//表示已查完整个哈希表的数组
		}
		if(ht[j].data==x)
			return j;
		else 
		return -j;//返回该数组元素哈希地址的数组
		
	}
	public int getValue(int i)
	{
		return ht[i].data;
	}
	public void insert(int x)throws Exception
	{
		int i =find(x);
		if(i>0) {throw new Exception("该数据已存在");}
		else if(i!=-tableSize)
		{
			ht[-i]=new HashItem(x,1);
			currentSize ++;//当前元素的个数加一
		}
		else {
			throw new Exception("哈希表已满，无法插入");
		
		}
		
	}
	public void delete(int x)throws Exception
	{
		int i = find(x);
		if(i>=0)
		{
			ht[i].info =0;
			currentSize--;
		}
		else {
			throw new Exception("该数据不存在");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashTable myHashTable = new HashTable(13);
		int []a= {180,750,600,430,541,900,460};
		int i,j = 0,n=7,item = 0;
		try
		{
			for(i=0;i<n;i++)
			{
				myHashTable.insert(a[i]);
			}
			for(i=0;i<n;i++)
			{   j=myHashTable.find(a[i]);
			    if(j>0)
				item=myHashTable.getValue(j);
				System.out.println("Key:"+j+" "+"Value:"+item);
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
