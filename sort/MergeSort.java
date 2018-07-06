package sort;

import java.util.Arrays;

public class MergeSort {
	public static void merge(int []a,int[] swap,int k)
	{
		int n = a.length;
		int m=0,u1 = 0,l2 = 0,i,j,u2 = 0;
		int l1=0;         //第一个有序子数组下界为0
		while(l1+k<=n-1)   //判断下一个第一个有序子数组是否存在（数组越界）
		{
			l2=l1+k;       //计算第二个有序子数组下界
			u1=l2-1;       //计算第一个有序子数组上界
			u2=(l2+k-1<=n-1)?l2+k-1:n-1;//计算第二个有序子数组上界
			for(i=l1,j=l2;i<=u1&&j<=u2;m++)
			{
				if(a[i]<=a[j])
				{
					swap[m]=a[i];
					i++;            //归并
				}
				else
				{
					swap[m]=a[j];
					j++;
				}
				
			}
			
			while(i<=u1)                //子数组2已归并完，将子数组1剩余的元素归并到数组swap中
			{
				swap[m]=a[i];
				m++;              
				i++;
			}
			while(j<=u2)               //子数组1已归并完，将子数组1剩余的元素归并到数组swap中
			{
				swap[m]=a[j];
				m++;
				j++;
			
			}
			l1=u2+1;
		}
		for(i=l1;i<n;i++,m++)
		{
			swap[m]=a[i];
		}
		
	}
	public static void mergeSort(int []a)
	{
		int i;
		int n=a.length;
		int k=1;
		int [] swap=new int[n];
		while(k<n) {
			merge(a,swap,k);
		for(i=0;i<n;i++){
			 a[i]=swap[i];
		}
		k=2*k;	
		}
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a[]= {1,5,7,18,17,56,78,90,123,453,111,235,467,222,333,224};
		
		 mergeSort(a);
		 System.out.println(Arrays.toString(a));

	}

}
