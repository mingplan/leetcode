package leetcode;



/** 
 * @description: TODO(描述这个类的作用) 
 * @author ming
 * @date 2015年7月5日
 */

public class TestNode {

	public static void main(String[] args){
		RemoveNthNodeFromEndofList list = new RemoveNthNodeFromEndofList();
		ListNode head = new ListNode(1);
		ListNode st = null;
		st=head;
		
		for(int i=2;i<=2;i++){
			
			ListNode temp = new ListNode(i);
		    st.next=temp;
		    st=st.next;
			
		}
		st.next=null;
		ListNode node = list.removeNthFromEnd(head,1);
		while(node!=null){
			System.out.println(node.val);
			node=node.next;
		}
	}
}
