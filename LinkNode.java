package leetcode;

/** 
 * @description: 链表
 * @author ming
 * @date 2015年6月9日
 */

public class LinkNode<Item> {

	private Node head;
	private Node dumyHead;
	private class Node{
		private Item item;
		private Node next;
		public Node(Item item,Node node){
			this.item=item;
			this.next=node;
		}
	}
	
	public static void main(String[] args){
		LinkNode<Integer> linknode = new LinkNode<Integer>();
		//linknode.addNode();
		
	}
	public LinkNode(){
		this.head=null;
		this.dumyHead = this.head;
	}
	
	public void addNode(Node node){
		if(isEmpty()){
			this.head =node;
		}else{
			node.next =this.head.next;
			this.head.next = node;
		}
	}
	
	public boolean isEmpty(){
		if(this.head ==null){
			return true;
		}else{
			return false;
		}
	}
	
	public void print(){
		Node node = this.head;
		while(node!=null){
			System.out.print(node.item+"  ");
			node=node.next;
		}
		System.out.println();
	}
}
