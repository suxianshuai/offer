package questions;

public class Solution2 {

	public String replaceSpace(StringBuffer str ){
 
        StringBuffer sp =  str;
        StringBuffer s =  new StringBuffer();
        int n = sp.length()-1;   
       for(int j =0;j<=n;j++)
        {
        	if(sp.charAt(j)==' ')
        		{s.append("%20");
        	    }
        	 else
            	 s.append(String.valueOf(sp.charAt(j)));
         
        }
      
        String sd =s.toString();
        
        
    return sd;	
    }


}
