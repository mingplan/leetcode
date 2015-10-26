package leetcode;

import java.util.Arrays;


public class ConstructBinaryTreefromPreorderandInorderTraversal {

	public static void main(String[] args){
		int[] pre = {1,2};
		int[] in = {2,1};
		ConstructBinaryTreefromPreorderandInorderTraversal construct = new ConstructBinaryTreefromPreorderandInorderTraversal();
		construct.buildTree(pre, in);
	}
	public class TreeNode {
		      int val;
		     TreeNode left;
		      TreeNode right;
		     TreeNode(int x) { val = x; }
		 }
	public TreeNode buildTree(int[] preorder, int[] inorder) {
		
		if(preorder.length==0){
			return null;
		}else{
			TreeNode root = new TreeNode(preorder[0]);
			int index = findIndex(inorder,preorder[0]);
			//int index = Arrays.binarySearch(inorder, preorder[0]);
			if(index==0){
				root.left = null;
			}else{
				root.left = buildTree(Arrays.copyOfRange(preorder, 1, 1+index>=preorder.length?preorder.length:1+index),
						Arrays.copyOfRange(inorder,0 ,index));
			}
			
			if(index == inorder.length-1){
				root.right = null;
			}else{
				root.right =buildTree(Arrays.copyOfRange(preorder, 1+index,preorder.length),
						Arrays.copyOfRange(inorder, index+1, inorder.length));
			}
			
			return root;
		}
		
	}
	public int findIndex(int[] nums,int target){
		int i = 0;
		while(i<nums.length){
			if(nums[i]==target){
				break;
			}
			i++;
		}
		return i;
	}
}
