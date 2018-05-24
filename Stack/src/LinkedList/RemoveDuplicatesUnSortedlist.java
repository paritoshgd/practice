package LinkedList;

import java.util.HashSet;
import java.util.Set;

class RMNode{
	
	int data;
	RMNode next;
	
	RMNode(int x){
		this.data= x;
		this.next=null;
	}
	
}

class RMList{
	
	RMNode head;
	
	RMList(){
		this.head=null;
	}
	
	public void push(int data) {
		RMNode temp = new RMNode(data);
		temp.next=this.head;
		this.head=temp;
	}
	
	public RMNode findDuplicates(RMNode node) {
		
		Set<Integer>listSet = new HashSet<Integer>();
		RMNode prev= null;
		RMNode current = node;
	    while(current!=null) {
	    	
	    	int val = current.data;
	    	if(listSet.contains(val)) {
	    		prev.next=current.next;
	    	}
	    	else {
	    		listSet.add(val);
	    		prev=current;
	    	}
	    	current=current.next;
	    }
		
		return this.head;
	}
	
	public void display(RMNode node) {
		while(node!=null) {
			System.out.print(node.data+"->");
			node=node.next;
		}
	}
}
public class RemoveDuplicatesUnSortedlist {
	public static void main(String[] args) {
	RMList l = new RMList();
	l.head= new RMNode(1);
	l.head.next= new RMNode(2);
	l.head.next.next=new RMNode(2);
	l.head.next.next.next=new RMNode(3);
	System.out.println("Before removing duplicates");
	l.display(l.head);
	System.out.println();
	System.out.println("After removing duplicates");
	l.findDuplicates(l.head);
	l.display(l.head);
	}

}
