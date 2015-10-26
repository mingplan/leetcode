package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementII {

	public List<Integer> majorityElement(int[] nums) {

		
		int n = nums.length;
		
		int c1 =0;
		int c2 = 0;
	
		Integer m1=null;
		Integer m2 = null;
		
		for(int i=0;i<n;i++){
			if(m1!=null&&nums[i]==m1){c1++;}
			else if(m2!=null&&nums[i]==m2){c2++;}
			else if(c1==0){m1=nums[i];c1=1;}
			else if(c2==0){m2=nums[i];c2=1;}
			else{c1--;c2--;}
		}
		
		c1=0;
		c2=0;
		
		for(int i=0;i<n;i++){
			if(m1!=null&&nums[i]==m1) c1++;
			if(m2!=null&&nums[i]==m2) c2++;
		}
		
		List<Integer> list = new ArrayList<>();
		if(c1>n/3)list.add(m1);
		if(c2>n/3)list.add(m2);
		
		return list;
	}
}
