package leetcode;

public class Searcha2DMatrixII {
	public boolean searchMatrix(int[][] matrix, int target) {
		boolean flag = false;
		for(int i=0;i<matrix.length;i++){
			flag = binarySearch(matrix[i],target);
			if(flag){
				break;
			}
		}
		return flag;
	}
	
	public boolean binarySearch(int[] nums,int target){
		int l =0;
		int r =nums.length;
		int mid =0;
		while(r-l>=1){
			mid = l+(r-l)/2;
			if(nums[mid]>target){
				r = mid;
			}else if(nums[mid]<target){
				l = mid+1;
			}else if(nums[mid]==target){
				return true;
			}
		}
		return false;
	}
}
