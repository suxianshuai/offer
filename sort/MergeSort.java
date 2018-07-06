package sort;

import java.util.Arrays;

public class MergeSort {
	public static void merge(int []a,int[] swap,int k)
	{
		int n = a.length;
		int m=0,u1 = 0,l2 = 0,i,j,u2 = 0;
		int l1=0;         //��һ�������������½�Ϊ0
		while(l1+k<=n-1)   //�ж���һ����һ�������������Ƿ���ڣ�����Խ�磩
		{
			l2=l1+k;       //����ڶ��������������½�
			u1=l2-1;       //�����һ�������������Ͻ�
			u2=(l2+k-1<=n-1)?l2+k-1:n-1;//����ڶ��������������Ͻ�
			for(i=l1,j=l2;i<=u1&&j<=u2;m++)
			{
				if(a[i]<=a[j])
				{
					swap[m]=a[i];
					i++;            //�鲢
				}
				else
				{
					swap[m]=a[j];
					j++;
				}
				
			}
			
			while(i<=u1)                //������2�ѹ鲢�꣬��������1ʣ���Ԫ�ع鲢������swap��
			{
				swap[m]=a[i];
				m++;              
				i++;
			}
			while(j<=u2)               //������1�ѹ鲢�꣬��������1ʣ���Ԫ�ع鲢������swap��
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
