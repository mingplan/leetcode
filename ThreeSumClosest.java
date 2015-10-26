package leetcode;

import java.util.Arrays;

public class ThreeSumClosest {

	public static void main(String[] args) {
		ThreeSumClosest three = new ThreeSumClosest();
		int[] nums = { 1,1,1,0};
		System.out.println(three.threeSumClosest(nums, 1));
	}

	public int threeSumClosest(int[] nums, int target) {
		Arrays.sort(nums);
		int diff = Integer.MAX_VALUE;
		int output = 0;
		for(int i=0;i<nums.length-2;i++){
			int low = i+1;
			int high = nums.length - 1;
			while(low<high){
				int sum = nums[i]+nums[low]+nums[high];
				if(Math.abs(target-sum)<diff){
					diff = Math.abs(target-sum);
					output = sum;
				}
				if(sum>target){
					high--;
				}else{
					low++;
				}
			}
		}
		
		return output;

	}

}
