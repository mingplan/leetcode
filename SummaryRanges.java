package leetcode;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {

	public static void main(String[] args){
		SummaryRanges ranges = new SummaryRanges();
		int[] a = {};
		System.out.println(ranges.summaryRanges(a));
	}
	public List<String> summaryRanges(int[] nums) {

		int i = 0;
		int j = i+1;
		List<String> list = new ArrayList<String>();
		//¿ÕÊı×é
		if(nums.length==0)
			return list;
		while(i<nums.length){
			int start = i;
			while((j<nums.length)&&(nums[j]-nums[i]==1)){
				i++;
				j++;
			}
			if(i>start){
				list.add(nums[start]+"->"+nums[i]);
			}else{
				list.add(Integer.toString(nums[start]));
			}
			i=j;
			j++;
		}
		return list;
	}
}
