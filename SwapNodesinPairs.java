package leetcode;

import org.junit.*;
public class SwapNodesinPairs {

	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	@Test
	public void test(){
		ListNode o1 = new ListNode(5);
		ListNode o2 = new ListNode(3);
		ListNode o3 = new ListNode(7);
		ListNode o4 = new ListNode(9);
		ListNode o5 = new ListNode(1);
		o1.next = o2;
		o2.next = o3;
		o3.next = o4;
		o4.next = null;
		//o5.next = null;
		swapPairs(o1);
		
	
	}
	
	public ListNode swapPairs(ListNode head) {

		ListNode root = new ListNode(0);
		if(head==null)return head;
		if(head.next!=null){
			root.next = head.next;
		}else{
			return head;
		}
		
		ListNode pre = null;
		ListNode cur = null;
		ListNode last = root;//上一个的最后一个结点
		int count =0;
		while(head!=null){
			count++;
			if(count == 1){
				pre = head;
				head = head.next;
			}
			
			if(count == 2){
				cur = head;
				head = head.next;
				cur.next = pre;
				last.next = cur;
				last = pre;
				count = 0;
			}
			//head = head.next;
			
		}
		if(count==1){
			last.next = pre;
		}else if(count ==0){
			last.next = null;
		}
		
		return root.next;
		
	}

}
