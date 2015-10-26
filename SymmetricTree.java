package leetcode;

import java.util.Stack;

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

		if (root == null) {
			return true;
		} else {
			Stack<TreeNode> left = new Stack<TreeNode>();
			Stack<TreeNode> right = new Stack<TreeNode>();
			if (root.left != null) {
				left.push(root.left);
			}
			if (root.right != null) {
				right.push(root.right);
			}

			while ((!left.isEmpty()) && (!right.isEmpty())
					&& left.peek().val == right.peek().val) {
				TreeNode tl = left.pop();
				TreeNode tr = right.pop();
				if (left.isEmpty())
					break;
				if (right.isEmpty())
					break;
				if (tl.left != null) {
					left.push(tl.left);
				}
				if (tl.right != null) {
					left.push(tl.right);
				}
				if (tr.left != null) {
					right.push(tr.left);
				}
				if (tr.right != null) {
					right.push(tr.right);
				}

			}

			if (left.isEmpty() && right.isEmpty()) {
				return true;
			} else {
				return false;
			}

		}
	}
}
