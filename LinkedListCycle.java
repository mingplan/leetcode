package leetcode;

/**
 * @description: TODO(描述这个类的作用)
 * @author ming
 * @date 2015年7月8日
 */

public class LinkedListCycle {
	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public boolean hasCycle(ListNode head) {

		ListNode pi = null;
		ListNode pt = null;
		if(head!=null){
			pi = head;
			pt = head;
		}else{
			return false;
		}
		
		while(pt!=null&&pt.next!=null){
			pi = pi.next;
			pt = pt.next.next;
			if(pi == pt){
				return true;
			}
		}
		
		return false;
	}
}
