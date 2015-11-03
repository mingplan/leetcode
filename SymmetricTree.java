package leetcode;


public class SymmetricTree {
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public boolean isSymmetric(TreeNode root) {

		if(root==null)return true;
		return dfs(root.left,root.right);
	}
	
	public boolean dfs(TreeNode left,TreeNode right){
		if(left==null&&right==null){
			return true;
		}
		if(left==null||right==null){
			return false;
		}
		boolean f1 = left.val==right.val;
		boolean f2 = dfs(left.left,right.right);
		boolean f3 = dfs(left.right,right.left);
		return f1&&f2&&f3;
	}
	
}
