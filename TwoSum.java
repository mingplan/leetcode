package leetcode;

import java.util.Arrays;

public class TwoSum {

	public static void main(String[] args){
		TwoSum sum = new TwoSum();
		int[] a = {-1,-2,-3,-4,-5};
		sum.twoSum(a,-8);
	}
	public int[] twoSum(int[] nums, int target) {

		
		int[] a = Arrays.copyOfRange(nums, 0, nums.length);
		int[] result = new int[2];
		Arrays.sort(a);
		/*int i=0;
		while(i<a.length&&target>=a[i]){
			i++;
		}
		
		i--;
		if(target == 0){
			i = nums.length-1;
		}*/
		int i = nums.length-1;
		int j=0;
		while(j<i){
			if(a[i]+a[j]>target){
				i--;
			}else if(a[i]+a[j]<target){
				j++;
			}else{
				int time =0;
				for(int k=0;k<nums.length;k++){
					if(a[i]==a[j]){
						if(a[i]==nums[k]){
							result[time++]=k+1;
						}
					}else{
						if(a[j]==nums[k]) 
							result[0]=k+1;
						if(a[i]==nums[k]) 
							result[1]=k+1;
					}
					
				}
				break;
			}
		}
		
		if(result[0]>result[1]){
			int temp =result[0];
			result[0]=result[1];
			result[1]=temp;
		}
		
		return result;
	}
}
