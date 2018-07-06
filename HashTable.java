
class HashItem
{
	int data;//����Ԫ��
	int info;//��־
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
	private HashItem[] ht;//��ϣ������
	private int tableSize;
	private int currentSize;
	HashTable (int m)//���캯��
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
			if(j==i) return -tableSize;//��ʾ�Ѳ���������ϣ�������
		}
		if(ht[j].data==x)
			return j;
		else 
		return -j;//���ظ�����Ԫ�ع�ϣ��ַ������
		
	}
	public int getValue(int i)
	{
		return ht[i].data;
	}
	public void insert(int x)throws Exception
	{
		int i =find(x);
		if(i>0) {throw new Exception("�������Ѵ���");}
		else if(i!=-tableSize)
		{
			ht[-i]=new HashItem(x,1);
			currentSize ++;//��ǰԪ�صĸ�����һ
		}
		else {
			throw new Exception("��ϣ���������޷�����");
		
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
			throw new Exception("�����ݲ�����");
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
