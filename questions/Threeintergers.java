package questions;
/*作者：NotDeep
链接：https://www.nowcoder.com/discuss/76124
来源：牛客网

三个整数


	分析


	设X为最后三个数都变为的数。
所以总共需要的操作次数为(3X - (A + B + C)) / 2。注意到X肯定大于等于A, B, C三个数的最大值, 我们现在要最小化X, 并且两个操作都不改变A + B + C的奇偶性。
设A, B, C的最大值为Ma = max(A, max(B, C))
所以3  Ma与 A + B + C相同奇偶性的话, X = Ma, 否则X = Ma + 1。
然后输出(3Ma - (A + B + C)) / 2即可。*/
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
