package leetcode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public List<String> binaryTreePaths(TreeNode root) {
		List<String> list = new ArrayList<String>();
		if (root == null) {
			return list;
		}
		dfs(root, "", list);
		return list;
	}

	public void dfs(TreeNode root, String str, List<String> list) {

		if (root == null)
			return;

		if (root.right == null && root.left == null) {
			if (str == "") {
				str = new Integer(root.val).toString();
				list.add(str);
			} else {
				str = str + "->" + root.val;
				list.add(str.substring(2));
			}
		}
		dfs(root.left, str + "->" + root.val, list);

		dfs(root.right, str + "->" + root.val, list);

	}
}
