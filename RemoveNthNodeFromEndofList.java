package leetcode;


public class RemoveNthNodeFromEndofList {
	
	

	public  ListNode removeNthFromEnd(ListNode head, int n) {
	   if(head.next ==null && n==1){
		   return null;
	   }
	   if(n!=1){
		   n++;
	   }
       ListNode pi = null;
       ListNode pt = null;
       pt = head;
       int count = 0;
       //head做实际的数据节点
       boolean flag = false;
       while(pt!=null){
    	   count++;
    	   pt = pt.next;
    	   if(count == n){
    		   pi = head;
    		   flag = true;
    		   break;
    	   }
       }
       
       while(pt!=null){
    	   pt = pt.next;
    	   pi =  pi.next;
    	   
       }
      if(pi==null){
    	   head=head.next;
    	   return head;
       }
       if(pi.next!=null){
    	   if(pi.next.next!=null){
    		   pi.next = pi.next.next;
    	   }else{
    		   pi.next = null;
    	   }
       }else if(n==1){
    	   //head =null;
       }
       
       return head;
       
    }
	

}
