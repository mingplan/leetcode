package leetcode;

public class RotateArray {
	
	public static void main(String[] args){
		int a[] = new int[]{-1};
		rotate(a,3);
	}
	
	 public static void rotate(int[] nums, int k) {
		 	if(k>nums.length&&nums.length>1){
		 		k=k%nums.length;
		 	}
		 	if(nums.length==1)
		 		return ;
	        int num[]= new int[k];
	        int i=0;
	        int l=nums.length-k;
	        while(i<k){
	        	num[i]=nums[l+i];
	        	i++;
	        }
	        for(int j=nums.length-1;j>=k;j--){
	        	nums[j]=nums[j-k];
	        }
	        i=0;
	        while(i<k){
	        	nums[i]=num[i];
	        	i++;
	        }
	        
	        for(int j=0;j<nums.length;j++)
	        	System.out.print(nums[j]+"  ");
	        
	    }

}
