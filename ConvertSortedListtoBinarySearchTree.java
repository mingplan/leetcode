package leetcode;

public class ConvertSortedListtoBinarySearchTree {

	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public TreeNode sortedListToBST(ListNode head) {
		if(head==null){
			return null;
		}
		return createNode(head,null);
		
	}
	
	public TreeNode createNode(ListNode start ,ListNode end){
		
		if(start == end){
    	    return null;
    	}
		ListNode fast = start;
		ListNode slow = start;
		while(fast!=end&&fast.next!=end){
			fast = fast.next.next;
			slow = slow.next;
		}
		TreeNode root = new TreeNode(slow.val);
		root.left = createNode(start,slow);
		root.right = createNode(slow.next,end);
		return root;
	}

}
