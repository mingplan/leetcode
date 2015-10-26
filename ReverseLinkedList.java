package leetcode;

public class ReverseLinkedList {
	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode reverseList(ListNode head) {

		ListNode root = new ListNode(0);
		ListNode temp = null;
		while(head!=null){
			temp = head;
			head = head.next;
			temp.next = root.next;
			root.next = temp;
		}
		return root.next;
	}
}
