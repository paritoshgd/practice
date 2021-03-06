package LinkedList;

//Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.

//Supposed the linked list is 1 -> 2 -> 3 -> 4 and you are given the third node with value 3, the linked list should become 1 -> 2 -> 4 after calling your function.
//https://leetcode.com/problems/delete-node-in-a-linked-list/description/

class DNode{
	
	int data;
	DNode next;
	
	DNode(int x){
		this.data=x;
		this.next=null;
	}
}

class DList{
	
	DNode head;
	
	DList(){
		this.head=null;
	}
	
	public void push(int x) {
		
		DNode temp = new DNode(x);
		temp.next=head;
		head=temp;
	}
	
	public void deleteNode(DNode nodeToDelete) {
		nodeToDelete.data=nodeToDelete.next.data;
		nodeToDelete.next=nodeToDelete.next.next;
	}
	
	public void display(DNode temp) {
		while(temp!=null) {
			System.out.print(temp.data);
			temp=temp.next;
		}
		
	}
}
public class DeleteNodeWithAccessToThatNode {
	
	public static void main(String[] args) {
		
		DList l = new DList();
		l.head=new DNode(1);
		l.head.next=new DNode(2);
		l.head.next.next= new DNode(3);
		l.head.next.next.next=new DNode(4);
		System.out.println("Before deleting node 3");
		l.display(l.head);
		System.out.println("Before after deleting node 3");
		l.deleteNode(l.head.next.next); //delete node with value 3
		l.display(l.head);
		//delete first node
		l.deleteNode(l.head);
		System.out.println("Delete first node");
		l.display(l.head);
		
	}
	

}
