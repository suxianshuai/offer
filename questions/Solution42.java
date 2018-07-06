package questions;
/*Ҫ���������ַ�����������Ӵ����硰abcdefg���͡�adefgwgeweg����������Ӵ�Ϊ��defg�����Ӵ������������ģ�*/
public class Solution42{  
    
    // ��������ַ��ŵ�������Ӵ�  
    public static String maxSubstring(String strOne, String strTwo){  
        // �������  
        if(strOne==null || strTwo == null){  
            return null;  
        }  
        if(strOne.equals("") || strTwo.equals("")){  
            return null;  
        }  
        // �����нϳ����ַ���  
        String max = "";  
        // �����н϶̵��ַ���  
        String min = "";  
        if(strOne.length() < strTwo.length()){  
            max = strTwo;  
            min = strOne;  
        } else{  
            max = strTwo;  
            min = strOne;  
        }  
        String current = "";  
        // �����϶̵��ַ����������μ��ٶ��ַ������ַ��������жϳ��ַ��Ƿ�������Ӵ�  
        for(int i=0; i<min.length(); i++){  
            for(int begin=0, end=min.length()-i; end<=min.length(); begin++, end++){  
                current = min.substring(begin, end);  
                if(max.contains(current)){  
                    return current;  
                }  
            }  
        }  
        return null;  
    }  
      
    public static void main(String[] args) {  
        String strOne = "abcdefg";  
        String strTwo = "adefgwgeweg";  
        String result = Solution42.maxSubstring(strOne, strTwo);  
        System.out.println(result);  
    }  
}  
