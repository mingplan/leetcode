package leetcode;


public class TestA{

    public static void main(String[] args) {
       ListNode list = new ListNode();
       Node node = new Node(19,null);
       list.addNode(node);
       Node node1 = new Node(10,null);
       list.addNode(node1);
       Node node2 = new Node(11,null);
       list.addNode(node2);
       list.printNode();
       list.reverse();
       list.printNode();
       
    }

}

class Node{
	int value;
	Node next;
	public Node(int value,Node next){
		this.value = value;
		this.next = next;
	}
}

class ListNode{
	Node head;
	Node current;
	int length;
	public ListNode(){
		this.head=null;
		this.length=0;
		this.current = null;
	}
	
	public boolean addNode(Node node){
		
		if(this.head==null){
			this.head=node;
			this.length = this.length+1;
			this.current = node;
			return true;
		}else{
			current.next = node;
			current = node;
			this.length = this.length + 1;
			return true;
		}
		
	}
	
	public void printNode(){
		Node head;
		head = this.head;
		while(head != null){
			System.out.println(head.value);
			head = head.next;
		}
	}
	
	public void reverse(){
		Node head=this.head.next;
		this.head.next=null;
		Node pr = this.head;
		Node temp = null;
		while(head!=null){
			System.out.println("当前节点  "+head.value);
			System.out.println("上一个节点"+pr.value);
			
			temp = head.next;
			
			head.next = pr;
			pr = head;
			head = temp;
		}
		this.head = pr;
	}
}


