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
			 if (cur_sum > max_sum)// �����ۼ�       
			   max_sum = cur_sum;  // ���ָ��������µ�ǰ���      
			 if (cur_sum < 0)     // �����ǰ���к�Ϊ��  
			   cur_sum = 0;        // �򲻿�����Ϊ������е�ǰ׺���ӵ�   
			}    
       System.out.println(max_sum);
	}

}
