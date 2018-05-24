package LinkedList;

//https://www.programcreek.com/2014/04/leetcode-swap-nodes-in-pairs-java/
class SNode{
	
	int data;
	SNode next;
	
	 SNode(int data){
		this.data=data;
		this.next=null;
	}
}

class SLinkedList {
	
	SNode head;
	
	public SLinkedList() {
		head=null;
	}
	
	public void pushNode(int x) {
		//create top of stack 
		
		//create a new node and fill it 
		SNode newNode=new SNode(x);
		//set the next pointer of node to top of the list
		newNode.next=head;
		//set the top of the node.
		head=newNode;
	}
	
	public void deleteTopNode() {
		
		SNode temp = head;
		head=temp.next;
			
	}
	
	public void display(SNode t) {
		
		SNode temp=t;
		while(temp!=null) {
			System.out.print(temp.data+"-->");
			temp=temp.next;
		}
	}
	
	public SNode SwapAdjacentNodes(SNode head) {
		
		SNode h = new SNode(0);
		h.next=head;
		SNode p =h;
		
		while(p.next!=null && p.next.next!=null) {
			SNode t1= p;
			p=p.next;
			t1.next=p.next;
			
			SNode t2=p.next.next;
			p.next.next=p;
			p.next=t2;
		}
		return h.next;
      		
	}
}

public class SwapAdjacentNodes {
	
	public static void main(String[] args) {
		
		SLinkedList l = new SLinkedList();
		l.head= new SNode(1);
		l.head.next= new SNode(2);
		l.head.next.next= new SNode(3);
		l.head.next.next.next=new SNode(4);
		l.display(l.head);
		SNode lm=l.SwapAdjacentNodes(l.head);
		System.out.println();
		l.display(lm);
	}
	

}
