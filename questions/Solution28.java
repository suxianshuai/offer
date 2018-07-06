package questions;

public class Solution28 {


		public static int getIn(int n) {
        long a = (long)Math.pow(n, n);
        return (int)a-n+1;
        }
    public static int getInitial(int n) {
    	
    	if (n==1)
    		return 1;
    	if (n==2)
    		return 3;
    	if (n==3)
    		return 25;
    	else 
    		
    	
		return (getInitial(n-1)*n/(n-1))             ;
        
    }
    public static   int getIniti(int n)
    {
        // write code here     
        int ret;
        for(ret = n + 1; ; ret += n){
            int cnt = 1;
            int tmp = (n-1)*(ret/n);
            while(tmp%n==1){
                cnt++;
                tmp = (n-1)*(tmp/n);
                if(cnt==n) return ret;}
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
  System.out.println(getInitial(5));
  //System.out.println(getIniti(4));
	}

}
