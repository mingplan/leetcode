package leetcode;

import twonumber.ListNode;
public class AddTwoNumbers {

	
	public static void main(String[] args){
		AddTwoNumbers number = new AddTwoNumbers();
		ListNode a1 = new ListNode(9);
		ListNode a2 = new ListNode(9);
		a1.next = a2;
		a2.next = null;
		
		ListNode a3 = new ListNode(1);
		//ListNode a4 = new ListNode(2);
		a3.next = null;
		//a4.next = null;
		
		number.addTwoNumbers(a3, a1);
		
	}
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		ListNode p1 = l1;
		ListNode p2 = l2;
		int carry = 0;
		
		if(p1.val+p2.val+carry>=10){
			p1.val=p1.val+p2.val+carry-10;
			carry = 1;
		}else{
			p1.val=p1.val+p2.val+carry;
			carry = 0;
		}
		
		while(p1.next!=null&&p2.next!=null){
			if(p1.next.val+p2.next.val+carry>=10){
				p1.next.val=p1.next.val+p2.next.val+carry-10;
				carry = 1;
			}else{
				p1.next.val=p1.next.val+p2.next.val+carry;
				carry = 0;
			}
			
			p1=p1.next;
			p2=p2.next;
		}
		
		if(p1.next==null&&p2.next==null){//等长
			if(carry==1){
				ListNode temp = new ListNode(carry);
				temp.next = null;
				p1.next = temp;
			}
			return l1;
		}
		
		if(p1.next==null){//l1短
			ListNode t = p2.next;
			while(p2.next!=null){
				if(p2.next.val+carry>=10){
					p2.next.val = p2.next.val + carry-10;
					carry = 1;
				}else{
					p2.next.val = p2.next.val + carry;
					carry = 0;
					break;
				}
				p2 = p2.next;
			}
			
			//还有进位
			if(p2.next ==null&&carry==1){
				ListNode te = new ListNode(carry);
				te.next = null;
				p2.next = te;
			}
			p1.next = t;
		}
		
		if(p2.next == null){//l2短
			while(p1.next!=null){
				if(p1.next.val+carry>=10){
					p1.next.val = p1.next.val +carry -10;
					carry = 1;
				}else{
					p1.next.val = p1.next.val +carry;
					carry = 0;
					break;
				}
				p1 = p1.next;
			}
			
			if(p1.next==null&&carry==1){
				ListNode te = new ListNode(carry);
				te.next = null;
				p1.next = te;
			}
		}
		
		return l1;
	}
}
