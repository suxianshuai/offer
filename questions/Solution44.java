package questions;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

/*
 * 前人作品,思想供参考
 */
public class Solution44{
     
    public static void main(String[] args) {
        System.out.println(permutation("abcd").size());
        ListIterator lit = permutation("abcd").listIterator();
        while(lit.hasNext())
        {
        	System.out.println(lit.next());
        }
    }
     
    private static ArrayList<String> permutation(String str){
        ArrayList<String> list = new ArrayList<>();
        if(str.length() == 1){
        	list.add(str);
            return list;
        } else{
            for (int i = 0; i < str.length(); i++) {
                String s = str.charAt(i) + "";
                String result = "";
                String resultA = result + s;
                String leftS = str.substring(0, i) + str.substring(i + 1, str.length());
                for (String element : permutation(leftS)) {
                    result = resultA + element;
                    if(!list.contains(result))
                    list.add(result);
                }
            }
            return list;
        }
    }
     
}