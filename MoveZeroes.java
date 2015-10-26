package leetcode;

public class MoveZeroes {

	public static void main(String[] args){
		int[] a = {0,1,0,3,12,0};
		MoveZeroes move = new MoveZeroes();
		move.moveZeroes(a);
	}
	public void moveZeroes(int[] nums) {
		int count=0;
		int i=0;
		while(i<nums.length){
			if(nums[i]==0){
				count++;
				for(int j=i;j<nums.length-1;j++){
					nums[j]=nums[j+1];
				}
				nums[nums.length-1]=0;
			}else{
				i++;
			}
			if(i+count==nums.length)
				break;
		}
		
	}
}
