package leetcode;

public class FindPeakElement {

	public static void main(String[] args){
		FindPeakElement element = new FindPeakElement();
		int[] a = {1,2,3,1};
		System.out.println(element.findPeakElement(a));
	}
	public int findPeakElement(int[] nums) {

		if(nums.length == 1 ) return 0;
		if(nums[0]>nums[1]) return 0;
		if(nums[nums.length-1]>nums[nums.length-2]) return nums.length-1;
		int result=0;
		for(int i=1;i<nums.length-1;i++){
			if(nums[i]>nums[i-1]&&nums[i]>nums[i+1]){
				result = i;
			}
		}
		return result;
	}
}
