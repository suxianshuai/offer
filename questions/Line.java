package questions;

import java.util.Scanner;

public class Line {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 int m=sc.nextInt();
		 int a[][]=new int [m][2];
		 for(int i=0;i<m;i++)
		 {
		a[i][0]= sc.nextInt();
		a[i][1]= sc.nextInt();
		 }
		 Double sum= 0.00;
		 for(int i=1;i<m;i++)
		 {
		sum+=Math.sqrt((a[i][0]-a[i-1][0])*(a[i][0]-a[i-1][0])+(a[i][1]-a[i-1][1])*(a[i][1]-a[i-1][1]));
		 }
		 for(int i=1;i<m;i++)
		 {
	 Double hsum= 0.00; 
		hsum+=Math.sqrt((a[i][0]-a[i-1][0])*(a[i][0]-a[i-1][0])+(a[i][1]-a[i-1][1])*(a[i][1]-a[i-1][1]));
		 if(hsum>sum)
			 break;
		 }
		 
		 
				
	}

}
