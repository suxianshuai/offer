package questions;
/*题目：
把只包含因子2、3和5的数称作丑数（Ugly Number）。例如6、8都是丑数，但14不是，因为它包含因子7。
 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。*/

public class Solution39 {
	
	    public int GetUglyNumber_Solution(int index) {
	        if(index<1){
	            return 0;
	        }
	        int[] array = new int[index];
	        int i2=0;
	        int i3=0;
	        int i5=0;
	        array[0]=1;
	        for(int i =0;i<index-1;i++){
	            int temp = getMin(array[i2]*2,array[i3]*3,array[i5]*5);
	            if(temp==array[i2]*2){
	                i2++;
	            }
	            if(temp==array[i3]*3){
	                i3++;
	            }
	            if(temp==array[i5]*5){
	                i5++;
	            }
	            array[i+1]=temp;
	        }
	        return array[index-1];
	    }

	    public int getMin(int a,int b,int c){
	        int min = a;
	        if(a>b){
	            min=b;
	        }
	        if(min>c){
	            min=c;
	        }
	        return min;
	    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
