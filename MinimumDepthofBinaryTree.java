package leetcode;

import java.util.ArrayList;
import java.util.List;

import leetcode.PathSumII.TreeNode;

public class MinimumDepthofBinaryTree {
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	 public int minDepth(TreeNode root) {
	        return dfs(root,0);
	    }
	public int dfs(TreeNode root,int level) {
		if(root.left==null&&root.right==null){
			return level+1;
		}
		level++;
		int a=0;
		int b = 0;
		if(root.left!=null){
			a= dfs(root.left,level);
		}
		
		if(root.right!=null){
			b= dfs(root.right,level);
		}
		
		
	    if(a==0||b==0){
	    	return a>b?a:b;
	    }
	    
	    return a<b?a:b;
	}
}
