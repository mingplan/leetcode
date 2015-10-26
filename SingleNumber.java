package leetcode;

import java.util.HashMap;
import java.util.Set;

public class SingleNumber {

	public static void main(String[] args){
		
	}
	
	public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
        	if(map.get(nums[i])==null){
        		map.put(nums[i], 1);
        	}else{
        		map.remove(nums[i]);
        	}
        }
        Set<Integer> set = map.keySet();
        return (Integer)set.toArray()[0];
    }
}
