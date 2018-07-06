package sort;

import java.util.ArrayDeque;
import java.util.Arrays;

public class RadixSort {
	public static void radixSort(int []a,int m,int d)
	{
		int n=a.length;
		int i,j,k,l,power=1;
		ArrayDeque [] myQueue = new ArrayDeque[d];
		for(i=0;i<d;i++)
		{
			ArrayDeque<Integer> temp = new ArrayDeque<>();
			myQueue[i]=temp;
		}
		for(i=0;i<m;i++)
		{
			if(i==0)
				power=1;
			else power=power*d;
			for(j=0;j<n;j++)
			{
				k = a[j]/power-(a[j]/(power*d))*d;
				myQueue[k].addLast(new Integer( a[j]));
				
			}
			l=0;
			for(j=0;j<d;j++)
			{
				while(!myQueue[j].isEmpty())
				{
					a[l]=((Integer)myQueue[j].pollFirst()).intValue();
					l++;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a[]= {1,5,7,18,17,56,78,90,123,453,111,235,467,222,333,224};
		 int m=3;
		 int d=11;
		 radixSort(a,m,d);
		 System.out.println(Arrays.toString(a));
	}

}
