package questions;
/*��Ŀ��
��ֻ��������2��3��5��������������Ugly Number��������6��8���ǳ�������14���ǣ���Ϊ����������7��
 ϰ�������ǰ�1�����ǵ�һ���������󰴴�С�����˳��ĵ�N��������*/

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
