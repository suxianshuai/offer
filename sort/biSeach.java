package sort;

public class biSeach {
	public static int biSeach(int[]a, int elem)
	{
		int n =a.length-1;
		int low=0,high=n,mid;
		while(low<=high)
		{
			mid=(low+high)/2;
			if(a[mid]==elem) return mid;
			else if(elem>a[mid]) low=mid+1;
			else high=mid-1;
			
		}
		return -1;
		
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
        int a[]= {1,5,7,9,12,56,78,90,123,453};
        System.out.println(biSeach(a,14));
        
	}

}
