package leetcode;


public class ConvertSortedArraytoBinarySearchTree {

	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public TreeNode sortedArrayToBST(int[] nums) {
		
		if(nums.length==0){
			return null;
		}
		return createNode(nums,0,nums.length-1);
		
	}
	public TreeNode createNode(int[] nums,int start,int end){
		if(end<start){
			return null;
		}
		int i = start+(end-start)/2;
		TreeNode root = new TreeNode(nums[i]);
		root.left = createNode(nums,start,i-1);
		root.right = createNode(nums,i+1,end);
		return root;
	}
}
