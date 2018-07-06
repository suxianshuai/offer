package questions;

import java.util.Scanner;

/*
配糖果    多重背包，首先将需要取得Li放入盒子中，假设所有的Li的和为least，那么我们还需要对盒子添加m-least个糖果。
我们假设 avaliable[i] = r[i] - l[i];表示在已经对盒子放入各种最小糖果的情况下，还能继续添加的糖果数。  
此时问题就变的简单了，在容量为m-least的背包中，我们可以选择放入的物品的容量为avaliable[i]，请问有多少种装满背包的情况？   
这就是一个多重背包的问题。*/
public class Solution25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int m= sc.nextInt();
        int []l=new int[n];
        int []r =new int[n];
        int least =0;
        int [] avaliable = new int[n];
        for (int i=0;i<r.length;i++)
        {
        	 
        }

	}

}
