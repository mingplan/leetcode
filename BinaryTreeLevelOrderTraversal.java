package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {

	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public List<List<Integer>> levelOrder(TreeNode root) {
		Queue<TreeNode> qu = new LinkedList<TreeNode>();
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		if(root==null){
			return list;
		}
		qu.add(root);
		while(!qu.isEmpty()){
			List<TreeNode> temp = new ArrayList<TreeNode>();
			while(!qu.isEmpty()){
				TreeNode node = qu.poll();
				temp.add(node);
			}
			List<Integer> a = new ArrayList<Integer>();
			for(TreeNode node:temp){
			
				if(node.left!=null){
					qu.add(node.left);
				}
				if(node.right!=null){
					qu.add(node.right);
				}
				
				a.add(node.val);
			}
			list.add(a);
			
		}
		return list;
	}
}
