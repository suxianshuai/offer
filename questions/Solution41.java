package questions;

import java.util.Scanner;
/*求解一个字符串连续重复字符串*/
public class Solution41 {  
    private static int statLen(String X, int k, int j) {
        int cur_len = 0;

        while(k<X.length() && j<X.length() && X.charAt(k) == X.charAt(j)){
            k++;
            j++;
            cur_len++;
        }
        return cur_len;
    }

    // O(n^3)
    public static int naiveLRS(String x){   
        int maxlen = 0;
        int length = x.length();
        for(int i=0;i<length;i++){
            int len = 0;
            int k = i;//第一个游标 k
            //第二个游标j
            for(int j=i+1;j<length;j++){
                len = statLen(x, k, j);
                if(maxlen<len&&k+len==j){
                    maxlen = len;
                }
            }       
        }
        
        return maxlen;
    }
  
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
    	String str=sc.next();
         
        int result = naiveLRS(str);  
        System.out.println(result*2);   
    }  
}  