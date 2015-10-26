package leetcode;

public class SearchinRotatedSortedArray {
	
	public static void main(String[] args){
		int[] a = {3,3,5,6,6,0,1,2};
		SearchinRotatedSortedArray search = new SearchinRotatedSortedArray();
		search.search(a, 6);
		
	}
	public int search(int[] nums, int target) {
		int pt =0;
		while(pt<nums.length-1&&nums[pt]<=nums[pt+1]){
			pt++;
		}
		int ans1=0;
		int ans2 =0;
		if(pt>0&&pt<nums.length-1){
			ans1 = binarySearch(nums,0,pt,target);
		    ans2 = binarySearch(nums,pt+1,nums.length-1,target);
			
		}
		
		if(pt==0){
			if(nums[pt]==target){
				return pt;
			}else{
				ans1 = binarySearch(nums,1,nums.length-1,target);
				return ans1;
			}
		}
		
		if(pt==nums.length-1){
			if(nums[pt]==target){
				return pt;
			}else{
				ans1 = binarySearch(nums,0,nums.length-2,target);
				return ans1;
			}
		}
		int ans =0;
		if(ans1==-1&&ans2==-1){
			ans=-1;
		}else if(ans1!=-1){
			ans = ans1;
		}else if(ans2!=-1){
			ans = ans2;
		}
		return ans;
		
	}
	
	public int binarySearch(int[] nums,int start,int end,int target){//开始和结束都包含
		int l = start;
		int r = end;
		int m = 0;
		
		while(r-l>=1){
			m = l +(r-l)/2;
			if(nums[m]>target){
				r = m;
			}else if(nums[m]<target){
				l = m+1;
			}else if(nums[m]==target){
				return m;
			}
		}
		if(l==r&&nums[l]==target){
			return l;
		}
		return -1;
	}
}
