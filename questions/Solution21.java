package questions;

import java.util.*;

public class Solution21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String d=sc.nextLine();
		int Len =d.length();
		int i;
		for( i=1;i<=Len;i++)
		{HashSet<String> set =  new HashSet<>();
			for(int j=0;j<Len-i;j++) 
			{
				System.out.println(d.substring(j,j+i));
				set.add(d.substring(j, j+i));
				
					
			}
			if(set.size()<Math.pow(4, i))
				break;
		}
		System.out.println(i);

	}

}
