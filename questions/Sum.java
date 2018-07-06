package questions;

import java.util.Scanner;

public class Sum {
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 @SuppressWarnings("resource")
		 Scanner sc = new Scanner(System.in);
		 int m=sc.nextInt();
		 int n= sc.nextInt();
		 long a[] = new long[m];
		 for(int i=0;i<m;i++)
		 {
			 a[i]=sc.nextLong();
		 }
	    long cur_sum = 0, max_sum = 0; 
		for (int i = 0; i < m; i++)   
		{  
			 cur_sum += a[i];  
			 if (cur_sum > max_sum)// 向右累加       
			   max_sum = cur_sum;  // 发现更大和则更新当前结果      
			 if (cur_sum < 0)     // 如果当前子列和为负  
			   cur_sum = 0;        // 则不可能作为最大子列的前缀，扔掉   
			}    
       System.out.println(max_sum);
	}

}
