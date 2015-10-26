package leetcode;

public class BalancedBinaryTree {
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public int treeHight(TreeNode root) {

		if (root == null) {
			return 0;
		} else {
			int left = treeHight(root.left) + 1;
			int right = treeHight(root.right) + 1;
			return left > right ? left : right;
		}
	}

	public boolean isBalanced(TreeNode root) {

		if (root == null) {
			return true;
		} else {
			int ans = treeHight(root.left) - treeHight(root.right);
			if (Math.abs(ans) <= 1) {
				return true && isBalanced(root.left) && isBalanced(root.right);
			} else {
				return false;
			}
		}
	}
}
