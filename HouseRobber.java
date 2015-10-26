package leetcode;

/** 
 * @description: TODO(描述这个类的作用) 
 * @author ming
 * @date 2015年10月12日
 */

public class HouseRobber {

	 public int rob(int[] num) {
	        
		 	int[] max = new int[num.length];
		 	for(int i =0 ;i<max.length;i++)
		 		max[i]=0;
	        if(num.length==0)
	            return 0;
	        else if(num.length==1){
	            return num[0];
	        }else if(num.length==2){
	            if(num[0]>num[1])
	                return num[0];
	            else 
	                return num[1];
	            
	        }else{
	        	max[0]=num[0];
	        	max[1]=Math.max(num[0],num[1]);
	        	//max[2]=Math.max(max[0]+num[1], max[1]);
	        	for(int i=2;i<num.length;i++){
	        		max[i]=Math.max(max[i-2]+num[i], max[i-1]);
	        	}
	        	return max[max.length-1];
	        }
	            
	    }
}
