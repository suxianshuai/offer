package questions;
 import java.util.*;
public class Solution43 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []a = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			
		}
		for(int i=0;i<n;i++)
		{
			if(a[i]==100)
			{
				System.out.println(1);
				System.out.println(i+1);
				break;
			}
			for(int j=i+1;j<n;j++)
			{
				if(a[i]+a[j]==100)
				{
					System.out.println(2);
					System.out.println(i+1);
					System.out.println(j+1);
					return;
				}
				for(int m=j+1;m<n;m++)
				{
					if(a[i]+a[j]+a[m]==100)
					{	
						System.out.println(3);
					    System.out.println(i+1);
					    System.out.println(j+1);
					    System.out.println(m+1);
					    return;
					}
					for(int f=m+1;f<n;f++)
					{
						if(a[i]+a[j]+a[m]+a[f]==100)
						{	
							System.out.println(4);
						    System.out.println(i+1);
						    System.out.println(j+1);
						    System.out.println(m+1);
						    System.out.println(f+1);
						    return;
						}
						for(int d=f+1;d<n;d++)
						{
							if(a[i]+a[j]+a[m]+a[f]+a[d]==100)
							{	
								System.out.println(5);
							    System.out.println(i+1);
							    System.out.println(j+1);
							    System.out.println(m+1);
							    System.out.println(f+1);
							    System.out.println(d+1);
							    return;
							}
							
						}
						
					}
				}
			}
		}

	}

}
