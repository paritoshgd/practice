package LinkedList;

class OCNode{
	
	int data;
	OCNode next;
	
	OCNode(int x){
		this.data=x;
		this.next=null;
	}
}

class OCList{
	
	OCNode head;
	
	OCList(){
		this.head=null;
	}
	
	public void push(int x) {
		
		OCNode temp = new OCNode(x);
		temp.next=head;
		head=temp;
	}
	
	public void display(OCNode head2) {
		
		while(head2!=null) {
			System.out.print(head2.data);
			head2 = head2.next;
		}
	}
	
	public void groupOddEvenNodes() {
		
		OCNode oddNode= this.head;
		OCNode evenNode = this.head.next;
		OCNode connectNode= this.head.next ; // this node stores the first pointer from odd to even will be used once shuffle is done
		
		while(oddNode!=null&&evenNode!=null&&evenNode.next!=null) {
			
			oddNode.next=evenNode.next;// Connect to next odd node
			oddNode=oddNode.next; //Move odd pointer 
			
			evenNode.next=oddNode.next; //connect to next even node
			evenNode=evenNode.next;			 // move even pointer
		}
		oddNode.next=connectNode;
		
	}
}
public class OddEvenLinkedList {

	public static void main(String[] args) {
	 OCList l = new OCList();
	 l.head=new OCNode(1);
	 l.head.next=new OCNode(2);
	 l.head.next.next=new OCNode(3);
	 l.display(l.head);
	 System.out.println();
	 l.groupOddEvenNodes();
	 l.display(l.head);
	 
	 
	 
}
}
