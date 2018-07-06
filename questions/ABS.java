package questions;

import java.util.Scanner;

public class ABS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 int m=sc.nextInt();
		 int n= sc.nextInt();
		 long a[] = new long[m];
		 float b [] = new float[m];
		 for(int i=0;i<m;i++)
		 {
			 a[i]=sc.nextLong();
			 b[i]=a[i]/(float)n;
			
		 }
		 long sum=0;
		 for(int i=0;i<m;i++)
		 {
			 for(int j=i+1;j<m;j++)
			 {
				 
				sum+=(long)Math.floor(Math.abs(b[i]-b[j]));
			     
			 }
			 
		 }
		 System.out.println(sum);

	}

}
