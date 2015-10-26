package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {

	public static void main(String[] args){
		int[] a = {1,2,2};
		Subsets set = new Subsets();
		set.subsets(a);
	}
	public List<List<Integer>> subsets(int[] nums) {

		int t = 1<<nums.length;
		List<List<Integer>>  result = new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		for(int i=0;i<t;i++){
			int k = i;
			int j=0;
			List<Integer> temp = new ArrayList<Integer>();
			while(j<nums.length){
				if((k&1)==1){
					temp.add(nums[j]);
				}
				k=k>>1;
				j++;
			}
			//在重复元素时需要这个判断语句
			if(!result.contains(temp)){
				result.add(temp);
			}
			
			
		}
		return result;
	}
}
