package leetcode;

public class SortColors {

	public static void main(String[] args){
		SortColors color = new SortColors();
		int[] nums = {1,1,0,2,0,0,2,0};
		color.sortColors(nums);
		for(int i:nums){
			System.out.print(i+" ");
		}
	}
	public void sortColors(int[] nums) {
		
		int i = 0;
		int j= nums.length-1;
		while(i<j){
			while((i<nums.length)&&nums[i]==0){
				i++;
			}
			while((j>=0)&&nums[j]!=0){
				j--;
			}
			if(i==nums.length){
				break;
			}
			if(j==-1){
				break;
			}
			if(j<i){
				break;
			}
			int temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;
			i++;
			j--;
		}
		
		j=nums.length-1;
		while(i<j){
			while((j>i)&&nums[j]==2){
				j--;
			}
			
			while((i<nums.length)&&nums[i]!=2){
				i++;
			}
			
			if(i==nums.length){
				break;
			}
			if(j==i-1){
				break;
			}
			if(j<i){
				break;
			}
			int temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;
			i++;
			j--;
		}
		
		
		/*int start = 0;
		for(int k=0;k<2;k++){
			int i = start;
			int j= nums.length-1;
			while(i<j){
				while((i<nums.length)&&nums[i]==k){
					i++;
				}
				while((j>=0)&&nums[j]!=k){
					j--;
				}
				if(i==nums.length){
					break;
				}
				if(j==-1){
					break;
				}
				if(j<i){
					break;
				}
				int temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
				i++;
				j--;
				start = i;
			}
		}
		*/
	}
}
