package leetcode;

public class RemoveDuplicatesfromSortedListII {

	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public static void main(String[] args){
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(2);
		a.next = b;
		ListNode c = new ListNode(3);
		
	}
	public ListNode deleteDuplicates(ListNode head) {
		if(head == null) return null;
		ListNode p = head;
		int duplicate = p.val;
		boolean flag = false;
		ListNode root = new ListNode(0);
		ListNode re = root;
		while(p.next!=null){
			if(duplicate == p.next.val){
				p = p.next;
				flag = true;
			}else{
				if(flag){//有重复就不添加进去
					
				}else{//无重复就添加进来
					root.next = p;
					root = root.next;
				}
				duplicate = p.next.val;
				p = p.next;
				flag = false;
			}
		}
		
		return re.next;
	}
}
