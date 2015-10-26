package leetcode;

public class FindMinimuminRotatedSortedArray {

	public static void main(String[] args){
		FindMinimuminRotatedSortedArray array = new FindMinimuminRotatedSortedArray();
		int[] a = {2,3,1};
		System.out.println(array.findMin(a));
	}
	public int findMin(int[] nums) {

		if(nums.length == 1) return nums[0];
		if(nums.length == 2) return nums[0]>nums[1]?nums[1]:nums[0];
		int i=1;
		while((i<nums.length)&&nums[i-1]<nums[i]){
			i++;
		}
		if(i==nums.length){
			return nums[0];
		}else{
			return nums[0]<nums[i]?nums[0]:nums[i];
		}
		
	}
}
