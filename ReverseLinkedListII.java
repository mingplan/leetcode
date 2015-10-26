package leetcode;

/**
 * @description: TODO(描述这个类的作用)
 * @author ming
 * @date 2015年7月17日
 */

public class ReverseLinkedListII {
	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode reverseBetween(ListNode head, int m, int n) {
		ListNode root = new ListNode(0);
		root.next = head;
		if (head == null||m==n)
			return head;
		ListNode pt = null;
		ListNode pi = null;
		pt = root;
		ListNode fakeHead = new ListNode(0);
		ListNode phead = null;
		ListNode ptail = null;
		int i = 0;
		while (pt != null) {
			i++;
			boolean flag = true;
			if (i == m) {
				phead = pt;
				
			}else if(i==m+1){
				pi = pt;
				pt = pi.next;
				ptail=pi;
				pi.next=fakeHead.next;
				fakeHead.next = pi;
				flag = false;
			}else if (m+1 < i && i < n + 1) {
				pi = pt;
				pt = pi.next;
				pi.next=fakeHead.next;
				fakeHead.next = pi;
				flag = false;
			}else if(i==n+1){
				pi = pt;
				pt = pi.next;
				pi.next=fakeHead.next;
				fakeHead.next = pi;
				ptail.next = pt;
				phead.next = fakeHead.next;
				break;
				//return root.next;
			}
			
			if(flag==true){
				pt = pt.next;
			}
		}
		return root.next;
	}
}
