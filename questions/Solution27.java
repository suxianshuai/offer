package questions;

public class Solution27 {
	public static double sum(float h)
	{double sum=h;
	   h=h/2;
		while(h>0)
		{
		sum=sum+2*h;	
		h=h/2;
		}
		return sum;
	}
	public static int calcDistance(int A, int B, int C, int D) {
		double c =sum(A)+sum(B)+sum(C)+sum(D);
		double d =Math.ceil(c);
		return (int)d;
        // write code here
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A=100;
		int B=90;
		int C=80;
		int D=70;
		int Sum=calcDistance(A,B,C,D);
		System.out.println(Sum);

	}

}
