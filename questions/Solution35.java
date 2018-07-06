package questions;

import java.util.HashSet;
import java.util.Scanner;

public class Solution35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		int n=sc.nextInt();
//		int  m=sc.nextInt();
//		HashSet<Integer>  set=new HashSet<>();
//		int []a=new int [2*n];
//		int [][]arr= new int [m][2];
      while(sc.hasNext())
      {

		int m=sc.nextInt();
		int n=sc.nextInt();
//	    String s=sc.next();
//	    int m=Integer.parseInt(String.valueOf(s.charAt(0)));
//	    int n=Integer.parseInt(String.valueOf(s.charAt(2)));
	    String []mrr=new String [m];
	    String []nrr=new String [n];
	   
	    int []num=new int [n];
	    for(int i=0;i<n;i++)
	    {
	    	num[i]=-1;
	    }
	    for(int i=0;i<m;i++)
	    {
	    	 mrr[i]=sc.next();
	    }
	 
	    for(int i=0;i<n;i++)
	    {
	    	 nrr[i]=sc.next();
	    }
	    for(int i=0;i<n;i++)
	    {
	    	for(int j=0;j<m;j++)
	    	{
			if(nrr[i].charAt(0)==mrr[i].charAt(0)&&nrr[i].contains(mrr[i]))
			{
				num[i]=1;
				break;
			}
			
		}
	    

	}
	    for(int i=0;i<n;i++)
			
			System.out.println(num[i]);
   
	}
    }
}

