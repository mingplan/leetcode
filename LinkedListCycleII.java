package leetcode;

import leetcode.ReverseNodesinkGroup.ListNode;

import org.junit.*;

public class LinkedListCycleII {

	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	@Test
	public void test() {
		ListNode o1 = new ListNode(5);
		ListNode o2 = new ListNode(3);
		ListNode o3 = new ListNode(7);
		ListNode o4 = new ListNode(9);
		ListNode o5 = new ListNode(1);
		o1.next = o2;
		o2.next = o3;
		o3.next = o4;
		o4.next = o5;
		o5.next = o1;
		detectCycle(o1);

	}
	
	public ListNode detectCycle(ListNode head) {
		ListNode p1 = head;
		ListNode p2 = head;
		if(p2.next!=null)
			p2 = p2.next;
		if(p2.next!=null)
			p2 = p2.next;
		else
			return null;
		while (p1 != null && p2 != null) {
			if (p1 != p2) {
				p1 = p1.next;
				p2 = p2.next;
				if(p2!=null){
					p2 = p2.next;
				}else{
					break;
				}
				
			} else {
				return p1;
			}

		}
		return null;
	}
}
