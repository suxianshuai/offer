package questions;
/*������һϵ�еķ������Է��֣����������������������ĺ���Randa��Randb�� �����ͨ�����·�ʽ���ɹ���Randab������1��a*b���������
Randab = b * (Randa - 1) + Randb
Randab = a * (Randb - 1) + Randa
*/
public class rand5 {
	public int rand7()
	{
		int [][]vals= {{1,2,3,4,5},{6,7,1,2,3},{4,5,6,7,1},{2,3,4,5,6},{7,0,0,0,0}};
		int result = 0;
		while(result==0)
		{
			int i = (int) (Math.random()%5+1);
			int j =(int) (Math.random()%5+1);
			result = vals[i-1][j-1];
		}
		return result;
	}
   public int Rand7()
   {
	   int i = 0;
	   while(i>21)
	   {
		   i=(int) (5*(Math.random()%5+1-1)+Math.random()%5+1);
		  
	   }
	   return i%7+1;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
