package questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/*�ֵ������������ 
���� 
̰�ġ�ÿ��ȡ��ǰʣ���ֵ��������ַ��� 
ʱ�临�Ӷ� 
O(n) */
public class Solution24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     String s = sc.nextLine();
     StringBuilder sf = new StringBuilder();
     ArrayList<String> list=new ArrayList<>();
      for (int i=0;i<s.length();i++)
       list.add(String.valueOf(s.charAt(i)));
      int length =list.size();
      String max =list.get(length-1);
      for(int i=list.size()-1;i>=0;i--)
      {
    	if (list.get(i).compareTo(max)>=0) 
           sf.append(list.get(i));
    	if(list.get(i).compareTo(max)>0)
    	max=list.get(i).compareTo(max)>0?list.get(i):max;
      }
      sf.reverse();
      
     System.out.println(sf.toString());
    	 
     }

	
	}


