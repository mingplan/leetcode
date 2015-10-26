package leetcode;

public class Searcha2DMatrix {
	public static void main(String[] args){
		int[][] a ={{1,3,5,7},{10,11,16,20},{23,30,34,50}};
		int[][] b ={{1},{3}};
		
		Searcha2DMatrix d = new Searcha2DMatrix();
		
		d.searchMatrix(b, 3);
	}
	public boolean searchMatrix(int[][] matrix, int target) {
		int i =0;
		while(i<matrix.length&&matrix[i][0]<=target){
			i++;
		}
		boolean ans = false;
		if(i>0){
			ans =binarySearch(matrix[i-1],target);
		}
		if(i==0){
			ans =binarySearch(matrix[0],target);
		}
		return ans;
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
