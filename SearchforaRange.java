package leetcode;

public class SearchforaRange {

	public static void main(String[] args){
		int[] a = {3,4,4,7,7,9};
		int target =7;
		SearchforaRange range = new SearchforaRange();
		range.searchRange(a, target);
	}
	public int[] searchRange(int[] nums, int target) {
		int[] ans = {-1,-1};
		int low =0;
		int high = nums.length;
		int mid = 0;
		boolean flag = false;
		while(high-low>=1){
			mid = low + (high-low)/2;
			if(nums[mid]<target){
				low = mid +1;
			}else if(nums[mid]>target){
				high = mid;
			}else if(nums[mid] ==target){
				flag = true;
				break;
			}
		}
		
		if(flag){
			int i=mid;
			int j=mid;
			while(i>=0&&nums[i]==target){
				i--;
			}
			ans[0]=i+1;
			while(j<nums.length&&nums[j]==target){
				j++;
			}
			ans[1]=j-1;
		}
		return ans;
	}
}
