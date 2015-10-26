package leetcode;

import leetcode.SwapNodesinPairs.ListNode;

import org.junit.Test;

public class ReverseNodesinkGroup {

	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
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
		o5.next = null;
		reverseKGroup(o1, 3);

	}

	public ListNode reverseKGroup(ListNode head, int k) {
		ListNode root = new ListNode(0);
		if(head==null)return head;
		
		ListNode[] list = new ListNode[k+1];
		ListNode last = root;//上一个的最后一个结点
		int count =0;
		int time =0;
		while(head!=null){
			count++;
			if(count<k){
				list[count]=head;
				head = head.next;
			}else if(count ==k){
				list[count]=head;
				head = head.next;
				for(int i=k;i>0;i--){
					list[i].next = list[i-1];
				}
				last.next = list[k];
				last = list[1];
				count =0;
				time++;
				if(time==1){
					root.next = list[k];
				}
			}
			
		}
		if(count!=0){
			last.next = list[1];
		}else if(count ==0){
			last.next = null;
		}
		
		return root.next;
	}
}
