package questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
/*���ӣ�https://www.nowcoder.com/questionTerminal/4f4216644b4146da811a79ea6598bda2
��Դ��ţ����

ţţ�ٰ���һ��������Ϸ,��n����Ҳμ������Ϸ,��Ϸ��ʼÿ�����ѡ��һ����,Ȼ�������д��ֽ��(ʮ������,��ǰ׺��),Ȼ�����������ÿһ�����ֽ�����λ���շǵݼ�˳������,�õ��µ���,������ǰ׺�㽫�����ԡ��õ�������ֵ����Ӯ�������Ϸ�� 
��������:
�����������,��һ�а���һ������n(1 �� n �� 50),����ҵ�����
�ڶ���n������x[i](0 �� x[i] �� 100000),��ÿ�����д�µ�������


�������:
���һ������,��ʾӮ����Ϸ���Ǹ���һ�õ���������Ƕ��١�
ʾ��1
����
3
9638 8210 331
���
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
