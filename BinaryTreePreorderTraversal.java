package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @description: TODO(描述这个类的作用)
 * @author ming
 * @date 2015年7月8日
 */

public class BinaryTreePreorderTraversal {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public List<Integer> preorderTraversal(TreeNode root) {

		List<Integer> list = new ArrayList<Integer>();
		Stack<TreeNode> stack = new Stack<TreeNode>();
		if(root!=null){
			stack.push(root);
		}else{
			return null;
		}
		TreeNode temp = null;
		TreeNode left = null;
		TreeNode right = null;
		while(!stack.empty()){
			temp = stack.pop();
			list.add(temp.val);
			left = temp.left;
			right = temp.right;
			if(right != null){
				stack.push(right);
			}
			if(left != null){
				stack.push(left);
			}
			
		}
		return list;
	}
}
