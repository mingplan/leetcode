package leetcode;

public class JumpGameII {
	
	public static void main(String[] args) {
		JumpGameII jump = new JumpGameII();
		int[] a = {1,2,3};
		System.out.println(jump.jump(a));
	}

	public int jump(int[] nums) {
		if(nums.length == 1) return 0;
		
		int i=0;
		int count = 0;
		while(i<nums.length){
			int max =0;
			int index=0;
			if(nums[i]+i>=nums.length-1){
				count++;
				break;
			}
			for(int j=1;j<=nums[i];j++){
				if(i+j>=nums.length){
					if(count==0){
						return ++count;
					}else{
						return count;
					}
					
				}
				int temp = j+nums[i+j];
				if(max<temp){
					max = temp;
					index = j;
				}
				
			}
			
			i=i+index;
			count++;
		}
		return count;
	}
}
