package LinkedList;

//Remove all elements from a linked list of integers that have value val.

class RCNode{
	
	int data;
	RCNode next;
	
	RCNode(int x){
		this.data=x;
		this.next=null;
	}
}

class RCList{
	
	RCNode head;
	
	RCList(){
		this.head=null;
	}
	
	public void push(int x) {
		RCNode temp = new RCNode(x);
		temp.next=head;
		head=temp;
	}
	
	public void display(RCNode temp) {
		while(temp!=null) {
			System.out.print(temp.data+"-->");
			temp = temp.next;
		}
	}
	
	public RCNode removeElements(RCNode node,int val) {
		
		RCNode helper = new RCNode(0); // Create a helper node 
		helper.next = node; // ideally we will pass the head  
		RCNode p=helper ; //pointer to helper node . 
		
		while(p.next!=null) {
			
			if(p.next.data==val) {
				RCNode next = p.next; 
				p.next= next.next;
			}else {
				p=p.next;
			}
		}
		return helper.next; // Return the starting node or the head of the list 
		
	}
}
public class RemoveElementsByValue {
	
	public static void main(String[] args) {
		RCList l = new RCList();
		l.head=new RCNode(6);
		l.head.next = new RCNode(6);
		l.head.next.next=new RCNode(1);
		l.head.next.next.next= new RCNode(2);
		System.out.println("before duplicate removal");
		l.display(l.head);
		RCNode reducedList=l.removeElements(l.head,6);
		System.out.println();
		System.out.println("After duplicate removal");
		l.display(reducedList);
	}

	
}
