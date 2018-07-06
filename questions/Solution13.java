package questions;

public class Solution13 {
	 public double Power(double base, int exponent) {
//	        double t =1.0;
//	        if (exponent == 0)
//	          return 1.0;
//	          else if(exponent>0)
//	        { for(int i=1;i<=exponent;i++)
//	            t=t*base;
//	        
//	         return t;
//	        }
//	             else
//	            { for(int i=1;i<=-exponent;i++)
//	                t=t*base;
//	            }
//	        return 1/t;
		 if(exponent==0)
			 return 1;
		 if(exponent==1)
			 return base;
		 if(exponent>0)
		 { double result = Power(base,exponent>>1);
		 result = result*result;
		 if((exponent &0x1)==1)
			 result *=base;
		 return result;
		 }
		 else
		 { double result = Power(base,-exponent>>1);
		 result = result*result;
		 if((-exponent &0x1)==1)
			 result *=base;
		 return 1/result;
		 }
			 

}
}