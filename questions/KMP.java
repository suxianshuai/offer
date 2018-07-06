package questions;

public class KMP {
	public static int kmp(String str,String dest,int[]next)
	{
		
		for(int i=0,j=0;i<str.length();i++)
		{
			while (j>0&&str.charAt(i)!=dest.charAt(j))
			{
				j=next[j];
			}
			if(str.charAt(i)==dest.charAt(j))
			{
				j++;
			}
			if(j==dest.length())
				return i-j+1;
			
			
		}
		return 0;
	}
	public static int [] kmpnext(String dest)
	{
		
		int[] next = new int[dest.length()];
	
		for(int i=0;i<dest.length();i++)
		{
			String sub = dest.substring(0,i);
			int maxLen=0;
			for(int j=0;j<sub.length();j++)
			{
				String subChild = sub.substring(0,j);
				if(sub.endsWith(subChild)&&subChild.length()>maxLen)
			
				maxLen=subChild.length();
			}
			next[i]=maxLen;
		
		}
		return next;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="ababab";
		String b="abdfgabdbababab";
		int[] next =kmpnext(a);
		int res =kmp(b,a,next);
		System.out.println(res);
		for(int i=0;i<next.length;i++)
			System.out.println(next[i]);
		

	}

}
