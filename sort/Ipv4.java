package sort;

public class Ipv4 {
	public static boolean Isipv4(String ipv4){  
	    if(ipv4==null || ipv4.length()==0){  
	        return false;//�ַ���Ϊ�ջ��߿մ�  
	    }  
	    String[] parts=ipv4.split("//.");//��Ϊjava doc���Ѿ�˵��, split�Ĳ�����reg, ��������ʽ, �����"|"�ָ�, ����ʹ��"\\|"  
	    if(parts.length!=4){  
	        return false;//�ָ����������Ͳ���4������  
	    }  
	    for(int i=0;i<parts.length;i++){  
	        try{  
	        int n=Integer.parseInt(parts[i]);  
	        if(n<0 || n>255){  
	            return false;//���ֲ�����ȷ��Χ��  
	        }  
	        }catch (NumberFormatException e) {  
	            return false;//ת�����ֲ���ȷ  
	        }  
	    }  
	    return true;  
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1  = "255.255.255.2";
    System.out.println(Isipv4(s1));
	}

}
