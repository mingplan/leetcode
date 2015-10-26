package leetcode;

public class DivideTwoIntegers {
	
	public static void main(String[] args){
		int a = Integer.MIN_VALUE;
		int b = -1;
		int c=Integer.MIN_VALUE;
		DivideTwoIntegers integer = new DivideTwoIntegers();
		System.out.println(integer.divide(a, b));
	}

	public int divide(int dividend, int divisor){
		int ans =0;
		if(divisor==0){
			return Integer.MAX_VALUE;
		}
		if(dividend==0){
			return 0;
		}
		if(divisor==1){
			return dividend;
		}
		if(dividend == Integer.MIN_VALUE){
			ans =1;
			dividend+=Math.abs(divisor);
		}
		if(divisor==Integer.MIN_VALUE)
			return ans;
		boolean isNeg = (dividend^divisor)>>>31==1?true:false;//无符号右移，判断结果是否为负
		dividend = Math.abs(dividend);
		divisor = Math.abs(divisor);
		
		int digit =0;
		while(divisor<=(dividend>>1)){
			divisor=divisor<<1;
			digit++;
			/*if(divisor==0){
				break;
			}
			*/
		}
		
	
		/*if(divisor==dividend){
			ans = 1<<digit;
			return ans;
		}else{
			divisor=divisor>>1;
			digit--;
		}*/
		while(digit>=0){
			dividend -=divisor;
			if(dividend>=0){
				ans +=1<<digit;
			}else{
				dividend+=divisor;
			}
			
			divisor=divisor>>1;
			digit--;
		}
		
		if(ans==Integer.MIN_VALUE){
			ans =Integer.MAX_VALUE;
		}
		return isNeg?-ans:ans;
	}
}
