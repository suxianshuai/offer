package questions;

import java.util.Scanner;
import java.util.Stack;

public class LU {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Stack<Character> st = new Stack<>();
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[][] a= new int [n][m];
		int count=0;
		if(a[n-1][m-1]%5==0)
			count=1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				a[i][j]=Integer.parseInt(sc.next(),16);
			}
		}
		int i=n-1;
		int j=m-1;
		while(j>0&&i>0)
		{
			    if(a[i-1][j]%5==0&&a[i][j-1]%5==0)
				count++;
				if(a[i][j-1]%5==0&&a[i-1][j]%5!=0)
					{st.add('V');
					i--;
					}
				else if(a[i-1][j]%5==0&&a[i][j-1]%5!=0)
				{
					st.add('>');
					j--;
				}
				else{
					if(a[i-1][j]>a[i][j-1])
					{
					st.add('>');
					j--;
					}
					else
					{st.add('V');
					i--;
					
				}
			}
			
		}
		while(i>0)
		{
			st.add('V');
			i--;
		}
		while(j>0)
		{
			st.add('>');
			j--;
		}
		
   
		System.out.println(count);
		while(!st.isEmpty())
		{
			System.out.print(st.pop());
		}

}
}
