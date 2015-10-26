package leetcode;

import java.util.Arrays;

public class ConstructBinaryTreefromInorderandPostorderTraversal {

	public static void main(String[] args){
		ConstructBinaryTreefromInorderandPostorderTraversal construct = 
				new ConstructBinaryTreefromInorderandPostorderTraversal();
		int[] a = {1,2};
		int[] b = {2,1};
		
		construct.buildTree(a, b);
	}
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public TreeNode buildTree(int[] inorder, int[] postorder) {
		
		if(postorder.length==0){
			return null;
		}else{
			int rootvalue = postorder[postorder.length-1];
			TreeNode root = new TreeNode(rootvalue);
			int index = find(inorder,rootvalue);
			
			if(index==0){
				root.left = null;
			}else{
				root.left = buildTree(Arrays.copyOfRange(inorder, 0, index),
						Arrays.copyOfRange(postorder, 0, index));
			}
			
			if(index == inorder.length-1){
				root.right = null;
			}else{
				root.right = buildTree(Arrays.copyOfRange(inorder, index+1, inorder.length),
						Arrays.copyOfRange(postorder, index, postorder.length-1));
			}
			return root;
		}
	}
	
	public int find(int[] a,int target){
		int index = 0;
		for(int i=0;i<a.length;i++){
			if(a[i]==target){
				index = i;
				break;
			}
				
		}
		return index;
	}
}
