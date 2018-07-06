 package questions;

import java.util.Scanner;

/*一个完整的括号字符串定义规则如下:
1、空字符串是完整的。
2、如果s是完整的字符串，那么(s)也是完整的。
3、如果s和t是完整的字符串，将它们连接起来形成的st也是完整的。
例如，"(()())", ""和"(())()"是完整的括号字符串，"())(", "()(" 和 ")"是不完整的括号字符串。
牛牛有一个括号字符串s,现在需要在其中任意位置尽量少地添加括号,将其转化为一个完整的括号字符串。请问牛牛至少需要添加多少个括号。*/
public class Bracketsadd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s= sc.nextLine();
		int l=s.length();
		
		int Count=0;
		int right =0;
		char[]c=new char[l];
		
	    c= s.toCharArray();
		
		for(int i=0;i<l;i++)
		{
			//if(s.charAt(i)=='(')
			if( c[i]=='(')
				Count++;
			else if( c[i]==')'&&Count>0)
				Count--;
			else
				right++;
				
			
		}
		System.out.println(Count+right);
		

		/*
			int count = 0, n=0;
		  for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) == '('){
			count++;
			}
		    if(s.charAt(i) == ')') {
			if(count == 0){
			n++;
			}else{
			count--;
                 }
             }
		}
		System.out.println(count+n);*/
		}

}
