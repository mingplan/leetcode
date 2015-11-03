package leetcode;

/**
 * @description: TODO(描述这个类的作用)
 * @author ming
 * @date 2015年7月21日
 */

public class RemoveDuplicatesfromSortedArray {

	public int removeDuplicates(int[] nums) {

		if(nums.length==0||nums.length==1){
			return nums.length;
		}
		int j=0;
		int ans = nums.length;
		int i=1;
		while(i<ans){
			if(nums[j]==nums[i]){//两元素相等
				ans--;
				
				for(int k = i;k<nums.length-1;k++){
					nums[k]=nums[k+1];
				}
			}else{
				j++;
				i++;
			}
		}
		
		return ans;
	}
}
