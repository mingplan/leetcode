package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeZigzagLevelOrderTraversal {
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		Queue<TreeNode> qu = new LinkedList<TreeNode>();
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		if (root == null) {
			return list;
		}
		qu.add(root);
		boolean flag = true;
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
			if(!flag){
				int i = 0;
				int j = a.size()-1;
				while(i<j){
					int t = a.get(i);
					a.set(i, a.get(j));
					a.set(j, t);
					i++;
					j--;
				}
			}
			flag = !flag;
			list.add(a);

		}
		return list;
	}
}
