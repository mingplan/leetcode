package leetcode;

import java.util.ArrayList;
import java.util.List;

import leetcode.BinaryTreePaths.TreeNode;

public class PathSumII {
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public List<List<Integer>> pathSum(TreeNode root, int sum) {
		List<Integer> li = new ArrayList<Integer>();
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		if(root==null) return list;
		dfs(root,li,list,sum);
		return list;
	}

	public void dfs(TreeNode root, List<Integer> li, List<List<Integer>> list,int sum) {

		if (root == null)
			return;
		sum-=root.val;
		li.add(root.val);
		if (root.right == null && root.left == null&&sum==0) {
			list.add(new ArrayList(li));
		}
		dfs(root.left, li, list,sum);

		dfs(root.right, li, list,sum);
		li.remove(li.size()-1);
	}
}
