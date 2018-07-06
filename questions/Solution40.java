package questions;

import java.util.HashMap;
import java.util.Map;


public class Solution40 {
	

	    public static void main(String[] args){
	        String str = "aaabbBBBBcc";
	        char[] chars = str.toCharArray();
	        Map<Character,Integer> map=mapFun(chars);//存放好之后的map
	        int max=0;
	        for (int i=0;i<str.length();i++){
	            if (max<map.get(chars[i])){
	                max=map.get(chars[i]);
	            }
	        }
	        System.out.print("max = "+max);
	    }

	    public static Map<Character,Integer>  mapFun (char[] chars){
	        Map<Character, Integer> map = new HashMap<Character, Integer>();
	        if (chars != null&& chars.length!=0){
	            for (int i=0;i<chars.length;i++){
	                if (null!=map.get(chars[i])){
	                     map.put(chars[i],map.get(chars[i])+1);
	                }else {
	                    map.put(chars[i],1);
	                }
	            }
	        }
	        return map;
	    }



}
