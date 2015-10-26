package leetcode;

public class MergeTwoSortedLists {

	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

		ListNode p1 = null;
		ListNode p2 = null;
		ListNode head = new ListNode(0);
		ListNode root = head;
		p1 = l1;
		p2 = l2;
		while(p1!=null&&p2!=null){
			if(p1.val<p2.val){
				head.next = p1;
				head = head.next;
				p1 = p1.next;
				
			}else{
				head.next = p2;
				head = head.next;
				p2 = p2.next;
				
			}
		}
		
		while(p1!=null){
			head.next = p1;
			head = head.next;
			p1 = p1.next;
		}
		
		while(p2 !=null){
			head.next = p2;
			head = head.next;
			p2 = p2.next;
		}
		
		head.next = null;
		return root.next;
	}
}
