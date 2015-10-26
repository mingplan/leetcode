package leetcode;

import org.junit.Test;

public class InsertionSortList {
	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
	
	@Test
	public void test(){
		ListNode a1 = new ListNode(3);
		ListNode a2 = new ListNode(1);
		ListNode a3 = new ListNode(4);
		ListNode a4 = new ListNode(2);
		ListNode a5 = new ListNode(5);
		ListNode a6 = new ListNode(6);
		a1.next = a2;
		a2.next = a3;
		a3.next = a4;
		a4.next = a5;
		a5.next = a6;
		a6.next = null;
		insertionSortList(a1);
	}
	public ListNode insertionSortList(ListNode head) {
		ListNode root = new ListNode(0);
		root.next = head;
		ListNode pt = root.next;
		if(pt.next!=null){
			ListNode temp = pt.next;
			pt = pt.next.next;
			pt=temp;
		}else{
			return root.next;
		}
		while(pt!=null){
			ListNode p = root.next;
			ListNode last = root;
			while(p.val<pt.val){
				last = p;
				p = p.next;
			}
			ListNode temp = pt.next;
			pt.next = last.next;
			last.next = pt;
			
			pt = pt.next.next;
			pt=temp;
		}
		return root.next;
	}
}
