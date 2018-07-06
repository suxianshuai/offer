package sort;

public class HeapSort {
	public static void createHeap(int []a,int n,int h)
	{
		int i,j,flag = 0;
		int temp;
		i=h;
		j=2*i+1;
		temp=a[i];
		while(j<n&&flag!=1)
		{
			if(j<n-1&&a[j]<a[j+1])
				j++;
			if(temp>a[j])
				flag=1;
			else {
				a[i]=a[j];
				i=j;
				j=2*i+1;
			}
		}
		a[i]=temp;
	}
	public static void initCreateHeap(int []a)
	{
		int n =a.length;
		for(int i=(n-1)/2;i>=0;i--)
		{
			createHeap(a,n,i);
		}
	}
	public static void heapSort(int []a)
	{
		int temp;
		int n=a.length;
		initCreateHeap(a);
		for(int i=n-1;i>0;i--)
		{
			temp=a[0];
			a[0]=a[i];
			a[i]=temp;	
			createHeap(a,i,0);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a[]= {13,6,8,9,0,5,7,5};
     heapSort(a);
     for(int i=0;i<a.length;i++)
     {
    	 System.out.println(a[i]);
     }
     
	}

}
