package questions;
/*���ߣ�NotDeep
���ӣ�https://www.nowcoder.com/discuss/76124
��Դ��ţ����

��������


	����


	��XΪ�������������Ϊ������
�����ܹ���Ҫ�Ĳ�������Ϊ(3X - (A + B + C)) / 2��ע�⵽X�϶����ڵ���A, B, C�����������ֵ, ��������Ҫ��С��X, �����������������ı�A + B + C����ż�ԡ�
��A, B, C�����ֵΪMa = max(A, max(B, C))
����3  Ma�� A + B + C��ͬ��ż�ԵĻ�, X = Ma, ����X = Ma + 1��
Ȼ�����(3Ma - (A + B + C)) / 2���ɡ�*/
import java.util.Arrays;
import java.util.Scanner;

public class Threeintergers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a=new int[3];
		Scanner sc = new Scanner(System.in );
		a[0]=sc.nextInt();
		a[1]=sc.nextInt();
		a[2]=sc.nextInt();
		Arrays.sort(a);
		int b =a[2]-a[1]+a[2]-a[0];
		if((a[2]-a[1]+a[2]-a[0])%2==0)
			System.out.println(b/2);
		else 
			System.out.println((3+b)/2);
	}

}
