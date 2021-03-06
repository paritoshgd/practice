package LinkedListPalindrome;

import Strings.Isomorphic;

//Node for single linked List
class PNode{
		// you can have this as char or int
	int data;
	PNode next;
	
	PNode(int data){
		this.data=data;
		this.next=null;
	}
}

class PList{
	
	PNode head;
	
	
	PList(){
		this.head=null;
	}
	
	public void push(int data) {		
		PNode temp = new PNode(data);
		temp.next=head; 
		head=temp;
	}
	
	public void display() {
				
		 PNode temp = head;
		 while(temp!=null) {
			 System.out.print(temp.data);
			 temp=temp.next;
		 }
	}
	
	public void printNodesReverse(PNode temp1) {
		
		if(temp1.next==null) {
			System.out.print(temp1.data);
			return;
		}
		
		printNodesReverse(temp1.next);
		System.out.print(temp1.data);
		
	}
	
	public void printReverse() {
		PNode temp =this.head;
		printNodesReverse(temp);
	}
	public void reverse() {
	 
		PNode  current= this.head;
		PNode  previousNode=null;
		PNode  nextNode =null;
		
		while(current!=null) {
			
			nextNode=current.next;
			current.next=previousNode;
			previousNode=current;
			current=nextNode;
		}
		this.head=previousNode;
	}
	
public boolean checkPalindrome() {
	
	PNode fast=head;
	PNode slow =head; 
	
	//find the middle of the list
	while(fast.next!=null &&fast.next.next!=null) {
		
		fast=fast.next.next;
		slow=slow.next;
	}
	//Split linked list into two parts first and second
	PNode secondHead= slow.next;
	slow.next=null;  
	
	//reverse the second half of the linked list
	PNode p1=secondHead;
	PNode p2=p1.next;
	
	while(p1!=null &&p2!=null) {
		PNode temp = p2.next;
		p2.next=p1;
		p1=p2;
		p2=temp;
	}
	secondHead.next=null;
	
	//check for equality between the nodes
	PNode p=(p2==null?p1:p2);
	PNode q= head;
	while(p!=null) {
		if(p.data!=q.data)
			return false;
		p=p.next;
		q=q.next;
	}
	return true;
	
	
}
}
public class PalindromeLinkedList {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PList l = new PList();
		l.push(1);
		l.push(2);
		l.push(1);
		//l.push(1);
		l.display();
		System.out.println();
		l.printReverse();
		//l.reverse();
		//l.display();
		System.out.println(l.checkPalindrome());
	}

}
