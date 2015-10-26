package leetcode;

import java.util.Arrays;

public class MinimumSizeSubarraySum {

	public static void main(String[] args){
		MinimumSizeSubarraySum sum = new MinimumSizeSubarraySum();
		int[] a = {10,5,13,4,8,4,5,11,14,9,16,10,20,8};
		sum.minSubArrayLen(80, a);
	}
	
	public int minSubArrayLen(int s, int[] nums) {
		if(nums.length==0||nums==null)
			return 0;
		int start =0;
		int end =0;
		int sum =0;
		int min = Integer.MAX_VALUE;
		while(end<nums.length){
			sum+=nums[end];
			while(sum>=s){
				min = Math.min(min, end-start+1);
				sum -=nums[start];
				start++;
			}
			end++;
		}
		return min==Integer.MAX_VALUE?0:min;
	}
	/*public int minSubArrayLen(int s, int[] nums) {
		if(nums.length==0)return 0;
		int[] a = new int[nums.length];
		int tmp =0;
		for(int i=0;i<nums.length;i++){
			a[i]=nums[i];
			tmp+=nums[i];
		}
		if(tmp<s)
		    return 0;
		Arrays.sort(a);
		int index = Arrays.binarySearch(a, s);
		if(index>=0&&index<a.length){
			return 1;
		}
		if(s<a[0]){
			return 1;
		}
		int ans =0;
		if(s>a[a.length-1]){
			int temp = a[a.length-1];
			int i=0;
			while(nums[i]!=temp){
				i++;
			}
			int pl=i-1,pr=i+1;
			int sum = nums[i];
			while(pl>=0&&pr<nums.length&&sum<s){
				sum+=nums[pl];
				pl--;
				if(sum>=s){
					ans = pr-pl-1;
					break;
				}else{
					pl++;
					sum-=nums[pl];
				}
				
				sum+=nums[pr];
				pr++;
				if(sum>=s){
					ans = pr-pl-1;
					break;
				}else{
					sum+=nums[pl];
					pl--;
				}
			}
			if(ans==0){
				ans = Integer.MAX_VALUE-1;
			}
			sum =nums[i];
			int count1 =1;
			pl=i-1;
			while(pl>=0&&sum<s){
				sum+=nums[pl];
				pl--;
				count1++;
			}
			if(count1==1||sum<s){
				count1= Integer.MAX_VALUE-2;
			}
			int count2=1;
			sum = nums[i];
			pr = i+1;
			while(pr<nums.length&&sum<s){
				sum+=nums[pr];
				pr++;
				count2++;
			}
			if(count2==1||sum<s){
				count2=Integer.MAX_VALUE-3;
			}
			int ans1 = count1<count2?count1:count2;
			ans = ans1<ans?ans1:ans;
		}
		if(s>=a[0]&&s<=a[a.length-1]){
			ans = 1;
		}
		return ans;
	}*/
	
}
