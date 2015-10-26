package leetcode;

public class Pow {

	
	public static void main(String[] args){
		Pow pow = new Pow();
		System.out.println(pow.myPow(1.0,Integer.MIN_VALUE));
	}
	public double myPow(double x, int n) {
		
	       if(n==0)
	        return 1.0;
	       if(n<0){
	    	   if(n==Integer.MIN_VALUE){
	    		   return 1.0/(myPow(x,Integer.MAX_VALUE)*x);
	    	   }else{
	    		   return 1.0/myPow(x,-n);
	    	   }
	           
	       }
	       double result = 1.0;
	       for(;n>0;x*=x,n>>=1){
	           if((n&1)>0){
	               result*=x;
	           }
	       }
	       return result;
	    }
}
