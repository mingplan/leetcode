package leetcode;

public class SearchInsertPosition {

	public static void main(String[] args){
		int[] a = {1,3};
		
		SearchInsertPosition search = new SearchInsertPosition();
		
		search.searchInsert(a, 2);
	}
	public int searchInsert(int[] nums, int target) {
		int l=0;
		int r=nums.length;
		int mid =0;
		boolean flag = false;
		int ans = 0;
		while(r-l>=1){
			mid = l +(r-l)/2;
			if(nums[mid]>target){
				r = mid;
			}else if(nums[mid]<target){
				l=mid+1;
			}else if(nums[mid]==target){
				flag = true;
				ans = mid;
				break;
			}
		}
		if(!flag){
			if(target>nums[nums.length-1]){
				return nums.length;
			}
			
			if(target<nums[0]){
				return  0;
			}
			int i =0;
			while(nums[i]<target){
				i++;
			}
			ans = i;
			
		}
		
		return ans;
		
	}
	
}
