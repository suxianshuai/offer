 package questions;

import java.util.Scanner;

/*һ�������������ַ��������������:
1�����ַ����������ġ�
2�����s���������ַ�������ô(s)Ҳ�������ġ�
3�����s��t���������ַ��������������������γɵ�stҲ�������ġ�
���磬"(()())", ""��"(())()"�������������ַ�����"())(", "()(" �� ")"�ǲ������������ַ�����
ţţ��һ�������ַ���s,������Ҫ����������λ�þ����ٵ��������,����ת��Ϊһ�������������ַ���������ţţ������Ҫ��Ӷ��ٸ����š�*/
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
