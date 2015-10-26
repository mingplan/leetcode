package leetcode;

import java.util.Arrays;

public class PlusOne {

	public int[] plusOne(int[] digits) {
        int length = digits.length;
        int carry = 0;
        
        int p = length-1;
        while(p>=0&&digits[p]==9){
        	p--;
        }
        //”µ½MÈ«žé9µÄÇé›r
        if(p==-1){
        	digits = new int[length+1];
        	Arrays.fill(digits, 0);
        	digits[0]=1;
        }else{
        	if(digits[length-1]==9){
            	carry = 1;
            	digits[length-1]=0;
            }else{
            	digits[length-1]=digits[length-1]+1;
            }
            
            for(int i=length-2;i>=0;i--){
            	if(digits[i]+carry==10){
            		digits[i]=0;
            		carry =1;
            	}else{
            		if(carry!=0){
            			digits[i]=digits[i]+carry;
            		}
            		carry = 0;
            	}
            }
        	
        }
        
        
        return digits;
    }
}
