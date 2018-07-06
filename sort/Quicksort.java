package sort;

public class Quicksort {
	

	public static void Qsort(int[] arr,int low,int high) 
	{
		int i=low;
		int j=high;
		int temp=arr[low];
		while (i<j)
		{
			while(i<j&&arr[j]>=temp)j--;
			arr[i]=arr[j];
			while(i<j&&arr[i]<=temp)i++;
			arr[j]=arr[i];
			
		}
		arr[i]=temp;
		if(low<i)Qsort(arr,low,i-1);
		if(i<high)Qsort(arr,i+1,high);
	}
   


    	
    	
 
    
	public static void main(String[] args) {
		int[] arr = {50,10,90,30,70,40,80,60,20};
        Qsort(arr,0,8);
        for (int array : arr) {
            System.out.print(array+" ");
        }
        System.out.println();

		// TODO Auto-generated method stub

	}

}
