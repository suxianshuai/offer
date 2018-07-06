package questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
/*链接：https://www.nowcoder.com/questionTerminal/4f4216644b4146da811a79ea6598bda2
来源：牛客网

牛牛举办了一场数字游戏,有n个玩家参加这个游戏,游戏开始每个玩家选定一个数,然后将这个数写在纸上(十进制数,无前缀零),然后接下来对于每一个数字将其数位按照非递减顺序排列,得到新的数,新数的前缀零将被忽略。得到最大数字的玩家赢得这个游戏。 
输入描述:
输入包括两行,第一行包括一个整数n(1 ≤ n ≤ 50),即玩家的人数
第二行n个整数x[i](0 ≤ x[i] ≤ 100000),即每个玩家写下的整数。


输出描述:
输出一个整数,表示赢得游戏的那个玩家获得的最大数字是多少。
示例1
输入
3
9638 8210 331
输出
3689*/
public class Maxnumber {
	 
		 static int getReverse(int x) {
		 List<Integer> temp = new ArrayList<Integer>();
		while (x != 0) {
		 temp.add(x%10);
		x /= 10;
	       }
		 Collections.sort(temp);
	     StringBuffer sb = new StringBuffer();
		 for (int i = 0; i < temp.size(); i++) {
		 sb.append(temp.get(i));
	      }
	     return Integer.parseInt(sb.toString());
		}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int num = Integer.parseInt(sc.nextLine());
		String input = sc.nextLine();
		int [] list = new int[num];
		for (int i=0;i<num;i++)
		{
			char []a =input.split(" ")[i].toCharArray();
			Arrays.sort(a);
			list[i]=Integer.parseInt(new String(a));
		}
		int max=list[0];
		for (int i=1;i<list.length;i++)
		{
			max=max>list[i]?max:list[i];
		}
		System.out.println(max);

	}

}
