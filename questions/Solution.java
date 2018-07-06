package questions;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

import java.util.Scanner;
public class Solution {  
    

  
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
    	int n=sc.nextInt();
        LinkedHashSet<Integer> ls = new LinkedHashSet<>();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
         for(int i=0;i<n;i++)
         {
           ls.add(a[i]);  
         }
          System.out.println(ls.size()); 
          Iterator<Integer> it = ls.iterator();
          while(it.hasNext())
        	  System.out.println(it.next());
    }  
}  