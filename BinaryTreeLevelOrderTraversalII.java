package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class BinaryTreeLevelOrderTraversalII {

	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		Queue<TreeNode> qu = new LinkedList<TreeNode>();
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		if (root == null) {
			return list;
		}
		qu.add(root);
		while (!qu.isEmpty()) {
			List<TreeNode> temp = new ArrayList<TreeNode>();
			while (!qu.isEmpty()) {
				TreeNode node = qu.poll();
				temp.add(node);
			}
			List<Integer> a = new ArrayList<Integer>();
			for (TreeNode node : temp) {

				if (node.left != null) {
					qu.add(node.left);
				}
				if (node.right != null) {
					qu.add(node.right);
				}

				a.add(node.val);
			}
			list.add(a);

		}
		int i =0;
		int j = list.size()-1;
		List<Integer> l = null;
		while(i<j){
			l = list.get(i);
			list.set(i, list.get(j));
			list.set(j, l);
			i++;
			j--;
		}
		return list;
	}
}
