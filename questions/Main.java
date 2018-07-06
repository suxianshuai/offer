package questions;

import java.util.Arrays;

public class Main {  
	  
    public static void main(String[] args) {  
         int[] array = { 5, 7, 6, 9, 11, 10, 8 ,111};  
//      int[] array = { 7, 4, 6, 5 };  
//      int[] array={6,7,8,5};  
        System.out.println(verfiySequenceOfBST(array));  
    }  
  
    public static boolean verfiySequenceOfBST(int[] input) {  
        if(input == null || input.length == 0){  
            return false;  
        }  
        int last = input.length-1;  
        int cut = 0;  
        for(int i = 0;i<input.length-1;i++){  
            if(input[i]>input[last]){  
                break;  
            }  
            cut = i+1;  
        }  
        for(int i = cut;i<input.length-1;i++){  
            if(input[i]<input[last]){  
                return false;  
            }  
        }  
        boolean left = true;  
        boolean right = true;  
        if(cut>0){  
            left = verfiySequenceOfBST(Arrays.copyOfRange(input, 0, cut));  
        }  
        if(cut<input.length-1){  
            right = verfiySequenceOfBST(Arrays.copyOfRange(input,cut,input.length-1));  
        }  
        return left && right;  
    }  
  
}  
