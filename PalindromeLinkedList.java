package leetcode;

import java.util.Stack;

public class PalindromeLinkedList {

	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public boolean isPalindrome(ListNode head) {

		Stack<Integer> stack = new Stack<Integer>();
		ListNode p = head;
		while(p!=null){
			stack.push(p.val);
			p=p.next;
		}
		p = head;
		boolean flag = true;
		while(p!=null){
			int temp = stack.pop();
			if(temp != p.val){
				flag = false;
				break;
			}
			p = p.next;
		}
		
		return flag;
	}
}
